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

    private ArrayList<Movie> imageUrls;

    public ImageListAdapter(Context context, ArrayList<Movie> imageUrls) {
        super(context, R.layout.grid_item_layout, imageUrls);

        this.context = context;
        this.imageUrls = imageUrls;

        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (null == convertView) {
            convertView = inflater.inflate(R.layout.grid_item_layout, parent, false);
        }

        Picasso
                .with(context)
                .load(imageUrls.get(position).posterPath)
                .fit() // will explain later
                .into((ImageView) convertView);

        return convertView;
    }
}