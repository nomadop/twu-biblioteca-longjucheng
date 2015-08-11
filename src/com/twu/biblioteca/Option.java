package com.twu.biblioteca;

/**
 * Created by twer on 15/8/11.
 */
public class Option {
    private int number;

    private String title;

    public Option(int number, String title) {
        setNumber(number);
        setTitle(title);
    }

    public int getNumber() { return this.number; }

    public void setNumber(int number) { this.number = number; }

    public String getTitle() { return this.title; }

    public void setTitle(String title) { this.title = title; }
}
