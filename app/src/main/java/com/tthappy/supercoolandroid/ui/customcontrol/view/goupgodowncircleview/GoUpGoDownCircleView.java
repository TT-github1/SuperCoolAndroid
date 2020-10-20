package com.tthappy.supercoolandroid.ui.customcontrol.view.goupgodowncircleview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/9/16 14:49
 * Update Date:
 * Modified By:
 * Description:
 */
public class GoUpGoDownCircleView extends View {
    private Canvas mainCanvas;
    private Paint paint;
    private float littleOvalLeft = 200;
    private float littleOvalTop = 200;
    private float littleOvalRight = 300;
    private float littleOvalBottom = 300;

    private float hugeOvalLeft = 0;
    private float hugeOvalTop = 0;
    private float hugeOvalRight = 500;
    private float hugeOvalBottom = 500;
    private float hugeOvalCurrentX = 0;
    private float hugeOvalCurrentY = 0;
    private double toCirclePointWidth;
    private RectF hugeOval = new RectF();

    private RectF littleOval = new RectF();

    public GoUpGoDownCircleView(Context context) {
        super(context);
    }

    public GoUpGoDownCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public GoUpGoDownCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        paint.setColor(Color.rgb((int)Math.random()*255,(int)Math.random()*255,(int)Math.random()*255));
//        paint.setStyle(Paint.Style.FILL_AND_STROKE);

        littleOval.left = this.littleOvalLeft;
        littleOval.top = this.littleOvalTop;
        littleOval.right = this.littleOvalRight;
        littleOval.bottom = this.littleOvalBottom;
        canvas.drawOval(littleOval,paint);

//        paint.setColor(Color.BLACK);
//        paint.setStyle(Paint.Style.STROKE);

        hugeOval.left = this.hugeOvalLeft;
        hugeOval.top = this.hugeOvalTop;
        hugeOval.right = this.hugeOvalRight;
        hugeOval.bottom = this.hugeOvalBottom;
        canvas.drawOval(hugeOval,paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()){
            case  MotionEvent.ACTION_DOWN:
                hugeOvalCurrentX = event.getRawX();
                hugeOvalCurrentY = event.getRawY();

                hugeOvalLeft = event.getRawX()-250;
                hugeOvalTop = event.getRawY()-300;
                hugeOvalRight = event.getRawX()+250;
                hugeOvalBottom = event.getRawY()+200;

                littleOvalLeft = event.getRawX()-50;
                littleOvalTop = event.getRawY()-100;
                littleOvalRight = event.getRawX()+50;
                littleOvalBottom = event.getRawY();
                postInvalidate();



                break;
            case MotionEvent.ACTION_MOVE:
                toCirclePointWidth = Math.sqrt((hugeOvalCurrentX-event.getRawX())*(hugeOvalCurrentX-event.getRawX())+(hugeOvalCurrentY-event.getRawY())*(hugeOvalCurrentY-event.getRawY()));
                if(toCirclePointWidth + 50 <= 250){
                    littleOvalLeft = event.getRawX()-50;
                    littleOvalTop = event.getRawY()-100;
                    littleOvalRight = event.getRawX()+50;
                    littleOvalBottom = event.getRawY();
                    postInvalidate();
                }else {
                    double widthwidth = Math.abs(hugeOvalCurrentX - event.getRawX());
                    double heightheight = Math.abs(hugeOvalCurrentY - event.getRawY());

                    double littleOvalXWidth = widthwidth*200/toCirclePointWidth;
                    double littleOvalYHeight = heightheight*200/toCirclePointWidth;

                    if(hugeOvalCurrentX > event.getRawX()){
                        littleOvalLeft = (float) (hugeOvalCurrentX - littleOvalXWidth-50);
                        littleOvalRight = (float) (hugeOvalCurrentX - littleOvalXWidth+50);
                    }else {
                        littleOvalLeft = (float) (hugeOvalCurrentX + littleOvalXWidth-50);
                        littleOvalRight = (float) (hugeOvalCurrentX  + littleOvalXWidth+50);
                    }

                    if(hugeOvalCurrentY > event.getRawY()){
                        littleOvalTop = (float) (hugeOvalCurrentY - littleOvalYHeight-100);
                        littleOvalBottom = (float) (hugeOvalCurrentY - littleOvalYHeight);
                    }else {
                        littleOvalTop = (float) (hugeOvalCurrentY + littleOvalYHeight-100);
                        littleOvalBottom = (float) (hugeOvalCurrentY + littleOvalYHeight);
                    }
                    postInvalidate();


                }
                break;
            case MotionEvent.ACTION_UP:
                break;
        }
        return true;
    }

    private void initView(){
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
    }
}
