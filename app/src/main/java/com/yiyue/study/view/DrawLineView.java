package com.yiyue.study.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 画线
 */

public class DrawLineView extends View{

    public DrawLineView(Context context) {
        super(context);
    }

    public DrawLineView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawLineView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.parseColor("#30acf4"));
        paint.setStrokeWidth(20);
        paint.setStrokeCap(Paint.Cap.ROUND);

        canvas.drawLine(100,300,500,420,paint);



        Paint paint1 = new Paint();
        paint1.setAntiAlias(true);
        paint1.setColor(Color.parseColor("#30acf4"));
        paint1.setStrokeWidth(20);
        paint1.setStrokeCap(Paint.Cap.BUTT);

        canvas.drawLine(160,300,500,720,paint1);



        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(Color.parseColor("#30acf4"));
        paint2.setStrokeWidth(5);
        paint2.setStrokeCap(Paint.Cap.BUTT);

        float[] points = {20, 20, 120, 20, 70, 20, 70, 120, 20, 120, 120, 120, 150, 20, 250, 20, 150, 20, 150, 120, 250, 20, 250, 120, 150, 120, 250, 120};
        canvas.drawLines(points,paint2);

    }
}
