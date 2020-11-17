package com.tthappy.supercoolandroid.ui.test.classtest;

import android.util.Log;

import com.blankj.utilcode.util.LogUtils;
import com.tthappy.supercoolandroid.ui.test.classtest.NormalTest;
import com.tthappy.supercoolandroid.ui.test.classtest2.SbTest;

public class DaChongMingTest {
    public DaChongMingTest(){
        SbTest normalTest = new SbTest();
        int ii = normalTest.getI();
        Log.e("hhh" , ii+"");
    }
}
