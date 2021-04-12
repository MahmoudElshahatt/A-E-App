package com.example.a_eapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbersfragment extends Fragment {


    public Numbersfragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview= inflater.inflate(R.layout.word_list, container, false);


        final ArrayList<Word> numbers = new ArrayList<Word>();
        numbers.add(new Word("واحد", "One", R.drawable.number_one));
        numbers.add(new Word("اثنين", "Two", R.drawable.number_two));
        numbers.add(new Word("ثلاثه", "Three", R.drawable.number_three));
        numbers.add(new Word("أربعة", "Four", R.drawable.number_four));
        numbers.add(new Word("خمسة", "Five", R.drawable.number_five));
        numbers.add(new Word("ستة", "Six", R.drawable.number_six));
        numbers.add(new Word("سبعة", "Seven", R.drawable.number_seven));
        numbers.add(new Word("ثمانية", "Eight", R.drawable.number_eight));
        numbers.add(new Word("تسعة", "Nine", R.drawable.number_nine));
        numbers.add(new Word("عشرة", "Ten", R.drawable.number_ten));

        Wordadapter itemsAdapter = new Wordadapter(getActivity(), numbers);
        ListView listView = rootview.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

       return rootview;


    }
}