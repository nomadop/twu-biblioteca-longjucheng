package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BibliotecaApp {

    private static List<Book> generateBookList() {
        ArrayList<Book> bookList = new ArrayList<Book>(10);
        for (int i = 0; i < 10; i++) {
            int id = i + 1;
            String title = "Title" + id;
            String author = "Author" + id;
            int yearPublished = 2000 + id;
            bookList.add(new Book(id, title, author, yearPublished));
        }
        return bookList;
    }

    public static void main(String[] args) {
        System.out.println("Hello, world!");

        Stack<Menu> menuStack = new Stack<Menu>();

        String[] mainMenuOptions = {"List Books"};
        menuStack.push(new Menu(mainMenuOptions));
    }
}
