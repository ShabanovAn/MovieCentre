package com.alex788.movie_centre;

import com.alex788.movie_centre.movie.Movie;

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

    public int rentalPoints() {
        int frequentRentalPoints = 1;
        if (_movie.getPriceCode() == Movie.NEW_RELEASE && _daysRented > 1) {
            frequentRentalPoints++;
        }
        return frequentRentalPoints;
    }


    public double movieAmounts() {
        double thisAmount = 0;
        switch (_movie.getPriceCode()) {
            case Movie.REGULAR -> {
                thisAmount += 2;
                if (_daysRented > 2) {
                    thisAmount += (_daysRented - 2) * 1.5; //each.getDaysRented() = 3 -2 * 1.5
                }
            }
            case Movie.NEW_RELEASE -> thisAmount += _daysRented * 3;
            case Movie.CHILDREN -> {
                thisAmount += 1.5;
                if (_daysRented > 3) {
                    thisAmount += (_daysRented - 3) * 1.5;
                }
            }
        }
        return thisAmount;
    }
}
