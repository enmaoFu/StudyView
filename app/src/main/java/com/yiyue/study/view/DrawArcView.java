package com.yiyue.study.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 画扇形或弧形
 */

public class DrawArcView extends View{

    public DrawArcView(Context context) {
        super(context);
    }

    public DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint mPaint = new Paint();

        /*Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.parseColor("#30acf4"));

        canvas.drawArc(200, 200, 800, 300, -110, 100,true,paint);*/

        // 绘制背景矩形
        mPaint.setColor(Color.GRAY);
        canvas.drawRect(100,100,400,400,mPaint);

        // 绘制圆弧
        mPaint.setColor(Color.parseColor("#30acf4"));
        canvas.drawArc(100,100,400,400,0,90,true,mPaint);
        Paint paint1 = new Paint();
        paint1.setColor(Color.parseColor("#F76937"));
        canvas.drawArc(100,100,400,400,90,90,true,paint1);
        Paint paint2 = new Paint();
        paint2.setColor(Color.parseColor("#2CB044"));
        canvas.drawArc(100,100,400,400,180,30,true,paint2);
        Paint paint3 = new Paint();
        paint3.setColor(Color.parseColor("#FFE680"));
        canvas.drawArc(100,100,400,400,210,90,true,paint3);
        Paint paint4 = new Paint();
        paint4.setColor(Color.parseColor("#E81010"));
        canvas.drawArc(100,100,400,400,300,60,true,paint4);

        //-------------------------------------

        Paint paint5 = new Paint();
        // 绘制背景矩形
        paint5.setColor(Color.WHITE);
        canvas.drawRect(600,600,900,900,paint5);

        // 绘制圆弧
        Paint paint6 = new Paint();
        paint6.setColor(Color.parseColor("#30acf4"));
        paint6.setAntiAlias(true);
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeWidth(0);
        canvas.drawArc(600,600,900,900,0,90,true,paint6);

        Paint paint7 = new Paint();
        // 绘制背景矩形
        paint7.setColor(Color.WHITE);
        canvas.drawRect(100,500,400,800,paint7);

        // 绘制圆弧
        Paint paint8 = new Paint();
        paint8.setColor(Color.parseColor("#30acf4"));
        paint8.setAntiAlias(true);
        paint8.setStyle(Paint.Style.STROKE);
        paint8.setStrokeWidth(0);
        canvas.drawArc(100,500,400,800,0,90,false,paint8);

    }
}
