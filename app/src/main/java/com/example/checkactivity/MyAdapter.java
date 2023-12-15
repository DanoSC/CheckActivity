package com.example.checkactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

public class MyAdapter extends ArrayAdapter<String> {

    public MyAdapter(Context context, List<String> data) {
        super(context, R.layout.list_items, data);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_items, parent, false);
        }
        TextView textView = convertView.findViewById(R.id.textViewTitulo);
        textView.setText(getItem(position));

        return convertView;
    }
}
