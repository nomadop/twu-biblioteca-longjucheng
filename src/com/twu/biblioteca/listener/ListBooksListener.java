package com.twu.biblioteca.listener;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.Menu;

import java.util.ArrayList;

/**
 * Created by twer on 15/8/12.
 */
public class ListBooksListener implements Listener {
    public void call() {
        String introduce = "Choose a book for further options.";
        ArrayList<Book> bookList = Book.getBookList();
        String[] menuOptions = new String[bookList.size()];
        Listener[] menuListeners = new Listener[bookList.size()];
        for (int i = 0; i < bookList.size(); i++) {
            menuOptions[i] = bookList.get(i).getTitle();
            menuListeners[i] = new BookDetailListener(bookList.get(i));
        }

        Menu listBookMenu = new Menu(introduce, menuOptions, menuListeners);
        Menu.getMenuStack().push(listBookMenu);
    }
}
