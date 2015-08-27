package com.twu.biblioteca.listener;

import com.twu.biblioteca.Menu;

/**
 * Created by twer on 15/8/12.
 */
public class QuitListener implements Listener {
    public void call() {
        Menu.getMenuStack().pop();
    }
}
