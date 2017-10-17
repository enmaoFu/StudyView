package com.yiyue.study.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 画自定义图型，路径绘制2
 */

public class DrawPathView2 extends View{
    public DrawPathView2(Context context) {
        super(context);
    }

    public DrawPathView2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawPathView2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        Path path = new Path();
        Path path1 = new Path();
        Path path2 = new Path();
        Path path3 = new Path();

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#30acf4"));
        paint.setAntiAlias(true);

        path.addCircle(100,100,60, Path.Direction.CW);

        path1.addOval(200,200,360,590,Path.Direction.CW);

        path2.addRect(400,400,560,550,Path.Direction.CW);

        path3.addRoundRect(600,600,700,800,50,50, Path.Direction.CW);

        canvas.drawPath(path,paint);
        canvas.drawPath(path1,paint);
        canvas.drawPath(path2,paint);
        canvas.drawPath(path3,paint);

    }
}
