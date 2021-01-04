package com.example.xposeddemo;

import com.example.xposeddemo.handlesAcs.LoginAcHandler;
import com.example.xposeddemo.handlesAcs.SecondAcHandler;
import com.example.xposeddemo.utils.CLogUtils;

import com.zhenxi.Superappium.PageManager;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

/**
 * @author Zhenxi on 2020-07-03
 */
public class LHook implements IXposedHookLoadPackage {


    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {

        if (lpparam.processName.equals("com.example.xposedappium")) {
            CLogUtils.e("发现匹配的App");
            //设置页面Handler 两秒后开始执行
            PageManager.setTaskDuration(2000);
            //添加需要处理的Activity
            AddHandleActivity();

        }
    }

    private void AddHandleActivity() {
        PageManager.addHandler("com.example.xposedappium.ui.login.LoginActivity",
                new LoginAcHandler());
        PageManager.addHandler("com.example.xposedappium.ui.login.SecondActivity",
                new SecondAcHandler());
        CLogUtils.e("AddHandleActivity 注册完毕 ");
    }
}
