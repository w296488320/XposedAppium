package com.example.xposeddemo.handlesAcs;

import android.app.Activity;

import com.zhenxi.Superappium.PageManager;
import com.zhenxi.Superappium.ViewImage;

/**
 * @author Zhenxi on 2020-07-03
 */
public class LoginAcHandler implements PageManager.ActivityFocusHandler {

    @Override
    public boolean handleActivity(Activity activity, ViewImage root) {


        //get View
        ViewImage username = root.xpath2One("//android.widget.EditText[@id='com.example.xposedappium:id/username']");
        username.setText("123456");

        ViewImage password = root.xpath2One("//android.widget.EditText[@id='com.example.xposedappium:id/password']");
        password.setText("123456");
        //get and click View
        root.clickByXpath("//android.widget.Button[@id='com.example.xposedappium:id/login']");

        //判断是否消费此次事件，返回false则再次执行
        return true;
    }
}
