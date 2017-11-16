package com.yiyue.study.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.yiyue.study.R;

/**
 * Paint 着色器 Shader 的使用
 */

public class DrawPathViewShader2 extends View{
    public DrawPathViewShader2(Context context) {
        super(context);
    }

    public DrawPathViewShader2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


    public DrawPathViewShader2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setAntiAlias(true);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.test);

        Shader shader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.MIRROR);

        paint.setShader(shader);

        canvas.drawCircle(700,900,120,paint);

        //重置画笔
        paint.reset();
        paint.setAntiAlias(true);
        paint.setShader(shader);
        canvas.drawRect(100,100,1000,700,paint);

    }
}
