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
 * 画自定义图型，路径绘制3
 */

public class DrawPathView3 extends View {
    public DrawPathView3(Context context) {
        super(context);
    }

    public DrawPathView3(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawPathView3(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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

        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#30acf4"));
        paint.setAntiAlias(true);

        // 由当前位置 (0, 0) 向 (500, 500) 画一条直线
        path.lineTo(500, 500);
        // 由当前位置 (100, 100) 向正右方 300 像素的位置画一条直线
        path.rLineTo(300,0);

        //移动到目标位置,作为绘制的起点
        path1.moveTo(600,700);
        //由(600,600)开始画线
        path1.lineTo(300,700);

        path2.moveTo(600,900);
        path2.lineTo(600,1000);
        // 直接连线连到弧形起点（有痕迹）
        path2.arcTo(600,600,1000,1000,0,90,false);
        // 强制移动到弧形起点（无痕迹）
        //path2.arcTo(600,600,1000,1000,0,90,true);

        path3.moveTo(100,800);
        path3.lineTo(300,800);
        path3.lineTo(150,900);
        //封闭当前子图形
        path3.close();

        canvas.drawPath(path,paint);
        canvas.drawPath(path1,paint);
        canvas.drawPath(path2,paint);
        canvas.drawPath(path3,paint);

    }
}
