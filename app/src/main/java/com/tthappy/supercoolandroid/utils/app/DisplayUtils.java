package com.tthappy.supercoolandroid.utils.app;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.core.content.ContextCompat;

import com.tthappy.supercoolandroid.R;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/10/29 11:15
 * Update Date:
 * Modified By:
 * Description:
 */
public class DisplayUtils {

    public static int getStatusBarHeight(Context context){
        int result = 0;
        int resultId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if(result > 0){
            result = context.getResources().getDimensionPixelSize(resultId);
        }
        return result;
    }

    public static void setStatusBarColor(Context context, int color){
        if(context instanceof Activity){
            Window window = ((Activity) context).getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(ContextCompat.getColor(context, color));
        }else {
            Log.e("superCool", "你介传进来的context是个嘛玩意儿，俺要的是acticity的context");
        }
    }

    public static void hideStatusBar(Context context){
        if(context instanceof Activity){
            Window window = ((Activity) context).getWindow();
            View decorView = window.getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }
    }

    public static void hideStatusBar2(Context context){
        if(context instanceof Activity){
            Window window = ((Activity) context).getWindow();
            window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

//            View decorView = window.getDecorView();
//            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
//            decorView.setSystemUiVisibility(option);
//            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//            window.setStatusBarColor(Color.TRANSPARENT);

            WindowManager.LayoutParams lp = window.getAttributes();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                lp.layoutInDisplayCutoutMode = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;
            }
            window.setAttributes(lp);

            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
        }
    }


    /*----------------------------------------------------- super cool divider ------------------------------------------------------*/



    public static void hideDialogStatusBar(Window window){
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        window.getDecorView().setPadding(0, 0, 0, 0);
//        window.getDecorView().setBackgroundColor(context.getColor(R.color.testColor1));
        WindowManager.LayoutParams layoutParams = window.getAttributes();
        layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT;
        layoutParams.height = WindowManager.LayoutParams.MATCH_PARENT;
        window.setStatusBarColor(Color.TRANSPARENT);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            // 延伸显示区域到刘海
            WindowManager.LayoutParams lp = window.getAttributes();
            lp.layoutInDisplayCutoutMode = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;
            window.setAttributes(lp);
            // 设置页面全屏显示
            final View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
        }
        window.setAttributes(layoutParams);

//        Window window = getWindow();
//        if (window != null) {
//            window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//            window.getDecorView().setPadding(0, 0, 0, 0);
//            window.getDecorView().setBackgroundColor(getContext().getColor(R.color.shadow_guide));
//            WindowManager.LayoutParams layoutParams = window.getAttributes();
//            layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT;
//            layoutParams.height = WindowManager.LayoutParams.MATCH_PARENT;
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
//                // 延伸显示区域到刘海
//                WindowManager.LayoutParams lp = window.getAttributes();
//                lp.layoutInDisplayCutoutMode = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;
//                window.setAttributes(lp);
//                // 设置页面全屏显示
//                final View decorView = window.getDecorView();
//                decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
//            }
//            window.setAttributes(layoutParams);
//        }
    }



}
