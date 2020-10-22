package com.tthappy.supercoolandroid.ui.test.classtest;

import android.util.Log;

public class NormalTest {
    String testString1;
    String testString2 = "testString2";
    SbTest sb;
    {
        String testString3 = "NO.3";
        String testString4 = null;
        if(null == testString1) Log.e("hhh", "testString1");
        Log.e("hhh", testString2);
        Log.e("hhh", testString3);
        if(null == testString4) Log.e("hhh", "testString4 is null");
//        if(null == testString5) Log.e("hhh", "testString5 can not log");
//        Log.e("hhh", testString6);

        sb = new SbTest();
        sb.sb = "lll";
    }
    String testString5 = null;
    String testString6 = "testString6";

    public NormalTest(){
        String testString5 = null;
        String testString6 = "testString6";
        Log.e("hhh", sb.sb);
    }

    public static void first(){
        Log.e("hhh","first" + third);
    }

    public static String third = "third";

    static {
        Log.e("hhh", third);
        Log.e("hhh","static");
    }



    public static void second(){
        Log.e("hhh","second");
    }
}
