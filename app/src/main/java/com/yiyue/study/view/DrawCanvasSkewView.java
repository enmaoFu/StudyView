package com.yiyue.study.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.yiyue.study.R;

/**
 * Canvas 几何变换，错切
 */

public class DrawCanvasSkewView extends View{
    public DrawCanvasSkewView(Context context) {
        super(context);
    }

    public DrawCanvasSkewView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawCanvasSkewView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setAntiAlias(true);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.t1);
        canvas.drawBitmap(bitmap,0,0,paint);

        canvas.save();
        canvas.skew(0f,0.5f);
        canvas.drawBitmap(bitmap,20,200,paint);
        canvas.restore();

        canvas.save();
        canvas.skew(0.5f,0.2f);
        canvas.drawBitmap(bitmap,100,400,paint);
        canvas.restore();
    }
}
