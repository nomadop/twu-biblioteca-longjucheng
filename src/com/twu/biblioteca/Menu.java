package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by twer on 15/8/11.
 */
public class Menu {
    private ArrayList<Option> options;

    public Menu(String[] optionTitles) {
        setOptions(new ArrayList<Option>(optionTitles.length + 1));
        for (int i = 0; i < optionTitles.length; i++) {
            getOptions().add(new Option(i, optionTitles[i]));
        }
        getOptions().add(new Option(optionTitles.length, "Quit"));
    }

    public ArrayList<Option> getOptions() { return this.options; }

    public void setOptions(ArrayList<Option> options) { this.options = options; }
}
