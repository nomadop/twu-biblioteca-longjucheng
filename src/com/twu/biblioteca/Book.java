package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by twer on 15/8/11.
 */
public class Book {
    private static ArrayList<Book> bookList = new ArrayList<Book>();

    private int id;

    private String title;
    
    private String author;

    private int yearPublished;

    private boolean isCheckedOut;

    public Book(int id, String title, String author, int yearPublished) {
        setId(id);
        setTitle(title);
        setAuthor(author);
        setYearPublished(yearPublished);
        setIsCheckedOut(false);
    }

    public static ArrayList<Book> getBookList() { return bookList; }

    public static void generateBookList() {
        for (int i = 0; i < 10; i++) {
            int id = i + 1;
            String title = "Title" + id;
            String author = "Author" + id;
            int yearPublished = 2000 + id;
            bookList.add(new Book(id, title, author, yearPublished));
        }
    }

    public boolean checkoutBook() {
        if (isCheckedOut) {
            return false;
        } else {
            setIsCheckedOut(true);
            return true;
        }
    }

    public boolean returnBook() {
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

    public String getAuthor() { return this.author; }

    public void setAuthor(String author) { this.author = author; }

    public int getYearPublished() { return this.yearPublished; }

    public void setYearPublished(int yearPublished) { this.yearPublished = yearPublished; }

    public boolean getIsCheckedOut() { return this.isCheckedOut; }

    public void setIsCheckedOut(boolean isCheckedOut) { this.isCheckedOut = isCheckedOut; }
}
