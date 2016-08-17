package com.chapark.yellomarket;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Tacademy on 2016-08-09.
 */
public class MyPagerAdapter extends FragmentPagerAdapter {

    private int tabCount;


    public MyPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new ThemeFragment();
            case 1:
                return new StoreFragment();
            case 2:
                return new CafeFragment();
            case 3:
                return new NewsFragment();
            case 4:
                return new MyFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
