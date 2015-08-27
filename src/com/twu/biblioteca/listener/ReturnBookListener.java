package com.twu.biblioteca.listener;

import com.twu.biblioteca.Book;

/**
 * Created by twer on 15/8/12.
 */
public class ReturnBookListener implements Listener {
    private Book book;

    public ReturnBookListener(Book book) {
        setBook(book);
    }

    public void call() {
        if (getBook().returnBook()) {
            System.out.println("Thank you for returning the book.");
        } else {
            System.out.println("That is not a valid book to return.");
        }
    }

    public Book getBook() { return this.book; }

    public void setBook(Book book) { this.book = book; }
}
