package com.example.android.emoviev20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

public class GridItemDetail extends AppCompatActivity {
 ImageView poster;
    TextView title;
    TextView overview;
    TextView releaseDate;
    TextView rating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_item_detail);

        poster = (ImageView) findViewById(R.id.poster);
        title = (TextView) findViewById(R.id.movieName);
        overview = (TextView) findViewById(R.id.overview);
        releaseDate = (TextView) findViewById(R.id.releaseDate);
        rating = (TextView) findViewById(R.id.ratings);


        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
         Movie data = (Movie) bundle.getSerializable("data");

        title.setText(data.movieName);
        overview.setText(data.overview);
        releaseDate.setText(data.releaseDate);
        rating.setText(data.rating+"/10");
        Picasso
                .with(this)
                .load("http://image.tmdb.org/t/p/w185/"+data.posterPath)
                .placeholder(R.mipmap.ic_launcher)
                .fit() // will explain later
                .into(poster);
    }
}
