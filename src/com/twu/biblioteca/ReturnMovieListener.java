package com.twu.biblioteca;

/**
 * Created by twer on 15/8/12.
 */
public class ReturnMovieListener extends Listener {
    private Movie movie;

    public ReturnMovieListener(Movie movie) {
        setMovie(movie);
    }

    public void call() {
        if (getMovie().returnMovie()) {
            System.out.println("Thank you for returning the movie.");
        } else {
            System.out.println("That is not a valid movie to return.");
        }
    }

    public Movie getMovie() { return this.movie; }

    public void setMovie(Movie movie) { this.movie = movie; }
}
