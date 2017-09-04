package com.yiyue.study.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 画点
 */

public class DrawPointView extends View {

    public DrawPointView(Context context) {
        super(context);
    }

    public DrawPointView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.parseColor("#30acf4"));
        //设置点的大小
        paint.setStrokeWidth(50);
        //设置点的形状
        //ROUND 画出来是圆形的点，SQUARE 或 BUTT 画出来是方形的点
        //注：Paint.setStrokeCap(cap) 可以设置点的形状，但这个方法并不是专门用来设置点的形状的，而是一个设置线条端点形状的方法。
        // 端点有圆头 (ROUND)、平头 (BUTT) 和方头 (SQUARE) 三种
        paint.setStrokeCap(Paint.Cap.ROUND);

        canvas.drawPoint(600,600,paint);



        Paint paint1 = new Paint();
        paint1.setAntiAlias(true);
        paint1.setColor(Color.parseColor("#30acf4"));
        paint1.setStrokeWidth(50);
        paint1.setStrokeCap(Paint.Cap.BUTT);

        canvas.drawPoint(400,400,paint1);



        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(Color.parseColor("#30acf4"));
        paint2.setStrokeWidth(20);
        paint2.setStrokeCap(Paint.Cap.ROUND);

        float[] points = {0, 0, 50, 50, 50, 100, 100, 50, 100, 100, 150, 50, 150, 100};

        /**
         * 第二个参数表示跳过数组的前几个数再开始记坐标
         * 第三个参数表示一共要绘制几个点,用2计数。比如绘制4个点，那么就是8
         */
        canvas.drawPoints(points,2,8,paint2);
    }
}
