package com.yiyue.study.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 绘制点
 */

public class DrawPointViwe extends View{
    public DrawPointViwe(Context context) {
        super(context);
    }

    public DrawPointViwe(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawPointViwe(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setColor(Color.parseColor("#30acf4"));
        paint.setStrokeWidth(50);
        paint.setAntiAlias(true);
        canvas.drawPoint(200,100,paint);

        Paint paint1 = new Paint();
        paint1.setStyle(Paint.Style.STROKE);
        paint1.setStrokeCap(Paint.Cap.ROUND);
        paint1.setColor(Color.parseColor("#30acf4"));
        paint1.setStrokeWidth(50);
        paint1.setAntiAlias(true);
        canvas.drawPoint(200,200,paint1);

        float[] points = {0, 0, 300, 300, 500, 300, 300, 500, 500, 500, 700, 500, 150, 100};
        // 绘制5个点：(300, 300) (500, 300) (300, 500) (500, 500) (500, 700)
        canvas.drawPoints(points,2/* 跳过两个数，即前两个 0 */,10/* 一共绘制 10 个数（5 个点）*/,paint1);

    }
}
