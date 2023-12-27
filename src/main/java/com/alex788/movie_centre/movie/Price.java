package com.alex788.movie_centre.movie;

public interface Price {

    double amount(int daysRented);

    int points(int daysRented);
}
