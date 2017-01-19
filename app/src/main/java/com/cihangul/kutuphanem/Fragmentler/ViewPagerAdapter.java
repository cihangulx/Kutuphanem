package com.cihangul.kutuphanem.Fragmentler;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;
        if (position == 0) {
            fragment = new AksiyonFragment();
        } else if (position == 1) {
            fragment = new BilimFragment();
        } else if (position == 2) {
            fragment = new DinFragment();
        } else if (position == 3) {
            fragment = new KlasikFragment();
        } else if (position == 4) {
            fragment = new KorkuFragment();
        }else if(position==5){
            fragment=new SiirFragment();
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 6;
    }
}
