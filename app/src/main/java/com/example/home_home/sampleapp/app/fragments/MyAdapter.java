package com.example.home_home.sampleapp.app.fragments;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {
    Context ctxt=null;
    public MyAdapter(Context ctxt, FragmentManager mgr) {
        super(mgr);
        this.ctxt=ctxt;
    }
    @Override
    public int getCount() {
        return(3);
    }
    @Override
    public Fragment getItem(int position) {
        return(PageFragment.newInstance(position));
    }
    @Override
    public String getPageTitle(int position) {
        return(PageFragment.getTitle(ctxt, position));
    }
}