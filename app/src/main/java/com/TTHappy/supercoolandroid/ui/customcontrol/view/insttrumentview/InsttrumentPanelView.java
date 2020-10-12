package com.TTHappy.supercoolandroid.ui.customcontrol.view.insttrumentview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/9/17 18:43
 * Update Date:
 * Modified By:
 * Description:
 */
public class InsttrumentPanelView extends View implements View.OnClickListener{

    private Paint paint;
    private float pointX;
    private float pointY;
    private String text = "000";
    private RectF oval;

    public InsttrumentPanelView(Context context) {
        super(context);
    }

    public InsttrumentPanelView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
        setOnClickListener(this);
    }

    public InsttrumentPanelView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        pointX = getWidth()/2f - (float) (Math.cos(Math.toRadians(222-180)) * 300);
        pointY = getHeight()/2f + (float) (Math.sin((222-180)/180f*Math.PI) * 300);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        if(null == oval){
            oval = new RectF(getWidth()/2f-300, getHeight()/2f-300, getWidth()/2f+300, getHeight()/2f+300);
        }

        paint.setColor(Color.BLUE);
        canvas.drawArc(oval,135,270,false,paint);
        paint.setColor(Color.RED);

        canvas.drawLine(getWidth()/2f,getHeight()/2f,pointX,pointY,paint);

        paint.setTextSize(240);
        canvas.drawText(text, getWidth()/2f-180,getHeight()/2f+450, paint);
    }

    private void initPaint() {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(30);
        paint.setColor(Color.BLUE);
    }

    @Override
    public void onClick(View view) {
        ValueAnimator animator = ValueAnimator.ofInt(222, 50);
        animator.setDuration(4000);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int current = (int)valueAnimator.getAnimatedValue();
                if(current<=90){
                    pointX = getWidth()/2f + (float) (Math.cos(Math.toRadians(current)) * 300);
                    pointY = getHeight()/2f - (float) (Math.sin(current/180f*Math.PI) * 300);
                }else if(current<=180){
                    pointX = getWidth()/2f - (float) (Math.sin(Math.toRadians(current-90)) * 300);
                    pointY = getHeight()/2f - (float) (Math.cos((current-90)/180f*Math.PI) * 300);
                }else if(current<=270){
                    pointX = getWidth()/2f - (float) (Math.cos(Math.toRadians(current-180)) * 300);
                    pointY = getHeight()/2f + (float) (Math.sin((current-180)/180f*Math.PI) * 300);
                }else if(current<=360){
                    pointX = getWidth()/2f + (float) (Math.sin(Math.toRadians(current-270)) * 300);
                    pointY = getHeight()/2f + (float) (Math.cos((current-270)/180f*Math.PI) * 300);
                }

                if((222-current)<10){
                    text ="00" + String.valueOf(222-current);
                }else if((222-current)<100){
                    text ="0" + String.valueOf(222-current);
                }else {
                    text = String.valueOf(222-current);
                }

//                Log.e("hhh", "current:" + String.valueOf(current) + "pointX:" + pointX + "pointY:" + pointY);

                invalidate();
            }
        });
        animator.start();
    }
}

