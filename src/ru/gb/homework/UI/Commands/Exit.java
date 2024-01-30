package ru.gb.homework.UI.Commands;

import ru.gb.homework.UI.ConsoleUI;

public class Exit extends Command{
    public Exit(ConsoleUI consoleUI) {
        super("Exit", consoleUI);
    }
    @Override
    public void execute() {
        getConsoleUI().finish();
    }
}
