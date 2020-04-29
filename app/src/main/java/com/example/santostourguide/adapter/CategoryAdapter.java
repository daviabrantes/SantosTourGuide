package com.example.santostourguide.adapter;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.santostourguide.R;
import com.example.santostourguide.fragment.CenterFragment;
import com.example.santostourguide.fragment.PlazaFragment;
import com.example.santostourguide.fragment.ShoreFragment;
import com.example.santostourguide.fragment.StadiumFragment;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CenterFragment();
        } else if (position == 1) {
            return new PlazaFragment();
        } else if (position == 2) {
            return new ShoreFragment();
        } else {
            return new StadiumFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.historical_center_title);
        } else if (position == 1) {
            return mContext.getString(R.string.plaza_text);
        } else if (position == 2) {
            return mContext.getString(R.string.shore_gardens_title);
        } else {
            return mContext.getString(R.string.vila_belmiro_title);
        }
    }
 }