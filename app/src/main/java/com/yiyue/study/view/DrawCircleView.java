package com.yiyue.study.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 画圆
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
        //设置画笔颜色
        paint.setColor(Color.parseColor("#30acf4"));
        //设置风格
        // Style 具体来说有三种： FILL, STROKE 和 FILL_AND_STROKE 。
        // FILL 是填充模式，STROKE 是画线模式（即勾边模式），FILL_AND_STROKE 是两种模式一并使用：既画线又填充
        paint.setStyle(Paint.Style.FILL);
        //开启抗锯齿，看起来边界更圆滑
        paint.setAntiAlias(true);

       canvas.drawCircle(200,200,100,paint);



        //创建画笔
        Paint paint1 = new Paint();
        //设置画笔颜色
        paint1.setColor(Color.parseColor("#30acf4"));
        //设置风格
        // Style 具体来说有三种： FILL, STROKE 和 FILL_AND_STROKE 。
        // FILL 是填充模式，STROKE 是画线模式（即勾边模式），FILL_AND_STROKE 是两种模式一并使用：既画线又填充
        paint1.setStyle(Paint.Style.STROKE);
        //开启抗锯齿，看起来边界更圆滑
        paint1.setAntiAlias(true);
        //设置线条宽度
        paint1.setStrokeWidth(20);

        canvas.drawCircle(400,400,130,paint1);

        //创建画笔
        Paint paint2 = new Paint();
        //设置画笔颜色
        paint2.setColor(Color.parseColor("#30acf4"));
        //设置风格
        // Style 具体来说有三种： FILL, STROKE 和 FILL_AND_STROKE 。
        // FILL 是填充模式，STROKE 是画线模式（即勾边模式），FILL_AND_STROKE 是两种模式一并使用：既画线又填充
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        //开启抗锯齿，看起来边界更圆滑
        paint2.setAntiAlias(true);
        //设置线条宽度
        paint2.setStrokeWidth(20);

        canvas.drawCircle(400,800,130,paint2);


    }
}
