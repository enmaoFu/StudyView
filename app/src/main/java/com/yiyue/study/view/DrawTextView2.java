package com.yiyue.study.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 沿着一条 Path 来绘制文字 drawTextOnPath
 */

public class DrawTextView2 extends View{
    public DrawTextView2(Context context) {
        super(context);
    }

    public DrawTextView2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawTextView2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#30acf4"));
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setTextSize(100);

        String str = "HelloWorldHelloWorld";

        Path path = new Path();
        path.moveTo(50,100);
        path.lineTo(100,200);
        path.lineTo(150,160);
        path.lineTo(300,230);
        path.lineTo(600,500);
        path.lineTo(800,400);

        //给线设置圆角
        PathEffect pathEffect = new CornerPathEffect(20);
        paint.setPathEffect(pathEffect);

        canvas.drawPath(path,paint);
        canvas.drawTextOnPath(str,path,0,0,paint);
    }
}
