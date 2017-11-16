package com.yiyue.study.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.yiyue.study.R;

/**
 * Paint 着色器 Shader 的使用
 */

public class DrawPathViewShader3 extends View{
    public DrawPathViewShader3(Context context) {
        super(context);
    }

    public DrawPathViewShader3(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawPathViewShader3(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setAntiAlias(true);

        Bitmap bitmapa = BitmapFactory.decodeResource(getResources(), R.mipmap.test);
        Shader shadera = new BitmapShader(bitmapa, Shader.TileMode.MIRROR, Shader.TileMode.REPEAT);

        Bitmap bitmapb = BitmapFactory.decodeResource(getResources(), R.mipmap.bfx);
        Shader shaderb = new BitmapShader(bitmapb, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);

        //混合着色器
        //Shader shaderc = new ComposeShader(shadera,shaderb, PorterDuff.Mode.SRC_OVER);
        //Shader shaderc = new ComposeShader(shadera,shaderb, PorterDuff.Mode.DST_OUT);
        //Shader shaderc = new ComposeShader(shadera,shaderb, PorterDuff.Mode.DST_IN);
        //Shader shaderc = new ComposeShader(shadera,shaderb, PorterDuff.Mode.DST_ATOP);
        //Shader shaderc = new ComposeShader(shadera,shaderb, PorterDuff.Mode.DST_OVER);
        //Shader shaderc = new ComposeShader(shadera,shaderb, PorterDuff.Mode.XOR);
        //Shader shaderc = new ComposeShader(shadera,shaderb, PorterDuff.Mode.DARKEN);
        Shader shaderc = new ComposeShader(shadera,shaderb, PorterDuff.Mode.LIGHTEN);

        //paint.setShader(shaderc);
        //canvas.drawCircle(300,300,300,paint);

        paint.setShader(shaderc);
        canvas.drawRect(100,100,900,600,paint);


    }
}
