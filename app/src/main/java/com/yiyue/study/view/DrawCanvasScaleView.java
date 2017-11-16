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
 * Canvas 几何变换，缩放
 */

public class DrawCanvasScaleView extends View{
    public DrawCanvasScaleView(Context context) {
        super(context);
    }

    public DrawCanvasScaleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawCanvasScaleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setAntiAlias(true);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.t1);
        int bitmapWidth = bitmap.getWidth();
        int bitmapHeight = bitmap.getHeight();
        canvas.drawBitmap(bitmap,0,0,paint);

        canvas.save();
        canvas.scale(1.3f,1.3f);
        canvas.drawBitmap(bitmap,100,200,paint);
        canvas.restore();

        canvas.save();
        canvas.scale(1.9f,1.0f, 100 + bitmapWidth / 2, 500 + bitmapHeight / 2);
        canvas.drawBitmap(bitmap,100,500,paint);
        canvas.restore();

        canvas.save();
        canvas.scale(1.0f,1.9f, 100 + bitmapWidth / 2, 500 + bitmapHeight / 2);
        canvas.drawBitmap(bitmap,100,800,paint);
        canvas.restore();

    }
}
