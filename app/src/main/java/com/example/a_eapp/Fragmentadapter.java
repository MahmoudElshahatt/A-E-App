package com.example.a_eapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Fragmentadapter extends FragmentPagerAdapter {

    public Fragmentadapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public Fragmentadapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0: return new Numbersfragment();
            case 1:return new Colorsfragment();
            case 2: return new Familyfragment();
            case 3: return new Phrasesfragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0: return "Numbers";
            case 1: return "Colors";
            case 2: return "Family";
            case 3: return "Phrases";
        }
        return null;
    }
}
