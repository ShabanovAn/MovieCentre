package com.alex788.movie_centre.movie;

public class Movie {

    private String _title;
    private Price _price;

    public double amount(int daysRented) {
        return _price.amount(daysRented);
    }

    public String getTitle() {
        return _title;
    }

    public void setPrice(Price price) {
        _price = price;
    }

    public Price get_price() {
        return _price;
    }

    public int getPoints(int daysRented) {
        return _price.points(daysRented);
    }

    public Movie(String _title, Price _price) {
        this._title = _title;
        this._price = _price;
    }
}
