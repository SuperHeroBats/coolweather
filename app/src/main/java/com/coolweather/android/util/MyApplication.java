package com.coolweather.android.util;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;
import org.litepal.LitePalApplication;

public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        LitePal.initialize(context);   //每个项目只能配置一个Application 可以通过这里实例化
    }

    public static Context getContext(){
        return context;
    }

}
