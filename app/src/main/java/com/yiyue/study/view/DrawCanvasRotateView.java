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
 * Canvas 几何变换，旋转
 */

public class DrawCanvasRotateView extends View{
    public DrawCanvasRotateView(Context context) {
        super(context);
    }

    public DrawCanvasRotateView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawCanvasRotateView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setAntiAlias(true);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.t1);
        canvas.drawBitmap(bitmap,0,100,paint);

        canvas.save();
        canvas.rotate(45,200,500);
        canvas.drawBitmap(bitmap,200,500,paint);
        canvas.restore();

    }
}
