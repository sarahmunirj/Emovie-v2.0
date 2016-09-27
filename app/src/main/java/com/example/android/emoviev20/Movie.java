package com.example.android.emoviev20;

import java.io.Serializable;

/**
 * Created by lenovo-pc on 9/26/2016.
 */
public class Movie implements Serializable {
    String posterPath;
    String overview;
    String movieName;
    String releaseDate;
    String rating;

    public Movie (String posterPath,String movieName, String overview, String releaseDate, String rating){
        this.posterPath = posterPath;
        this.overview = overview;
        this.movieName = movieName;
        this.releaseDate= releaseDate;
        this.rating=rating;
    }
}
