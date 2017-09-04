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

public class DrawPathView extends View{

    public DrawPathView(Context context) {
        super(context);
    }

    public DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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
        // 使用 path 对图形进行描述（这段描述代码不必看懂）
        path.addArc(200, 200, 400, 400, -225, 225);
        path.arcTo(400, 200, 600, 400, -180, 225, false);
        path.lineTo(400, 542);

        canvas.drawPath(path,paint);
    }
}
