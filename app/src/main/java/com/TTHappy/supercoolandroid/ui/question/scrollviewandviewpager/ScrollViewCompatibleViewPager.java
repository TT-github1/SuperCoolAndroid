package com.TTHappy.supercoolandroid.ui.question.scrollviewandviewpager;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/10/20 14:31
 * Update Date:
 * Modified By:
 * Description:
 */
public class ScrollViewCompatibleViewPager extends ViewPager {
    View child;
    private int downX;
    private int downY;

    public ScrollViewCompatibleViewPager(@NonNull Context context) {
        super(context);
    }

    public ScrollViewCompatibleViewPager(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public void measureChild(Context context, View child){
        int childWidth = child.getWidth();
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e("hhh","hhh");
                downX = (int) event.getRawX();
                downY = (int) event.getRawY();
                break;
            case MotionEvent.ACTION_MOVE:

                int moveX = (int) event.getRawX();
                int moveY = (int) event.getRawY();


                int widthScreen = getResources().getDisplayMetrics().widthPixels;
                int widthChild = child.getWidth();

                Log.e("hhh","downX-moveX:" + (downX-moveX) + "widthChild-widthScreen:" + (widthChild-widthScreen));

                if(downX-moveX > widthChild-widthScreen){
                    return true;
                }

                break;
            case MotionEvent.ACTION_UP:
                break;
        }
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e("hhh","hhh");
                downX = (int) event.getRawX();
                downY = (int) event.getRawY();
                break;
            case MotionEvent.ACTION_MOVE:
                int moveX = (int) event.getRawX();
                int moveY = (int) event.getRawY();


                int widthScreen = getResources().getDisplayMetrics().widthPixels;
                int widthChild = child.getWidth();

                Log.e("hhh","downX-moveX:" + (downX-moveX) + "widthChild-widthScreen:" + (widthChild-widthScreen));

                if(downX-moveX > widthChild-widthScreen){
                    return true;
                }
                break;
            case MotionEvent.ACTION_UP:
                break;
        }
        return true;
    }

    public void attachView(View view){
        child = view;
    }
}
