package com.twu.biblioteca;

import com.twu.biblioteca.listener.Listener;
import com.twu.biblioteca.listener.QuitListener;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by twer on 15/8/11.
 */
public class Menu {
    private static Stack<Menu> menuStack = new Stack<Menu>();

    private String introduce;

    private ArrayList<Option> options;

    private ArrayList<Listener> optionListeners;

    public Menu(String introduce, String[] optionTitles, Listener[] optionListeners) {
        setIntroduce(introduce);
        setOptions(new ArrayList<Option>());
        setOptionListeners(new ArrayList<Listener>());

        for (int i = 0; i < optionTitles.length; i++) {
            getOptions().add(new Option(i, optionTitles[i]));
            getOptionListeners().add(optionListeners[i]);
        }
        getOptions().add(new Option(optionTitles.length, "Quit"));
        getOptionListeners().add(new QuitListener());
    }

    public void printMenu() {
        System.out.println("====================");
        System.out.println(getIntroduce());
        for (int i = 0; i < getOptions().size(); i++) {
            System.out.println(i + ". " + getOptions().get(i).getTitle());
        }
    }

    public void checkInput(String input) {
        int choose;
        try {
            choose = Integer.parseInt(input);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Select a valid option!");
            return;
        }
        if (choose >= getOptions().size()) {
            System.out.println("Select a valid option!");
            return;
        }

        getOptionListeners().get(choose).call();
    }

    public String getIntroduce() { return this.introduce; }

    public void setIntroduce(String introduce) { this.introduce = introduce; }

    public static Stack<Menu> getMenuStack() { return menuStack; }

    public ArrayList<Option> getOptions() { return this.options; }

    public void setOptions(ArrayList<Option> options) { this.options = options; }

    public ArrayList<Listener> getOptionListeners() { return this.optionListeners; }

    public void setOptionListeners(ArrayList<Listener> optionListeners) { this.optionListeners = optionListeners; }
}
