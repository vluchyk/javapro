package com.gmail.luchyk.viktoriia.hw5.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //runCountOccurance();
        runToList();

        scanner.close();
    }

    private static void runCountOccurance() {
        List<String> sentences;
        sentences = occuranceTestSentences();

        String answer;
        int numberOfMatches;
        do {
            System.out.println("Specify the text to count matches: ");
            String partText = scanner.nextLine();
            numberOfMatches = Collection.countOccurance(sentences, partText);
            System.out.println("Number of matches: " + numberOfMatches);
            System.out.println("Again? Y/N:");
            answer = scanner.nextLine();
        } while ("Y".equalsIgnoreCase(answer));
    }

    private static List<String> occuranceTestSentences() {
        List<String> sentences = new ArrayList<>();
        sentences.add("Java Tutorial");
        sentences.add("Java was originally a programming language invented by Sun Microsystems (Sun was acquired by Oracle in January 2010).");
        sentences.add("Since Java's invention it has become more than just a language.");
        sentences.add("It is also a platform with a set of standard APIs and standard tools.");
        sentences.add("Just exactly what Java has evolved into is covered in more detail in the next text in this tutorial, about what Java is today.");
        sentences.add("This Java tutorial trail (set of articles) describes the Java programming language.");
        sentences.add("The intention of this tutorial is mostly to be a compressed introduction to Java for developers who already know a bit about programming and object-oriented concepts.");
        sentences.add("I will try to explain the various different concepts as I use them, but a bit of programming background will helpful.");
        sentences.add("The target audience for this Java tutorial is both beginners who need to learn Java almost from scratch, and more experienced developers who just need to catch up on features they haven't used.");
        sentences.add("What is Java?");
        sentences.add("Java was originally a programming language invented by Sun Microsystems, by James Gosling.");
        sentences.add("Today Oracle owns Sun, and therefore Java too.");
        sentences.add("Java is thus Oracle's trademark.");
        sentences.add("Over time Java has evolved into more than just a language.");
        sentences.add("It is a full platform with lots of standard APIs, open source APIs, tools, a big developer community with millions of developers etc.");
        sentences.add("It may be a bit unclear what all this means, but you will get a better feeling for it when you start learning more about Java, and start working with it.");
        sentences.add("When people talk about Java they often refer to several different parts of the total concept.");
        sentences.add("That is because Java is more than just a programming language.");
        sentences.add("For a beginner, all these different \"meanings\" can be confusing, so I will explain them briefly so you know what people are talking about.");

        return sentences;
    }

    private static void runToList() {
        int[] numbers = {3, 35, 12, 4, 15};
        List<Integer> convertedNumbers = Collection.toList(numbers);
        System.out.println("Numbers: " + convertedNumbers.toString());
    }
}
