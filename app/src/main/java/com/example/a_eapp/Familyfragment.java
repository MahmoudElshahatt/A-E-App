package com.example.a_eapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Familyfragment extends Fragment {

    public Familyfragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview= inflater.inflate(R.layout.word_list, container, false);


        final ArrayList<Word> family=new ArrayList<Word>();
        family.add(new Word("أب","father",R.drawable.family_father));
        family.add(new Word("أم","mother",R.drawable.family_mother));
        family.add(new Word("الإبن","son",R.drawable.family_son));
        family.add(new Word("الإبنة","daughter",R.drawable.family_daughter));
        family.add(new Word("الأخ الأكبر","older brother",R.drawable.family_older_brother));
        family.add(new Word("الأخ الأصغر","younger brother",R.drawable.family_younger_brother));
        family.add(new Word("الأخت الأكبر","older sister", R.drawable.family_older_sister));
        family.add(new Word("الأخت الأصغر","youngersister", R.drawable.family_younger_sister));
        family.add(new Word("الجدة","grandmother", R.drawable.family_grandmother));
        family.add(new Word("الجد", "grandfather", R.drawable.family_grandfather));

        Wordadapter itemsAdapter = new Wordadapter(getActivity(),family);
        ListView listView = rootview.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return rootview;

    }
}