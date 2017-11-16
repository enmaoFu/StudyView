package com.yiyue.study.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.yiyue.study.R;

/**
 * 范围裁切 ClipPath
 */

public class DrawClipPathView extends View{
    public DrawClipPathView(Context context) {
        super(context);
    }

    public DrawClipPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawClipPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setAntiAlias(true);

        Path path = new Path();
        path.moveTo(50,150);
        path.lineTo(100,150);
        path.lineTo(150,100);
        path.lineTo(200,150);
        path.lineTo(250,150);
        path.lineTo(200,200);
        path.lineTo(250,250);
        path.lineTo(200,200);
        path.lineTo(150,250);
        path.lineTo(100,200);
        path.moveTo(50,150);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.t);
        canvas.save();
        canvas.clipPath(path);
        canvas.drawBitmap(bitmap,0,0,paint);
        canvas.restore();

    }
}
