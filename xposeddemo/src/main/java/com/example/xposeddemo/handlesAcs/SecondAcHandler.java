package com.example.xposeddemo.handlesAcs;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;

import com.example.xposeddemo.utils.CLogUtils;

import com.zhenxi.Superappium.PageManager;
import com.zhenxi.Superappium.ViewImage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;

/**
 * @author Zhenxi on 2020-07-03
 */
public class SecondAcHandler implements PageManager.ActivityFocusHandler {

    private static int shadeBitmapX;
    private static int shadeBitmapY;


    static {

        //对滑块进行Hook 方法两种重构类型
        XposedBridge.hookAllMethods(Canvas.class, "drawBitmap",
                new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                        super.afterHookedMethod(param);
                        if (PageManager.getTopActivity().getClass().getName().equals("com.example.xposedappium.ui.login.SecondActivity")) {

                            if (param.args[1] instanceof Float) {
                                //public void drawBitmap(@NonNull Bitmap bitmap, float left, float top, @Nullable Paint paint)
                                Bitmap bitmap = (Bitmap) param.args[0];
                                //获取View中心点
                                float left = (float) param.args[1];
                                float top = (float) param.args[2];
//                                ImageView imageView = new ImageView(PageManager.getContext());
//                                imageView.setImageBitmap(bitmap);

                                shadeBitmapX = (int) ( + bitmap.getWidth() / 2);
                                shadeBitmapY = (int) (top + bitmap.getHeight() / 2);


                                CLogUtils.e("中心点Y " + left);
                                CLogUtils.e("中心点X " + top);

                            } else {
                                //public void drawBitmap(@NonNull Bitmap bitmap, @Nullable Rect src, @NonNull Rect dst,@Nullable Paint paint)

                            }
                        }
                    }
                }
        );

    }

    @Override
    public boolean handleActivity(Activity activity, ViewImage root) {
        //点击确定按钮 可以根据ID查找或者其他属性查找
        //boolean isSucess = root.clickByXpath("//android.widget.Button[@id='android:id/button1']");
        boolean isSucess = root.clickByXpath("//android.widget.Button[@text='确定']");
        CLogUtils.e("点击按钮完毕 " + isSucess);

        return true;
    }
}
