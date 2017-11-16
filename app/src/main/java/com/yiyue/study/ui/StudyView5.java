package com.yiyue.study.ui;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.yiyue.study.R;
import com.yiyue.study.ui.studyview1.DrawCircleFgt;
import com.yiyue.study.ui.studyview4.DrawTextFgt1;
import com.yiyue.study.ui.studyview5.DrawCameraLocationFgt;
import com.yiyue.study.ui.studyview5.DrawCameraRotateFgt;
import com.yiyue.study.ui.studyview5.DrawCanvasRotateFgt;
import com.yiyue.study.ui.studyview5.DrawCanvasScaleFgt;
import com.yiyue.study.ui.studyview5.DrawCanvasSkewFgt;
import com.yiyue.study.ui.studyview5.DrawCanvasTranslateFgt;
import com.yiyue.study.ui.studyview5.DrawClipPathFgt;
import com.yiyue.study.ui.studyview5.DrawClipRectFgt;
import com.yiyue.study.ui.studyview5.DrawMatrixPolyToPolyFgt;
import com.yiyue.study.ui.studyview5.DrawMatrixRotateFgt;
import com.yiyue.study.ui.studyview5.DrawMatrixScaleFgt;
import com.yiyue.study.ui.studyview5.DrawMatrixSkewFgt;
import com.yiyue.study.ui.studyview5.DrawMatrixTranslateFgt;
import com.yiyue.study.util.DensityUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class StudyView5 extends AppCompatActivity implements View.OnClickListener{

    @Bind(R.id.tab_layout)
    TabLayout mTab;
    @Bind(R.id.view_pager)
    ViewPager mViewPager;

    private List<Fragment> mFragments;
    private List<String> mTabsString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_view_5);

        ButterKnife.bind(this);

        init();

    }

    public void init(){

        mFragments = new ArrayList<>();
        mTabsString = new ArrayList<>();
        mTabsString.add("drwaClipRect");
        mTabsString.add("drawClipPath");
        mTabsString.add("canvasTranslate");
        mTabsString.add("canvasRotate");
        mTabsString.add("canvasScale");
        mTabsString.add("canvasSkew");
        mTabsString.add("matrixTranslate");
        mTabsString.add("matrixRotate");
        mTabsString.add("matrixScale");
        mTabsString.add("matrixSkew");
        mTabsString.add("matrixPolyToPoly");
        mTabsString.add("cameraRotate");
        mTabsString.add("cameraLocation");

        mFragments.add(new DrawClipRectFgt());
        mFragments.add(new DrawClipPathFgt());
        mFragments.add(new DrawCanvasTranslateFgt());
        mFragments.add(new DrawCanvasRotateFgt());
        mFragments.add(new DrawCanvasScaleFgt());
        mFragments.add(new DrawCanvasSkewFgt());
        mFragments.add(new DrawMatrixTranslateFgt());
        mFragments.add(new DrawMatrixRotateFgt());
        mFragments.add(new DrawMatrixScaleFgt());
        mFragments.add(new DrawMatrixSkewFgt());
        mFragments.add(new DrawMatrixPolyToPolyFgt());
        mFragments.add(new DrawCameraRotateFgt());
        mFragments.add(new DrawCameraLocationFgt());

        //设置间隔
        LinearLayout linearLayout = (LinearLayout) mTab.getChildAt(0);
        linearLayout.setShowDividers(LinearLayout.SHOW_DIVIDER_MIDDLE);
        linearLayout.setDividerDrawable(ContextCompat.getDrawable(this,
                R.drawable.tab_divider_vertical));
        linearLayout.setDividerPadding(DensityUtils.dp2px(this,15));

        //普通在activity里面嵌套fragment里这样写
        //pageAdapter pageAdapter = new pageAdapter(getActivity().getSupportFragmentManager());
        pageAdapter pageAdapter = new pageAdapter(getSupportFragmentManager());
        mViewPager.setOffscreenPageLimit(4);
        mViewPager.setAdapter(pageAdapter);

        mTab.setupWithViewPager(mViewPager);
        //设置tablayout的模式 MODE_FIXED是固定  MODE_SCROLLABLE是滚动
        mTab.setTabMode(TabLayout.MODE_SCROLLABLE);

        /*if (DensityUtils.getScreenWidth(this)<=700){
            mTab.setTabMode(TabLayout.MODE_SCROLLABLE);
        }else {
            mTab.setTabMode(TabLayout.MODE_FIXED);
        }*/

    }

    @OnClick({R.id.back})
    public void onClick(View view){
        switch (view.getId()){
            case R.id.back:
                finish();
                break;
        }
    }

    class pageAdapter extends FragmentStatePagerAdapter {
        public pageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTabsString.get(position);
        }

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        // super.onSaveInstanceState(outState);
    }

}
