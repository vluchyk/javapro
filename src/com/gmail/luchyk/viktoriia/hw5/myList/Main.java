package com.gmail.luchyk.viktoriia.hw5.myList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //runCountOccurance();
        //runToList();
        //runFindUnique();
        //runCalcOccurance();
        runFindOccurance();
    }

    private static void runCountOccurance() {
        String answer;
        do {
            List<String> words = testData();
            System.out.println(words);
            System.out.println("Specify the word to count matches: ");
            String target = scanner.nextLine();
            System.out.println("Number of matches: " + MyList.countOccurance(words, target));
            System.out.println("Again? Y/N:");
            answer = scanner.nextLine();
        } while ("Y".equalsIgnoreCase(answer));
    }

    private static void runToList() {
        Integer[] numbers = {3, 35, 12, 4, 15};
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("List: " + MyList.toList(numbers));
    }

    private static void runFindUnique() {
        System.out.println(numbersTestData());
        System.out.println(MyList.findUnique(numbersTestData()));
    }

    private static void runCalcOccurance() {
        System.out.println(testData());
        MyList.calcOccurance(testData());
    }

    private static void runFindOccurance() {
        System.out.println(testData());
        System.out.println(MyList.findOccurance(testData()));
    }

    private static List<String> testData() {
        List<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Tutorial");
        words.add("Oracle");
        words.add("programming");
        words.add("language");
        words.add("Java");
        words.add("tutorial");
        words.add("Sun");
        words.add("Microsystems");
        words.add("Language");
        words.add("Oracle");
        words.add("Java");
        words.add("tutorial");
        words.add("API");
        words.add("language");
        words.add("James");
        words.add("Gosling");
        words.add("language");
        words.add("Sun");
        return words;
    }

    private static List<Integer> numbersTestData() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(25);
        numbers.add(3);
        numbers.add(25);
        numbers.add(35);
        numbers.add(2);
        numbers.add(1);
        return numbers;
    }
}
