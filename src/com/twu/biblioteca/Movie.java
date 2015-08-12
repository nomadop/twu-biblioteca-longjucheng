package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by twer on 15/8/12.
 */
public class Movie {
    private static ArrayList<Movie> movieList = new ArrayList<Movie>();

    private int id;

    private String title;

    private String director;

    private int yearPublished;

    private int movieRating;

    private boolean isCheckedOut;

    public Movie(int id, String title, String director, int yearPublished, int movieRating) {
        setId(id);
        setTitle(title);
        setDirector(director);
        setYearPublished(yearPublished);
        setIsCheckedOut(false);
    }

    public static ArrayList<Movie> getMovieList() { return movieList; }

    public static void generateMovieList() {
        for (int i = 0; i < 10; i++) {
            int id = i + 1;
            String title = "Title" + id;
            String director = "Director" + id;
            int yearPublished = 2000 + id;
            int movieRating = id;
            movieList.add(new Movie(id, title, director, yearPublished, movieRating));
        }
    }

    public boolean checkoutMovie() {
        if (isCheckedOut) {
            return false;
        } else {
            setIsCheckedOut(true);
            return true;
        }
    }

    public boolean returnMovie() {
        if (isCheckedOut) {
            setIsCheckedOut(false);
            return true;
        } else {
            return false;
        }
    }

    public int getId() { return this.id; }

    public void setId(int id) { this.id = id; }

    public String getTitle() { return this.title; }

    public void setTitle(String title) { this.title = title; }

    public String getDirector() { return this.director; }

    public void setDirector(String director) { this.director = director; }

    public int getYearPublished() { return this.yearPublished; }

    public void setYearPublished(int yearPublished) { this.yearPublished = yearPublished; }

    public int getMovieRating() { return this.movieRating; }

    public void setMovieRating(int movieRating) { this.movieRating = movieRating; }

    public boolean getIsCheckedOut() { return this.isCheckedOut; }

    public void setIsCheckedOut(boolean isCheckedOut) { this.isCheckedOut = isCheckedOut; }
}
