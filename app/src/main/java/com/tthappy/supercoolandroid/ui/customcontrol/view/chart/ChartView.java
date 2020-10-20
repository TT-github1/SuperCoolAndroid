package com.tthappy.supercoolandroid.ui.customcontrol.view.chart;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

import androidx.annotation.Nullable;

import com.tthappy.supercoolandroid.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/9/16 14:01
 * Update Date:
 * Modified By:
 * Description:
 */
public class ChartView extends View {

    private Paint paint;
    private int screenWidth;
    private int screenHeight;
    private int finalHeight;
    private List<String> listTextX;
    private List<String> listTextY;
    private int brokenLineColor;
    private int coordinateColor;
    private int textCoordinateColor;


    public ChartView(Context context) {
        super(context);
        initView();
    }

    public ChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        obtainAttributes(context,attrs);
        initView();
    }

    public ChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        obtainAttributes(context,attrs);
        initView();

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        DisplayMetrics metrics = getResources().getDisplayMetrics();
        screenWidth = metrics.widthPixels;
        screenHeight = metrics.heightPixels;

        int width;
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        if(widthMode == MeasureSpec.AT_MOST){
            width = Math.min(screenWidth,widthSize);
        }else {
            width = widthSize;
        }

        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);
        if(heightMode == MeasureSpec.AT_MOST){
            finalHeight = Math.min(screenHeight,heightSize);
        }else {
            finalHeight = heightSize;
        }

        setMeasuredDimension(width, finalHeight);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        drawCoordinate(canvas);
        drawText(canvas);
        drawBrokenLine(canvas);
    }

    private void obtainAttributes(Context context, AttributeSet attrs){
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.ChartView);
        brokenLineColor = typedArray.getColor(R.styleable.ChartView_brokenLineColor,Color.RED);
        coordinateColor = typedArray.getColor(R.styleable.ChartView_coordinateColor,Color.BLUE);
        textCoordinateColor = typedArray.getColor(R.styleable.ChartView_textCoordinateColor,Color.GREEN);
        typedArray.recycle();

    }

    private void initView() {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(8);
        paint.setTextSize(50);
    }

    private void drawCoordinate(Canvas canvas){
        Path coordinatePath = new Path();

        paint.setColor(coordinateColor);

        coordinatePath.moveTo(100,finalHeight-100);
        coordinatePath.lineTo(900,finalHeight-100);
        coordinatePath.lineTo(870,finalHeight-70);
        coordinatePath.moveTo(900,finalHeight-100);
        coordinatePath.lineTo(870,finalHeight-130);
        coordinatePath.moveTo(100,finalHeight-100);
        coordinatePath.lineTo(100,finalHeight-900);
        coordinatePath.lineTo(70,finalHeight-870);
        coordinatePath.moveTo(100,finalHeight-900);
        coordinatePath.lineTo(130,finalHeight-870);

        canvas.drawPath(coordinatePath,paint);

        paint.setPathEffect(new DashPathEffect(new float[]{4, 15}, 0));
        canvas.drawLine(100,finalHeight-300,900,finalHeight-300,paint);
        canvas.drawLine(100,finalHeight-500,900,finalHeight-500,paint);
        canvas.drawLine(100,finalHeight-700,900,finalHeight-700,paint);
        paint.setPathEffect(new DashPathEffect(new float[]{8, 0}, 0));

    }

    private void drawText(Canvas canvas){
        paint.setColor(textCoordinateColor);
        canvas.drawText("0",75,finalHeight-50,paint);

        listTextX = new ArrayList<>();
        listTextX.add("1");
        listTextX.add("2");
        listTextX.add("3");
        for (int i = 0; i < listTextX.size(); i++) {
            canvas.drawText(listTextX.get(i),300+200*i,finalHeight-50,paint);
        }

        listTextY = new ArrayList<>();
        listTextY.add("1");
        listTextY.add("2");
        listTextY.add("3");
        for (int i = 0; i < listTextY.size(); i++) {
            canvas.drawText(listTextY.get(i),50,finalHeight-300-200*i,paint);
        }
    }

    private void drawBrokenLine(Canvas canvas){
        //(0,1),(1,2),(2,1),(3,3)
        paint.setColor(brokenLineColor);

        Path brokenLinePath = new Path();
        brokenLinePath.moveTo(100,finalHeight-300);
        brokenLinePath.lineTo(300,finalHeight-500);
        brokenLinePath.lineTo(500,finalHeight-300);
        brokenLinePath.lineTo(700,finalHeight-700);
        canvas.drawPath(brokenLinePath,paint);

        paint.setStyle(Paint.Style.FILL);

        canvas.drawOval(90,finalHeight-310,110,finalHeight-290,paint);
        canvas.drawOval(290,finalHeight-510,310,finalHeight-490,paint);
        canvas.drawOval(490,finalHeight-310,510,finalHeight-290,paint);
        canvas.drawOval(690,finalHeight-710,710,finalHeight-690,paint);
    }
}
