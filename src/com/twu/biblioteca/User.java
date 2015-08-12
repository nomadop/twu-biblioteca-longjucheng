package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by twer on 15/8/12.
 */
public class User {
    private static User currentUser;

    private static ArrayList<User> userList = new ArrayList<User>();

    private String libraryNumber;

    private String password;

    private String name;

    private String email;

    private String phoneNumber;

    public User(String libraryNumber, String password, String name, String email, String phoneNumber) {
        setLibraryNumber(libraryNumber);
        setPassword(password);
        setName(name);
        setEmail(email);
        setPhoneNumber(phoneNumber);
    }

    public static void generateUserList() {
        for (int i = 0; i < 10; i++) {
            String libraryNumber = "100-000" + i;
            String password = "password" + (i + 1);
            String name = "name" + (i + 1);
            String email = "email" + (i + 1) + "@biblioteca.com";
            String phoneNumber = "phonenumber" + (i + 1);
            userList.add(new User(libraryNumber, password, name, email, phoneNumber));
        }
    }

    public static User getCurrentUser() { return currentUser; }

    public static void setCurrentUser(User currentUser1) { currentUser = currentUser1; }

    public static ArrayList<User> getUserList() { return userList; }

    public String getLibraryNumber() { return this.libraryNumber; }

    public void setLibraryNumber(String libraryNumber) { this.libraryNumber = libraryNumber; }

    public String getPassword() { return this.password; }

    public void setPassword(String password) { this.password = password; }

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public String getEmail() { return this.email; }

    public void setEmail(String email) { this.email = email; }

    public String getPhoneNumber() { return this.phoneNumber; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
}
