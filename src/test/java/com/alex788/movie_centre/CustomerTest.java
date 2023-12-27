package com.alex788.movie_centre;


import com.alex788.movie_centre.movie.ChildrenPrice;
import com.alex788.movie_centre.movie.Movie;
import com.alex788.movie_centre.movie.NewReleasePrice;
import com.alex788.movie_centre.movie.RegularPrice;

class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("TOM");
        Rental newReleace = new Rental(new Movie("BATMAN", new NewReleasePrice()), 3);
        Rental chindrenPrice = new Rental(new Movie("AVENGERS", new ChildrenPrice()), 2);
        customer.addRental(newReleace);
        customer.addRental(chindrenPrice);
        System.out.println(customer.statement());


    }


}