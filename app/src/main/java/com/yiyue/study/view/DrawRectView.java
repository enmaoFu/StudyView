package com.yiyue.study.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 绘制矩形
 */

public class DrawRectView extends View {
    public DrawRectView(Context context) {
        super(context);
    }

    public DrawRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#30acf4"));
        paint.setAntiAlias(true);
        canvas.drawRect(20,20,300,150,paint);

        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(10);
        paint2.setColor(Color.parseColor("#30acf4"));
        paint2.setAntiAlias(true);
        canvas.drawRect(50,260,400,400,paint2);

        Paint paint3 = new Paint();
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(10);
        paint3.setColor(Color.parseColor("#30acf4"));
        paint3.setAntiAlias(true);
        canvas.drawRect(70,280,380,380,paint3);

        Paint paint4 = new Paint();
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeWidth(10);
        paint4.setColor(Color.parseColor("#30acf4"));
        paint4.setAntiAlias(true);
        canvas.drawRect(90,300 ,360,360,paint4);

    }
}
