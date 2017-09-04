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
        paint.setAntiAlias(true);
        paint.setColor(Color.parseColor("#30acf4"));
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(5);

        canvas.drawOval(60,120,180,360,paint);



        Paint paint1 = new Paint();
        paint1.setAntiAlias(true);
        paint1.setColor(Color.parseColor("#30acf4"));
        paint1.setStyle(Paint.Style.STROKE);
        paint1.setStrokeWidth(2);

        canvas.drawOval(180,240,540,720,paint1);

    }
}
