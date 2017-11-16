package com.yiyue.study.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 最基本的绘制文字的方法 drawText
 */

public class DrawTextView1 extends View{
    public DrawTextView1(Context context) {
        super(context);
    }

    public DrawTextView1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawTextView1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#30acf4"));
        paint.setAntiAlias(true);
        paint.setTextSize(100f);

        String str = "Hello Wolrd";

        canvas.drawText(str,100,100,paint);


    }
}
