package com.twu.biblioteca.listener;

import com.twu.biblioteca.Movie;

/**
 * Created by twer on 15/8/12.
 */
public class CheckoutMovieListener implements Listener {
    private Movie movie;

    public CheckoutMovieListener(Movie movie) {
        setMovie(movie);
    }

    public void call() {
        if (getMovie().checkoutMovie()) {
            System.out.println("Thank you! Enjoy the movie.");
        } else {
            System.out.println("That movie is not available.");
        }
    }

    public Movie getMovie() { return this.movie; }

    public void setMovie(Movie movie) { this.movie = movie; }
}
