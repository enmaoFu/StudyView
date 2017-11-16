package com.yiyue.study.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Debug;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * 绘制顺序 super.onDraw() 的下面
 */

public class DrawOrderView1 extends ImageView{
    public DrawOrderView1(Context context) {
        super(context);
    }

    public DrawOrderView1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawOrderView1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.parseColor("#30acf4"));
        paint.setTextSize(50f);

        canvas.drawText("写在 super.onDraw() 的下面",150,200,paint);

    }
}
