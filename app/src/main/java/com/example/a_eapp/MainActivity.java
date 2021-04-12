package com.example.a_eapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   ViewPager viewPager=findViewById(R.id.viewpager);
   Fragmentadapter fragmentadapter=new Fragmentadapter(getSupportFragmentManager());
   viewPager.setAdapter(fragmentadapter);

   TabLayout tabLayout=findViewById(R.id.sliding_tabs);
   tabLayout.setupWithViewPager(viewPager);
    }
}