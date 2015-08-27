package com.twu.biblioteca.listener;

import com.twu.biblioteca.Book;

/**
 * Created by twer on 15/8/12.
 */
public class CheckoutBookListener implements Listener {
    private Book book;

    public CheckoutBookListener(Book book) {
        setBook(book);
    }

    public void call() {
        if (getBook().checkoutBook()) {
            System.out.println("Thank you! Enjoy the book.");
        } else {
            System.out.println("That book is not available.");
        }
    }

    public Book getBook() { return this.book; }

    public void setBook(Book book) { this.book = book; }
}
