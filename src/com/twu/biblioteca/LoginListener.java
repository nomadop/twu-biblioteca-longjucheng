package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by twer on 15/8/12.
 */
public class LoginListener extends Listener {
    public void call() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nplease enter your library number: ");
        String libraryNumber = scanner.nextLine();

        ArrayList<User> userList = User.getUserList();
        User user = null;
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getLibraryNumber().equals(libraryNumber)) {
                user = userList.get(i);
            }
        }
        if (user == null) {
            System.out.println("Wrong library number.");
            return;
        }
        
        System.out.print("\nplease enter your password: ");
        String password = scanner.nextLine();

        if (password.equals(user.getPassword())) {
            User.setCurrentUser(user);
            System.out.println("Login successfully");
        } else {
            System.out.println("Wrong password.");
        }
    }
}
