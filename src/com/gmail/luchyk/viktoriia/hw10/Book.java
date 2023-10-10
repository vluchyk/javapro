package com.gmail.luchyk.viktoriia.hw10;

import com.gmail.luchyk.viktoriia.hw10.exceptions.BookNotFoundException;

import java.io.*;

public class Book extends File {
    public Book(String pathname) {
        super(pathname);
    }

    public void verify() throws BookNotFoundException {
        if (!this.exists()) throw new BookNotFoundException("The book does not exist.");
    }
}
