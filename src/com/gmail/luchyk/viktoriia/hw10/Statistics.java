package com.gmail.luchyk.viktoriia.hw10;

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

    public void nMostPopularWords(int topN) throws IOException {
//        Stream<String> lines = this.source.read();
        this.source.verify();
        FileReader fileReader = new FileReader(this.source);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Stream<String> lines = bufferedReader.lines();

        Map<String, Long> grouped = lines.flatMap(line -> Arrays.stream(line.split("\\b")))
                .filter(word -> word.length() > 2)
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
//        System.out.println(grouped);
//        System.out.println("Size: " + grouped.size());

        List<Map.Entry<String, Long>> mostPopular = grouped.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(topN)
                .collect(Collectors.toList());

        System.out.println("Most popular words: ".toUpperCase());
        System.out.println(mostPopular);
        System.out.println("Unique word count: ".toUpperCase() + grouped.size());

        FileWriter fileWriter = new FileWriter(this.result, true);
        fileWriter.write("Most popular words: ".toUpperCase() + "\n");
        for (Map.Entry<String, Long> element : mostPopular) {
            fileWriter.write(element.getKey() + " -> " + element.getValue() + "\n");
        }
        fileWriter.write("Unique word count: ".toUpperCase() + grouped.size() + "\n");
        fileWriter.close();

        bufferedReader.close();
    }
}
