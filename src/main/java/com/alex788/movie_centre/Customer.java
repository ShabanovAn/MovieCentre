package com.alex788.movie_centre;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String _name;
    private List<Rental> _rentals = new ArrayList<>();

    public Customer(String name) {
        _name = name;
    }

    private String getName() {
        return _name;
    }

    public String statement() {

        String result = "Учет аренды для " + getName() + "\n";
        result += listAmounts();

        result += "Сумма задолженности составляет " + totalAmount() + "\n";
        result += "Вы заработали " + totalRentalPoints() + " очков за активность";

        return result;
    }


    public String statement2() {
        String result = "";

        result += listAmounts();
        result += "Сумма задолженности составляет " + totalAmount() + "\n";
        result += "Вы заработали " + totalRentalPoints() + " очков за активность";
        result += "Учет аренды для " + getName() + "\n";

        return result;
    }

    private String listAmounts() {
        String result ="";
        for (Rental each : _rentals) {
            result += "\t" + each.getMovie().getTitle() + "\t" + each.movieAmounts() + "\n";
        }
        return result;
    }

    public double totalAmount() {
        return _rentals.stream()
                .map(Rental::movieAmounts)
                .reduce(0.0, Double::sum);
    }

    public int totalRentalPoints() {
        return _rentals.stream()
                .map(Rental::rentalPoints)
                .reduce(0, Integer::sum);
    }
}
