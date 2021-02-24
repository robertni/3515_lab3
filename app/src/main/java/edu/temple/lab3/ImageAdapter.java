package edu.temple.lab3;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;


import java.util.ArrayList;

public class ImageAdapter extends BaseAdapter implements SpinnerAdapter {

    Context context;
    ArrayList<String> items;
    int[] images;
    boolean first = true;

    public ImageAdapter(Context context, ArrayList items, int[] images) {
        this.context = context;
        this.items = items;
        this.images = images;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView;

        if (convertView == null) {
            textView = new TextView(context);
        } else {
            textView = (TextView)convertView;
        }

        if (first) {
            textView.setText("Please select a dog");
            first = false;
        } else {
            textView.setText(items.get(position));
        }

        textView.setTextSize(20);

        return textView;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        View v;
        TextView textView;
        ImageView imageView;

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.activity_spinner, null);

        textView = v.findViewById(R.id.textView);
        imageView = v.findViewById(R.id.imageRes);

        textView.setText(items.get(position));
        imageView.setImageResource(images[position]);

        v.setBackgroundColor(Color.rgb(244, 244, 244));

        return v;
    }
}
