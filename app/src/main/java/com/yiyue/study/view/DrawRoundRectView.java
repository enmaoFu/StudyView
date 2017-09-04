package com.yiyue.study.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 画椭圆
 */

public class DrawRoundRectView extends View{

    public DrawRoundRectView(Context context) {
        super(context);
    }

    public DrawRoundRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawRoundRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#30acf4"));

        canvas.drawRoundRect(100,100,400,400,50,50,paint);




        Paint paint1 = new Paint();
        paint1.setAntiAlias(true);
        paint1.setStyle(Paint.Style.STROKE);
        paint1.setColor(Color.parseColor("#30acf4"));
        paint1.setStrokeWidth(5);

        canvas.drawRoundRect(500,500,800,800,50,50,paint1);

    }
}
