package ru.gb.homework.UI.Commands;

import ru.gb.homework.UI.ConsoleUI;

public class CheckPrize extends Command {
    public CheckPrize(ConsoleUI consoleUI) {
        super("Check your prize information", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().checkPrize();
    }
}
