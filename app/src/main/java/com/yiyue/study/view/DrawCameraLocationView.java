package com.yiyue.study.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.yiyue.study.R;

/**
 * Camere 几何变换，设置虚拟相机的位置
 */

public class DrawCameraLocationView extends View{
    public DrawCameraLocationView(Context context) {
        super(context);
    }

    public DrawCameraLocationView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawCameraLocationView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.t);

        Point point = new Point(200,200);

        Paint paint = new Paint();
        paint.setAntiAlias(true);

        Camera camera = new Camera();

        //设置虚拟相机的位置
        camera.setLocation(0,0,-20);

        canvas.save();
        camera.save();
        camera.rotateX(50);
        canvas.translate((point.x + bitmap.getWidth() / 2), (point.y + bitmap.getHeight() / 2));
        camera.applyToCanvas(canvas);
        canvas.translate(-(point.x + bitmap.getWidth() / 2), -(point.y + bitmap.getHeight() / 2));
        camera.restore();
        canvas.drawBitmap(bitmap,point.x,point.y,paint);
        canvas.restore();

    }
}
