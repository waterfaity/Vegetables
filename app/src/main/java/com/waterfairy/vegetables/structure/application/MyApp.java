package com.waterfairy.vegetables.structure.application;

import android.app.Application;

/**
 * user : water_fairy
 * email:995637517@qq.com
 * date :2018/3/13
 * des  :
 */

public class MyApp extends Application {
    private static MyApp myApp;

    @Override
    public void onCreate() {
        super.onCreate();
        myApp = this;
    }

    public static MyApp getApp() {
        return myApp;
    }

}
