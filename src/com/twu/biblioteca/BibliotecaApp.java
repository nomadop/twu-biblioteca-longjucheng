package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Hello, world!");

        Book.generateBookList();
        String[] mainMenuOptions = {"List Books"};
        Menu.getMenuStack().push(new Menu(mainMenuOptions));
    }
}
