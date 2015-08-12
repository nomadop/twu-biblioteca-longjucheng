package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Hello, world!");

        Book.generateBookList();
        String introduce = "Welcome!";
        String[] mainMenuOptions = {"List Books"};
        Listener[] mainMenuListeners = {new ListBooksListener()};
        Menu.getMenuStack().push(new Menu(introduce, mainMenuOptions, mainMenuListeners));

        while (true) {
            Menu currentMenu = Menu.getMenuStack().peek();
            if (currentMenu == null) { break; }

            currentMenu.printMenu();
        }
    }
}
