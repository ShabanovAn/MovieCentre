package com.alex788.movie_centre.movie;

public class ChildrenPrice implements Price {

    @Override
    public double amount(int daysRented) {
        double amount = 1.5;
        if (daysRented > 2) {
            amount += (daysRented - 2) * 1.5; //each.getDaysRented() = 3 -2 * 1.5
        }
        return amount;
    }

    @Override
    public int points(int daysRented) {
        return 1;
    }
}
