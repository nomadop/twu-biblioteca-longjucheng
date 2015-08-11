package com.twu.biblioteca;

/**
 * Created by twer on 15/8/11.
 */
public class Book {
    private int id;

    private String title;
    
    private String author;

    private int yearPublished;

    public Book(int id, String title, String author, int yearPublished) {
        setId(id);
        setTitle(title);
        setAuthor(author);
        setYearPublished(yearPublished);
    }

    public int getId() { return this.id; }

    public void setId(int id) { this.id = id; }

    public String getTitle() { return this.title; }

    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return this.author; }

    public void setAuthor(String author) { this.author = author; }

    public int getYearPublished() { return this.yearPublished; }

    public void setYearPublished(int yearPublished) { this.yearPublished = yearPublished; }
}
