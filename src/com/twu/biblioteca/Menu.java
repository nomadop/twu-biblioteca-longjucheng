package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by twer on 15/8/11.
 */
public class Menu {
    private static Stack<Menu> menuStack = new Stack<Menu>();

    private ArrayList<Option> options;

    public Menu(String[] optionTitles) {
        setOptions(new ArrayList<Option>(optionTitles.length + 1));
        for (int i = 0; i < optionTitles.length; i++) {
            getOptions().add(new Option(i, optionTitles[i]));
        }
        getOptions().add(new Option(optionTitles.length, "Quit"));
    }

    public static Stack<Menu> getMenuStack() { return menuStack; }

    public ArrayList<Option> getOptions() { return this.options; }

    public void setOptions(ArrayList<Option> options) { this.options = options; }
}
