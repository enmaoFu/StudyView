package com.yiyue.study.ui.stydyview6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yiyue.study.R;

/**
 * 绘制顺序 dispatchDraw()：绘制子 View 的方法
 */

public class DrawOrder3Fgt extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.draw_order3,container,false);

        return view;
    }
}
