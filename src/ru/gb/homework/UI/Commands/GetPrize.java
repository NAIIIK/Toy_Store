package ru.gb.homework.UI.Commands;

import ru.gb.homework.UI.ConsoleUI;

public class GetPrize extends Command{
    public GetPrize(ConsoleUI consoleUI) {
        super("Get the prize", consoleUI);
    }
    @Override
    public void execute() {
        getConsoleUI().getPrizeToy();
    }
}
