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
import com.yiyue.study.ui.studyview1.DrawArcFgt;
import com.yiyue.study.ui.studyview1.DrawCircleFgt;
import com.yiyue.study.ui.studyview1.DrawColorFgt;
import com.yiyue.study.ui.studyview1.DrawLineFgt;
import com.yiyue.study.ui.studyview1.DrawOvalFgt;
import com.yiyue.study.ui.studyview1.DrawPointFgt;
import com.yiyue.study.ui.studyview1.DrawRectFgt;
import com.yiyue.study.ui.studyview1.DrawRoundRectFgt;
import com.yiyue.study.util.DensityUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class StudyView1 extends AppCompatActivity implements View.OnClickListener{

    @Bind(R.id.tab_layout)
    TabLayout mTab;
    @Bind(R.id.view_pager)
    ViewPager mViewPager;

    private List<Fragment> mFragments;
    private List<String> mTabsString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_view_1);

        ButterKnife.bind(this);

        init();

    }

    public void init(){

        mFragments = new ArrayList<>();
        mTabsString = new ArrayList<>();
        mTabsString.add("drawColor画布");
        mTabsString.add("drawCircle圆形");
        mTabsString.add("drawRect矩形");
        mTabsString.add("drawPoint点");
        mTabsString.add("drawOval椭圆");
        mTabsString.add("drawline线");
        mTabsString.add("drawRoundRect圆角矩形");
        mTabsString.add("drawArc扇形或弧形");

        mFragments.add(new DrawColorFgt());
        mFragments.add(new DrawCircleFgt());
        mFragments.add(new DrawRectFgt());
        mFragments.add(new DrawPointFgt());
        mFragments.add(new DrawOvalFgt());
        mFragments.add(new DrawLineFgt());
        mFragments.add(new DrawRoundRectFgt());
        mFragments.add(new DrawArcFgt());

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
