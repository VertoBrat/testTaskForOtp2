package ru.photorex;

import ru.photorex.service.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Application application = new ApplicationImpl();
        application.startProgram();
    }
}
