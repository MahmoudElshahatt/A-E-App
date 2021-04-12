package com.example.a_eapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrasesfragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview= inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> colors=new ArrayList<Word>();
        colors.add(new Word("إلي أين أنت ذاهب؟","Where are you going?"));
        colors.add(new Word("ما هو إسمك؟","What is your name?"));
        colors.add(new Word("إسمي هو ..","My name is .."));
        colors.add(new Word("بماذا تشعر؟","How are you feeling?"));
        colors.add(new Word("أنا بخير","I am feeling good"));
        colors.add(new Word("هل ستأتي؟","Are you coming?"));
        colors.add(new Word("نعم..أنا أتٍ","Yes..i am coming"));
        colors.add(new Word("هيا بنا","Let's go"));
        colors.add(new Word("تعالا إلي هنا","Come here"));
        Wordadapter itemsAdapter = new Wordadapter(getActivity(),colors);
        ListView listView = rootview.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return rootview;
}
    }