package com.twu.biblioteca;

/**
 * Created by twer on 15/8/12.
 */
public class QuitListener extends Listener {
    public void call() {
        Menu.getMenuStack().pop();
    }
}
