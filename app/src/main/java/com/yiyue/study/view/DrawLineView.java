package com.yiyue.study.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 绘制线
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
        paint.setStrokeWidth(20);
        paint.setColor(Color.parseColor("#30acf4"));
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        canvas.drawLine(100,130,500,130,paint);

        Paint paint1 = new Paint();
        paint1.setStrokeWidth(20);
        paint1.setStrokeCap(Paint.Cap.ROUND);
        paint1.setColor(Color.parseColor("#30acf4"));
        paint1.setAntiAlias(true);
        canvas.drawLine(200,300,500,600,paint1);

        Paint paint2 = new Paint();
        paint2.setStrokeWidth(20);
        paint2.setStrokeCap(Paint.Cap.BUTT);
        paint2.setColor(Color.parseColor("#30acf4"));
        paint2.setAntiAlias(true);
        float[] lines = {600,600,900,600,900,600,900,900,900,900,600,900,600,900,600,600};
        canvas.drawLines(lines,paint2);

    }
}
