package com.gmail.luchyk.viktoriia.hw10.exceptions;

import java.io.FileNotFoundException;

public class BookNotFoundExceptions extends FileNotFoundException {
    public BookNotFoundExceptions(String message) {
        super(message);
    }
}
