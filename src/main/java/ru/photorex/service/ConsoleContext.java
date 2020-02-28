package ru.photorex.service;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

@Getter
@Setter
@RequiredArgsConstructor
public class ConsoleContext {

    private final InputStream inputStream;
    private final PrintStream printStream;
    private ByteArrayOutputStream outputStream;
}
