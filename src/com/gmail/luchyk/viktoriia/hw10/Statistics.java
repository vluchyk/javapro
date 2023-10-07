package com.gmail.luchyk.viktoriia.hw10;

import java.io.File;

public class Statistics {
    private final Book source;
    private final File target;

    public Statistics(Book source, File target) {
        this.source = source;
        this.target = target;
    }

    public Book getSource() {
        return source;
    }

    public File getTarget() {
        return target;
    }

    public void nMostPopularWords() {

    }
}
