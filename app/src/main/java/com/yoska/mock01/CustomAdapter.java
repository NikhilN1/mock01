package com.yoska.mock01;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<Event> {

    //to reference the Activity
    private final Context context;
    private int resource;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Event> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        convertView = layoutInflater.inflate(resource,parent,false);

        ImageView imageView = convertView.findViewById(R.id.imageView3);
        ImageView imageView1 = convertView.findViewById(R.id.imageView5);
        TextView textView = convertView.findViewById(R.id.topic);
        TextView textView1 = convertView.findViewById(R.id.discussion);

        if(position == 0){
            imageView1.setImageResource(R.drawable.color_orange_small);
        }
        imageView.setImageResource(getItem(position).getImage());
        textView.setText(getItem(position).getTopic());
        textView1.setText(getItem(position).getDescription());
        return convertView;
    }
}
