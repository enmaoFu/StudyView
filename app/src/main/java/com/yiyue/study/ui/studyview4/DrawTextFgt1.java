package com.yiyue.study.ui.studyview4;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yiyue.study.R;

/**
 * 最基本的绘制文字的方法 drawText
 */

public class DrawTextFgt1 extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.draw_text_1,container,false);

        return view;
    }
}
