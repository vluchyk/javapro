package com.gmail.luchyk.viktoriia.hw10.exceptions;

import java.io.FileNotFoundException;

public class BookNotFoundException extends FileNotFoundException {
    public BookNotFoundException(String message) {
        super(message);
    }
}
