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
 * Camere 几何变换，三维旋转
 */

public class DrawCameraRotateView extends View{
    public DrawCameraRotateView(Context context) {
        super(context);
    }

    public DrawCameraRotateView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawCameraRotateView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Point pointX = new Point(200, 200);
        Point pointY = new Point(600, 200);

        Camera camera = new Camera();
        Paint paint = new Paint();
        paint.setAntiAlias(true);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.t1);

        canvas.save();
        // 保存 Camera 的状态
        camera.save();
        // 旋转 Camera 的三维空间  X轴
        camera.rotateX(45);
        // 旋转之后把投影移动回来
        canvas.translate((pointX.x + bitmap.getWidth() / 2),
                (pointX.y + bitmap.getHeight() / 2));
        // 把旋转投影到 Canvas
        camera.applyToCanvas(canvas);
        // 旋转之前把绘制内容移动到轴心（原点）
        canvas.translate(-(pointX.x + bitmap.getWidth() / 2),
                -(pointX.y + bitmap.getHeight() / 2));
        // 恢复 Camera 的状态
        camera.restore();
        canvas.drawBitmap(bitmap,pointX.x,pointX.y,paint);
        canvas.restore();

        canvas.save();
        // 保存 Camera 的状态
        camera.save();
        // 旋转 Camera 的三维空间  X轴
        camera.rotateY(45);
        // 旋转之后把投影移动回来
        canvas.translate((pointY.x + bitmap.getWidth() / 2),
                (pointY.y + bitmap.getHeight() / 2));
        // 把旋转投影到 Canvas
        camera.applyToCanvas(canvas);
        // 旋转之前把绘制内容移动到轴心（原点）
        canvas.translate(-(pointY.x + bitmap.getWidth() / 2),
                -(pointY.y + bitmap.getHeight() / 2));
        // 恢复 Camera 的状态
        camera.restore();
        canvas.drawBitmap(bitmap,pointY.x,pointY.y,paint);
        canvas.restore();
    }
}
