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
 * 画自定义图形
 */

public class DrawPathView1 extends View{

    public DrawPathView1(Context context) {
        super(context);
    }

    public DrawPathView1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawPathView1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //初始化画笔
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.parseColor("#30acf4"));

        //初始化路径
        Path path = new Path();
        // 使用 path 对图形进行描述
        path.addCircle(100,100,60,Path.Direction.CCW);

        canvas.drawPath(path,paint);




        Paint paint1 = new Paint();
        paint1.setAntiAlias(true);
        paint1.setColor(Color.parseColor("#30acf4"));
        paint1.setStyle(Paint.Style.STROKE);

        Path path1 = new Path();
        //从当前位置向目标位置画一条直线 所谓当前位置，即最后一次调用画 Path 的方法的终点位置。初始值为原点 (0, 0)。
        path1.lineTo(500,20);
        //由当前位置 (100, 100) 向正右方 100 像素的位置画一条直线
        path1.rLineTo(100,220);
        path1.lineTo(0,220);

        canvas.drawPath(path1,paint1);




        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(Color.parseColor("#30acf9"));
        paint2.setStyle(Paint.Style.STROKE);

        Path path2 = new Path();
        //不论是直线还是贝塞尔曲线，都是以当前位置作为起点，而不能指定起点。
        // 但你可以通过 moveTo(x, y) 或 rMoveTo() 来改变当前位置，从而间接地设置这些方法的起点。
        path2.moveTo(800,300);
        path2.lineTo(800,800);
        path2.lineTo(600,800);
        path2.moveTo(1000,300);
        path2.lineTo(1000,600);

        canvas.drawPath(path2,paint2);



        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setColor(Color.parseColor("#30acf9"));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeCap(Paint.Cap.BUTT);
        paint3.setStrokeWidth(20);

        Path path3 = new Path();
        path3.moveTo(400,400);
        path3.lineTo(600,400);
        //arcTo() 只用来画弧形而不画扇形，所以不再需要 useCenter 参数；
        // 而多出来的这个 forceMoveTo 参数的意思是，绘制是要「抬一下笔移动过去」，还是「直接拖着笔过去」，区别在于是否留下移动的痕迹（就是是否连接起来）。
        path3.arcTo(300,300,700,700,0,90,false);
        //画一条线再回到400,400坐标
        //path3.lineTo(400,400);
        //封闭当前子图形
        path3.close();

        canvas.drawPath(path3,paint3);

    }
}
