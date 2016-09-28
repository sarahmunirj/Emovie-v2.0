package com.example.android.emoviev20;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.example.android.emoviev20.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ImageListAdapter extends ArrayAdapter {
    private Context context;
    private LayoutInflater inflater;

    private ArrayList<Movie> movies;

    public ImageListAdapter(Context context, ArrayList<Movie> movies) {
        super(context, R.layout.grid_item_layout, movies);

        this.context = context;
        this.movies = movies;

        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (null == convertView) {
            convertView = inflater.inflate(R.layout.grid_item_layout,parent,false);
        }

        Picasso
                .with(context)
                .load("http://image.tmdb.org/t/p/w185/"+movies.get(position).posterPath)
                .placeholder(R.mipmap.ic_launcher)
                .fit() // will explain later
                .into((ImageView) convertView);

        return convertView;
    }
}