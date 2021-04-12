package com.example.a_eapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class Colorsfragment extends Fragment {

    public Colorsfragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
   View rootview= inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> colors=new ArrayList<Word>();
        colors.add(new Word("أحمر","red",R.drawable.color_red));
        colors.add(new Word("أخضر","green",R.drawable.color_green));
        colors.add(new Word("بني","brown",R.drawable.color_brown));
        colors.add(new Word("رمادي","gray",R.drawable.color_gray));
        colors.add(new Word("أسود","black",R.drawable.color_black));
        colors.add(new Word("أبيض","white",R.drawable.color_white));
        colors.add(new Word("أصفر ترابي","dusty yellow",R.drawable.color_dusty_yellow));
        colors.add(new Word("أصفر فاتح","mustard yellow",R.drawable.color_mustard_yellow));

        Wordadapter itemsAdapter = new Wordadapter(getActivity(),colors);
        ListView listView = rootview.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return rootview;

    }
}