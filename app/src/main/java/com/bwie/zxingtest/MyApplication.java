package com.bwie.zxingtest;

import android.app.Application;

import com.uuzuche.lib_zxing.activity.ZXingLibrary;

/**
 * Created by lq on 2017/1/6.
 * 作者：栗启
 * 作用：
 */
public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
 /*
        * 初始化二维码
        */
        ZXingLibrary.initDisplayOpinion(this);
    }
}
