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
 * 范围裁切 ClipRect
 */

public class DrawClipRectView extends View {
    public DrawClipRectView(Context context) {
        super(context);
    }

    public DrawClipRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawClipRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setAntiAlias(true);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.t);
        canvas.save();
        canvas.clipRect(100, 100, 500, 300);
        canvas.drawBitmap(bitmap,0,0,paint);
        canvas.restore();
    }
}
