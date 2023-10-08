package com.gmail.luchyk.viktoriia.hw10;

import com.gmail.luchyk.viktoriia.hw10.exceptions.BookNotFoundException;

import java.io.*;
import java.util.stream.Stream;


public class Book extends File {
    public Book(String pathname) {
        super(pathname);
    }

    public void verify() throws BookNotFoundException {
        if (!this.exists()) throw new BookNotFoundException("The book does not exist.");
    }

    /*
    public Stream<String> read() throws IOException {
        verify();
        FileReader fileReader = new FileReader(this);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Stream<String> lines = bufferedReader.lines();
//        bufferedReader.close();
        return lines;
    }
     */
}
