package com.gmail.luchyk.viktoriia.hw10;

import com.gmail.luchyk.viktoriia.hw10.exceptions.BookNotFoundException;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Statistics {
    private final Book source;
    private final File result;

    public Statistics(Book source, File result) {
        this.source = source;
        this.result = result;
    }

    public Book getSource() {
        return source;
    }

    public File getResult() {
        return result;
    }

    public void nMostPopularWords(int topN) {
        try {
            this.source.verify();
        } catch (BookNotFoundException e) {
            System.out.println(e);
        }

        try (FileReader fileReader = new FileReader(this.source);
             BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            Stream<String> lines = bufferedReader.lines();

            Map<String, Long> words = lines.flatMap(line -> Arrays.stream(line.split("\\b")))
                    .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
//          System.out.println(words);
//          System.out.println("Size: " + words.size());

            List<Map.Entry<String, Long>> mostPopular = words.entrySet().stream()
                    .filter(word -> word.getKey().length() > 2)
                    .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                    .limit(topN)
                    .collect(Collectors.toList());

            System.out.println("Most popular words: ".toUpperCase());
            System.out.println(mostPopular);
            System.out.println("Unique word count: ".toUpperCase() + words.size());

            FileWriter fileWriter = new FileWriter(this.result, true);
            fileWriter.write("Most popular words: ".toUpperCase() + "\n");
            for (Map.Entry<String, Long> element : mostPopular) {
                fileWriter.write(element.getKey() + " -> " + element.getValue() + "\n");
            }
            fileWriter.write("Unique word count: ".toUpperCase() + words.size() + "\n");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("The book is either missing or damaged. Please check.");
        }
    }
}