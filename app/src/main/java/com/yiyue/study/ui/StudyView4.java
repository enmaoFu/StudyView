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
import com.yiyue.study.ui.studyview3.DrawPathShaderFgt1;
import com.yiyue.study.ui.studyview3.DrawPathShaderFgt2;
import com.yiyue.study.ui.studyview3.DrawPathShaderFgt3;
import com.yiyue.study.ui.studyview3.DrawPathShaderFgt4;
import com.yiyue.study.ui.studyview4.DrawTextFgt1;
import com.yiyue.study.ui.studyview4.DrawTextFgt2;
import com.yiyue.study.ui.studyview4.DrawTextFgt3;
import com.yiyue.study.util.DensityUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class StudyView4 extends AppCompatActivity implements View.OnClickListener{

    @Bind(R.id.tab_layout)
    TabLayout mTab;
    @Bind(R.id.view_pager)
    ViewPager mViewPager;

    private List<Fragment> mFragments;
    private List<String> mTabsString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_view_4);

        ButterKnife.bind(this);

        init();

    }

    public void init(){

        mFragments = new ArrayList<>();
        mTabsString = new ArrayList<>();
        mTabsString.add("drawText");
        mTabsString.add("drawTextOnPath");
        mTabsString.add("setTypeface");

        mFragments.add(new DrawTextFgt1());
        mFragments.add(new DrawTextFgt2());
        mFragments.add(new DrawTextFgt3());

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
