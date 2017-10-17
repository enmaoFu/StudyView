package com.yiyue.study.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Paint 着色器 Shader 的使用
 */

public class DrawPathViewShader1 extends View {
    public DrawPathViewShader1(Context context) {
        super(context);
    }

    public DrawPathViewShader1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawPathViewShader1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);

        Paint paint1 = new Paint();
        paint1.setAntiAlias(true);
        paint1.setStyle(Paint.Style.STROKE);
        paint1.setStrokeWidth(20);

        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);

        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.FILL);

        //线性渐变
        /**
         * 参数
         * x0 y0 x1 y1：渐变的两个端点的位置
         * color0 color1 是端点的颜色
         * tile：TileMode 一共有 3 个值可选： CLAMP, MIRROR 和  REPEAT。CLAMP 是夹子模式；MIRROR 是镜像模式；REPEAT 是重复模式
         */
        Shader shader = new LinearGradient(100,100,500,500, Color.parseColor("#E91E63"),Color.parseColor("#2196F3"), Shader.TileMode.CLAMP);

        //辐射渐变
        /**
         * centerX centerY：辐射中心的坐标
         * radius：辐射半径
         * centerColor：辐射中心的颜色
         * edgeColor：辐射边缘的颜色
         * tileMode：辐射范围之外的着色模式。
         */
        Shader shader1 = new RadialGradient(900, 200, 80, Color.parseColor("#E91E63"),Color.parseColor("#2196F3"), Shader.TileMode.CLAMP);

        //扫描渐变
        /**
         * 参数
         * cx cy ：扫描的中心
         * color0：扫描的起始颜色
         * color1：扫描的终止颜色
         */
        Shader shader2 = new SweepGradient(200,600,Color.parseColor("#E91E63"),Color.parseColor("#2196F3"));

        paint.setShader(shader);
        paint1.setShader(shader);
        paint2.setShader(shader1);
        paint3.setShader(shader2);

        canvas.drawCircle(200,200,150,paint);
        canvas.drawCircle(550,200,150,paint1);
        canvas.drawCircle(900,200,150,paint2);
        canvas.drawCircle(200,600,150,paint3);

    }
}
