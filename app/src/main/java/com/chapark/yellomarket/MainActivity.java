package com.chapark.yellomarket;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tabs)
    TabLayout tabs;
    @BindView(R.id.pager)
    ViewPager pager;
    @BindView(R.id.drawer)
    DrawerLayout drawer;
    @BindView(R.id.navi_menu)
    NavigationView naviView;


    MyPagerAdapter mAdapter;
    public static final int TAB_COUNT=5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar((Toolbar)findViewById(R.id.toolbar));
        mAdapter = new MyPagerAdapter(getSupportFragmentManager(), TAB_COUNT);

//        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabs));
//        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//
//
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                pager.setCurrentItem(tab.getPosition());
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });


        pager.setAdapter(mAdapter);
        tabs.setupWithViewPager(pager);
        tabs.setTabTextColors(Color.YELLOW, Color.RED);
        tabs.removeAllTabs();

        tabs.addTab(tabs.newTab().setText("테마"));
        tabs.addTab(tabs.newTab().setText("스토어"));
        tabs.addTab(tabs.newTab().setText("카페"));
        tabs.addTab(tabs.newTab().setText("소식"));
        tabs.addTab(tabs.newTab().setText("MY"));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.menu);



    }
}
