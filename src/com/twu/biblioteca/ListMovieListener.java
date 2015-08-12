package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by twer on 15/8/12.
 */
public class ListMovieListener extends Listener {
    public void call() {
        String introduce = "Choose a movie for further options.";
        ArrayList<Movie> movieList = Movie.getMovieList();
        String[] menuOptions = new String[movieList.size()];
        Listener[] menuListeners = new Listener[movieList.size()];
        for (int i = 0; i < movieList.size(); i++) {
            menuOptions[i] = movieList.get(i).getTitle();
            menuListeners[i] = new MovieDetailListener(movieList.get(i));
        }

        Menu listMovieMenu = new Menu(introduce, menuOptions, menuListeners);
        Menu.getMenuStack().push(listMovieMenu);
    }
}
