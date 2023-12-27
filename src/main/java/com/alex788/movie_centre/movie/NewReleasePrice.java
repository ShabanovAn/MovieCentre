package com.alex788.movie_centre.movie;

public class NewReleasePrice implements Price {

    @Override
    public double amount(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int points(int daysRented) {
        int frequentRentalPoints = 1;
        if (daysRented > 1) {
            frequentRentalPoints++;
        }
        return frequentRentalPoints;
    }
}
