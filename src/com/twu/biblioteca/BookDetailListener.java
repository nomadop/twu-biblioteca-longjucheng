package com.twu.biblioteca;

/**
 * Created by twer on 15/8/12.
 */
public class BookDetailListener extends Listener {
    private Book book;

    public BookDetailListener(Book book) {
        setBook(book);
    }

    public void call() {
        String introduce = "Title: " + book.getTitle() + "\nAuthor: " + book.getAuthor() + "\nYear Published:" + book.getYearPublished();
        String[] menuOptions = {"Checkout", "Return"};
        Listener[] menuListeners = {new CheckoutBookListener(getBook()), new ReturnBookListener(getBook())};

        Menu.getMenuStack().push(new Menu(introduce, menuOptions, menuListeners));
    }

    public Book getBook() { return this.book; }

    public void setBook(Book book) { this.book = book; }
}
