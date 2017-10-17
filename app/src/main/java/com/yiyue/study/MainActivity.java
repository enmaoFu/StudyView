package com.yiyue.study;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.yiyue.study.ui.StudyView1;
import com.yiyue.study.ui.StudyView2;
import com.yiyue.study.ui.StudyView3;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

    }

    @OnClick({R.id.studyview_1,R.id.studyview_2,R.id.studyview_3})
    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()){
            case R.id.studyview_1:
                intent.setClass(this, StudyView1.class);
                startActivity(intent);
                break;
            case R.id.studyview_2:
                intent.setClass(this, StudyView2.class);
                startActivity(intent);
                break;
            case R.id.studyview_3:
                intent.setClass(this, StudyView3.class);
                startActivity(intent);
                break;
        }
    }
}
