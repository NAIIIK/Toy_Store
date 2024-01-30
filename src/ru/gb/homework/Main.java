package ru.gb.homework;

import ru.gb.homework.UI.ConsoleUI;
import ru.gb.homework.UI.View;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleUI();
        view.start();
    }
}
