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
 * Matrix 几何变换，自定义变换（点对点的映射）
 */

public class DrawMatrixPolyToPolyView extends View {
    public DrawMatrixPolyToPolyView(Context context) {
        super(context);
    }

    public DrawMatrixPolyToPolyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawMatrixPolyToPolyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Matrix matrix = new Matrix();
        Paint paint = new Paint();
        paint.setAntiAlias(true);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.t1);
        //canvas.drawBitmap(bitmap,0,0,paint);

        float[] pointsSrc = {0, 0, 100, 50, 50, 100, 100, 100};
        float[] pointsDst = {20, 20, 100, 50, 50, 100, 110, 101};

        matrix.reset();
        matrix.setPolyToPoly(pointsSrc, 0, pointsDst, 0, 4);

        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmap, 0,0, paint);
        canvas.restore();

    }
}
