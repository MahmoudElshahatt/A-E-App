package com.example.a_eapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class Wordadapter extends ArrayAdapter<Word> {

    public Wordadapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.shapeoflist, parent, false);
        }

        Word currentword = getItem(position);

        TextView mTextView = listItemView.findViewById(R.id.aitemtext);
        mTextView.setText(currentword.getArabicword());

        TextView numberTextView =  listItemView.findViewById(R.id.englishitemtext);
        numberTextView.setText(currentword.getDifualtword());

        ImageView image=listItemView.findViewById(R.id.image);
        image.setImageResource(currentword.getimageresorce());

        return listItemView;
    }
}
