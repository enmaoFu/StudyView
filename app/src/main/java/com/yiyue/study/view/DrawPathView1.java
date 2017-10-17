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
 * 画自定义图型，路径绘制1
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

        Paint paint = new Paint();
        // 初始化 Path 对象
        Path path = new Path();

        paint.setColor(Color.parseColor("#30acf4"));
        paint.setAntiAlias(true);

        path.addArc(200, 200, 400, 400, -225, 225);
        path.arcTo(400, 200, 600, 400, -180, 225, false);
        path.lineTo(400, 542);

        // 绘制出 path 描述的图形(心形)
        canvas.drawPath(path, paint);

    }
}
