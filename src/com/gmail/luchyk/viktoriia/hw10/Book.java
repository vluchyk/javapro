package com.gmail.luchyk.viktoriia.hw10;

import com.gmail.luchyk.viktoriia.hw10.exceptions.BookNotFoundExceptions;

import java.io.File;


public class Book extends File {
    public Book(String pathname) {
        super(pathname);
    }

    public void verify() throws BookNotFoundExceptions {
        if (!this.exists()) throw new BookNotFoundExceptions("The book does not exist.");
    }
}
