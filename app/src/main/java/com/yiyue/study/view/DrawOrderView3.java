package com.yiyue.study.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * 绘制顺序 dispatchDraw()：绘制子 View 的方法
 */

public class DrawOrderView3 extends LinearLayout{
    public DrawOrderView3(Context context) {
        super(context);
    }

    public DrawOrderView3(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawOrderView3(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#30acf4"));

        canvas.drawCircle(50,50,40,paint);

    }
}
