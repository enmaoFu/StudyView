package com.yiyue.study.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.yiyue.study.R;

/**
 * Matrix 几何变换，缩放
 */

public class DrawMatrixScaleView extends View{
    public DrawMatrixScaleView(Context context) {
        super(context);
    }

    public DrawMatrixScaleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawMatrixScaleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Matrix matrix = new Matrix();
        Paint paint = new Paint();
        paint.setAntiAlias(true);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.t1);
        canvas.drawBitmap(bitmap,0,0,paint);

        matrix.reset();
        matrix.postScale(1.5f,1.0f,300,500);
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmap,300,500,paint);
        canvas.restore();

        matrix.reset();
        matrix.postScale(1.0f,2.1f,300,700);
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmap,300,760,paint);
        canvas.restore();
    }
}
