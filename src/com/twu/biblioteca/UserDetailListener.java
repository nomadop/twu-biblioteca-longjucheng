package com.twu.biblioteca;

/**
 * Created by twer on 15/8/12.
 */
public class UserDetailListener extends Listener {
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
