package com.marmotti.smartertourist;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                //return main camera fragment
                return CameraFragment.newInstance();
            case 1:
                //return google maps fragment
                return MapFragment.newInstance();

        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
