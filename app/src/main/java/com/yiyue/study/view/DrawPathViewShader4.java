package com.yiyue.study.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.yiyue.study.R;

/**
 * Paint 着色器 Shader 的使用
 */

public class DrawPathViewShader4 extends View{
    public DrawPathViewShader4(Context context) {
        super(context);
    }

    public DrawPathViewShader4(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawPathViewShader4(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();

        //默认参数为 0xffffff 0x000000
        ColorFilter lightingColorFilter = new LightingColorFilter(0x90ffff,0x006000);
        ColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Color.parseColor("#30acf4"), PorterDuff.Mode.DARKEN);

        paint.setColorFilter(lightingColorFilter);
        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.mipmap.test1);
        canvas.drawBitmap(bitmap1,400,100,paint);

        paint.reset();
        paint.setColorFilter(porterDuffColorFilter);
        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.mipmap.test1);
        canvas.drawBitmap(bitmap2,700,100,paint);

        paint.reset();
        Bitmap bitmapy = BitmapFactory.decodeResource(getResources(), R.mipmap.test1);
        canvas.drawBitmap(bitmapy,100,100,paint);

    }
}
