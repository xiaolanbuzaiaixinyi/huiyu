package com.huabeina.pll.huiyu.utils;

import android.app.Application;

/**
 * Created by pll on 2016/9/26.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CUtils.init(this);
    }
}
