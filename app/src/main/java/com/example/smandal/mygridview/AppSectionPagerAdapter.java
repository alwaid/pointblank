package com.example.smandal.mygridview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by smandal on 9/5/2015.
 */
public class AppSectionPagerAdapter extends FragmentPagerAdapter {

    public AppSectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        ProjectStatusFragment projectStatusFragment= new ProjectStatusFragment();

        Bundle bundle = new Bundle();
        bundle.putString("PROJECT_STATUS", "Status --- "+i);
        projectStatusFragment.setArguments(bundle);

        return projectStatusFragment;
    }

    @Override
    public int getCount() {
        return status.length;
    }

    String[] status = {"WIP", "COMPLETED", "NOT STARTED", "ACCEPTED", "BLOCKED"};

    @Override
    public CharSequence getPageTitle(int position) {
        return status[position];
    }
}
