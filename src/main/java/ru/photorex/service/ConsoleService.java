package ru.photorex.service;


import java.util.Scanner;

public class ConsoleService implements IOService {

    private final ConsoleContext consoleContext;

    public ConsoleService() {
        this.consoleContext = new ConsoleContext(System.in, System.out);
    }

    @Override
    public String readString() {
        Scanner sc = new Scanner(consoleContext.getInputStream());
        return sc.nextLine();
    }

    @Override
    public void printString(String s) {
        consoleContext.getPrintStream().println(s);
    }
}
