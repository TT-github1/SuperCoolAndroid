package com.tthappy.supercoolandroid.application;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.Utils;
import com.tthappy.supercoolandroid.BuildConfig;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/10/12 14:29
 * Update Date:
 * Modified By:
 * Description:
 */
public class MyApplication extends Application {
    //ARouter调试开关
    private boolean isDebug = true;
    @Override
    public void onCreate() {
        super.onCreate();
        if (isDebug) {
            //以下两种属性必须在初始化之前开启
            //打印日志
            ARouter.openLog();
            //开启调试模式（如果在InstantRun模式下进行，必须开启调试模式）
            // 线上版本需要关闭，否则会有安全风险
            ARouter.openDebug();
        }

        //LogUtils的初始化，不写报错
        Utils.init(this);
        LogUtils.getConfig().setLogSwitch(BuildConfig.DEBUG);


        ARouter.init(this);
    }
}
