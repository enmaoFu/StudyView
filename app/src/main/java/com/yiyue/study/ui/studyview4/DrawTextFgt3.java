package com.yiyue.study.ui.studyview4;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yiyue.study.R;

/**
 * 设置字体 setTypeface,设置加粗 setFakeBoldText,添加删除线 setStrikeThruText,是否加下划线 setUnderlineText
 * 设置文字横向错切角度(倾斜) setTextSkewX ,置文字横向放缩 setTextScaleX,设置字符间距 setLetterSpacing
 */

public class DrawTextFgt3 extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.draw_text_3,container,false);

        return view;
    }
}
