package com.example.administrator.a;

import android.app.Application;

import org.xutils.x;

/**
 * date:2017/5/27 0027
 * authom:贾雪茹
 * function:
 */

public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(false);
    }
}
