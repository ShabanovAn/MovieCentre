package com.alex788.movie_centre.movie;

public class NewReleaseMovie implements Movie {

    private String _title;

    @Override
    public double amount(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public String getTitle() {
        return _title;
    }
}
