package ru.gb.homework.UI.Commands;

import ru.gb.homework.UI.ConsoleUI;

public class GetToyStoreInfo extends Command{
    public GetToyStoreInfo(ConsoleUI consoleUI) {
        super("Get toy store info", consoleUI);
    }
    @Override
    public void execute() {
        getConsoleUI().getToyStoreInfo();
    }
}
