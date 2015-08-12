package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Hello, world!");

        Book.generateBookList();
        Movie.generateMovieList();

        String introduce = "Welcome!";
        String[] mainMenuOptions = {"List Books", "List Movies"};
        Listener[] mainMenuListeners = {new ListBooksListener(), new ListMovieListener()};
        Menu.getMenuStack().push(new Menu(introduce, mainMenuOptions, mainMenuListeners));

        while (true) {
            if (Menu.getMenuStack().empty()) { break; }
            Menu currentMenu = Menu.getMenuStack().peek();

            currentMenu.printMenu();
            Scanner stdin = new Scanner(System.in);

            System.out.println();
            System.out.print("input: ");
            String input = stdin.nextLine();

            currentMenu.checkInput(input);
        }
    }
}
