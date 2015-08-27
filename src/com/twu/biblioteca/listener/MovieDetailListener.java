package com.twu.biblioteca.listener;

import com.twu.biblioteca.Menu;
import com.twu.biblioteca.Movie;

/**
 * Created by twer on 15/8/12.
 */
public class MovieDetailListener implements Listener {
    private Movie movie;

    public MovieDetailListener(Movie movie) {
        setMovie(movie);
    }

    public void call() {
        String introduce = "Title: " + movie.getTitle() + "\nDirector: " + movie.getDirector() + "\nYear Published:" + movie.getYearPublished() + "\nMovie Rating: " + movie.getMovieRating();
        String[] menuOptions = {"Checkout", "Return"};
        Listener[] menuListeners = {new CheckoutMovieListener(getMovie()), new ReturnMovieListener(getMovie())};

        Menu.getMenuStack().push(new Menu(introduce, menuOptions, menuListeners));
    }

    public Movie getMovie() { return this.movie; }

    public void setMovie(Movie movie) { this.movie = movie; }
}
