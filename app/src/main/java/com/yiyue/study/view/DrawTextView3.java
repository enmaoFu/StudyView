package com.yiyue.study.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 设置字体 setTypeface,设置加粗 setFakeBoldText,添加删除线 setStrikeThruText,是否加下划线 setUnderlineText
 * 设置文字横向错切角度(倾斜) setTextSkewX ,置文字横向放缩 setTextScaleX,设置字符间距 setLetterSpacing
 */

public class DrawTextView3 extends View{
    public DrawTextView3(Context context) {
        super(context);
    }

    public DrawTextView3(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawTextView3(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        String str = "Hello World,由于手机设置了字体，可能无效";

        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#30acf4"));
        paint.setAntiAlias(true);
        paint.setTextSize(50);
        paint.setTypeface(Typeface.DEFAULT);
        canvas.drawText(str,100,100,paint);

        paint.reset();

        paint.setAntiAlias(true);
        paint.setTextSize(50);
        paint.setFakeBoldText(true);
        canvas.drawText(str,100,200,paint);

        paint.reset();

        paint.setAntiAlias(true);
        paint.setTextSize(50);
        paint.setColor(Color.parseColor("#30acf4"));
        paint.setStrikeThruText(true);
        canvas.drawText(str,100,300,paint);

        paint.reset();

        paint.setAntiAlias(true);
        paint.setTextSize(50);
        paint.setUnderlineText(true);
        canvas.drawText(str,100,400,paint);

        paint.reset();

        paint.setAntiAlias(true);
        paint.setTextSize(50);
        paint.setColor(Color.parseColor("#30acf4"));
        paint.setTextSkewX(0.5f);
        canvas.drawText(str,100,500,paint);

        paint.reset();

        paint.setAntiAlias(true);
        paint.setTextSize(50);
        paint.setColor(Color.parseColor("#30acf4"));
        paint.setTextScaleX(0.3f);
        canvas.drawText(str,100,600,paint);

        paint.reset();

        paint.setAntiAlias(true);
        paint.setTextSize(50);
        paint.setColor(Color.parseColor("#30acf4"));
        paint.setLetterSpacing(0.2f);
        canvas.drawText(str,100,700,paint);

    }
}
