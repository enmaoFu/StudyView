package com.yiyue.study.ui.studyview4;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yiyue.study.R;

/**
 * 沿着一条 Path 来绘制文字 drawTextOnPath
 */

public class DrawTextFgt2 extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.draw_text_2,container,false);

        return view;
    }
}
