package com.yiyue.study.ui.studyview5;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yiyue.study.R;

/**
 * Camere 几何变换，三维旋转
 */

public class DrawCameraRotateFgt extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.draw_camera_rotate_x,container,false);

        return view;
    }
}
