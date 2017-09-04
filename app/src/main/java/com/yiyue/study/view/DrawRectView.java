package com.yiyue.study.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 矩形
 */

public class DrawRectView extends View{

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

        canvas.drawRect(100,100,500,500,paint);



        Paint paint1 = new Paint();
        paint1.setStyle(Paint.Style.STROKE);
        paint1.setColor(Color.parseColor("#30acf4"));
        paint1.setAntiAlias(true);
        paint1.setStrokeWidth(10);

        canvas.drawRect(600,100,1000,1000,paint1);

    }
}
