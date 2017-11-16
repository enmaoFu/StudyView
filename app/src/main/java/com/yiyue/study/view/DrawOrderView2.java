package com.yiyue.study.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * 绘制顺序 super.onDraw() 的上面
 */

public class DrawOrderView2 extends TextView{
    public DrawOrderView2(Context context) {
        super(context);
    }

    public DrawOrderView2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawOrderView2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.parseColor("#30acf4"));
        super.onDraw(canvas);
    }
}
