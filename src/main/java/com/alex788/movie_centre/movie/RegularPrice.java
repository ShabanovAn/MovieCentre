package com.alex788.movie_centre.movie;

public class RegularMovie implements Movie {

    private String _title;

    @Override
    public double amount(int daysRented) {
        double amount = 2;
        if (daysRented > 2) {
            amount += (daysRented - 2) * 1.5; //each.getDaysRented() = 3 -2 * 1.5
        }
        return amount;
    }

    @Override
    public String getTitle() {
        return _title;
    }
}
