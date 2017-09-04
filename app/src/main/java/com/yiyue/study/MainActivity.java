package com.yiyue.study;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.yiyue.study.fragments.DrawArcFragment;
import com.yiyue.study.fragments.DrawCircleFragment;
import com.yiyue.study.fragments.DrawColorFragment;
import com.yiyue.study.fragments.DrawLineFragment;
import com.yiyue.study.fragments.DrawOvalFragment;
import com.yiyue.study.fragments.DrawPathFragment;
import com.yiyue.study.fragments.DrawPathFragment1;
import com.yiyue.study.fragments.DrawPointFragment;
import com.yiyue.study.fragments.DrawRectFragment;
import com.yiyue.study.fragments.DrawRoundRectFragment;
import com.yiyue.study.util.DensityUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.tab_layout)
    TabLayout mTab;
    @Bind(R.id.view_pager)
    ViewPager mViewPager;

    private List<Fragment> mFragments;
    private List<String> mTabsString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        init();

    }

    public void init(){

        mFragments = new ArrayList<>();
        mTabsString = new ArrayList<>();
        mTabsString.add("drawColor");
        mTabsString.add("drawCircle");
        mTabsString.add("drawRect");
        mTabsString.add("drawPoint");
        mTabsString.add("drawOval");
        mTabsString.add("drawLine");
        mTabsString.add("drawRoundRect");
        mTabsString.add("drawArc");
        mTabsString.add("drawPath");
        mTabsString.add("drawPath1");

        mFragments.add(new DrawColorFragment());
        mFragments.add(new DrawCircleFragment());
        mFragments.add(new DrawRectFragment());
        mFragments.add(new DrawPointFragment());
        mFragments.add(new DrawOvalFragment());
        mFragments.add(new DrawLineFragment());
        mFragments.add(new DrawRoundRectFragment());
        mFragments.add(new DrawArcFragment());
        mFragments.add(new DrawPathFragment());
        mFragments.add(new DrawPathFragment1());

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
