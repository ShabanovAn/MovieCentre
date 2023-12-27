package com.alex788.movie_centre;

import com.alex788.movie_centre.movie.Movie;
import com.alex788.movie_centre.movie.NewReleasePrice;

public class Rental {

    private Movie _movie;
    private int _daysRented;


    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }


    public int points() {
        return _movie.getPoints(_daysRented);
    }


    public double movieAmounts() {
        return _movie.amount(_daysRented);
    }
}
