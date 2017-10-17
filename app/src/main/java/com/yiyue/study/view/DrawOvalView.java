package com.yiyue.study.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 绘制椭圆
 */

public class DrawOvalView extends View{
    public DrawOvalView(Context context) {
        super(context);
    }

    public DrawOvalView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawOvalView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#30acf4"));
        paint.setAntiAlias(true);
        canvas.drawOval(100,100,300,500,paint);

        Paint paint1 = new Paint();
        paint1.setStyle(Paint.Style.STROKE);
        paint1.setColor(Color.parseColor("#30acf4"));
        paint1.setStrokeWidth(30);
        paint1.setAntiAlias(true);
        canvas.drawOval(500,400,600,800,paint1);

    }
}
