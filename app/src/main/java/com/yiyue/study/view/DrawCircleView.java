package com.yiyue.study.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 绘制圆
 */

public class DrawCircleView extends View{

    public DrawCircleView(Context context) {
        super(context);
    }

    public DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //创建画笔
        Paint paint = new Paint();
        //设置绘制模式
        paint.setStyle(Paint.Style.FILL);
        //设置颜色
        paint.setColor(Color.parseColor("#30acf4"));
        //设置是否开启抗锯齿
        paint.setAntiAlias(true);
        //设置线条宽度
        paint.setStrokeWidth(5);
        canvas.drawCircle(50,50,30,paint);

        Paint paint1 = new Paint();
        paint1.setStyle(Paint.Style.STROKE);
        paint1.setStrokeWidth(5);
        paint1.setAntiAlias(true);
        paint1.setColor(Color.parseColor("#30acf4"));
        canvas.drawCircle(120,300,60,paint1);

    }
}
