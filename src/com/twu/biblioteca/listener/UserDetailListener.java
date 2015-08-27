package com.twu.biblioteca.listener;

import com.twu.biblioteca.User;

/**
 * Created by twer on 15/8/12.
 */
public class UserDetailListener implements Listener {
    public void call() {
        User user = User.getCurrentUser();
        if (user != null) {
            String detail = "Library Number: " + user.getLibraryNumber() + "\nName: " + user.getName() + "\nEmail: " + user.getEmail() + "\nPhone Number: " + user.getPhoneNumber();

            System.out.println(detail);
        } else {
            System.out.println("Please login first.");
        }
    }
}
