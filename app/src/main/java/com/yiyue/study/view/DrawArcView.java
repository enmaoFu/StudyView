package com.yiyue.study.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 绘制扇形或者弧形
 */

public class DrawArcView extends View {
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

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#FEFE37"));
        paint.setAntiAlias(true);
        canvas.drawRect(100,100,600,600,paint);

        Paint paint1 = new Paint();
        paint1.setStyle(Paint.Style.FILL);
        paint1.setColor(Color.parseColor("#30acf4"));
        paint1.setAntiAlias(true);
        canvas.drawArc(100,100,600,600,0,90,true,paint1);

        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(1);
        paint2.setColor(Color.parseColor("#30acf4"));
        paint2.setAntiAlias(true);
        canvas.drawArc(100,100,600,600,90,90,false,paint2);

        Paint paint3 = new Paint();
        paint3.setStyle(Paint.Style.FILL);
        paint3.setStrokeWidth(1);
        paint3.setColor(Color.parseColor("#30acf4"));
        paint3.setAntiAlias(true);
        canvas.drawArc(100,100,600,600,180,180,true,paint3);

    }
}
