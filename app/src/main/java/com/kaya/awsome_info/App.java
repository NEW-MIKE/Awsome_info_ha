package com.kaya.awsome_info;

import android.app.Application;


public class App extends Application {
    private static App mApp;
    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this;
    }

    public static synchronized App getInstance() {
        return mApp;
    }
}
