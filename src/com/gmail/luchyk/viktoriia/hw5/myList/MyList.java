package com.gmail.luchyk.viktoriia.hw5.myList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList {
    public static int countOccurance(List<String> words, String target) {
        int count = 0;
        for (String word : words) {
            if (word.contains(target)) count++;
        }
        return count;
    }

    public static List<Integer> toList(Integer[] numbers) {
        return Arrays.asList(numbers);
    }

    public static List<Integer> findUnique(List<Integer> numbers) {
        List<Integer> unique = new ArrayList<>();
        for (Integer number : numbers) {
            if (!unique.contains(number)) unique.add(number);
        }
        return unique;
    }

    public static void calcOccurance(List<String> words) {
        List<String> unique = new ArrayList<>();
        for (String word : words) {
            if (unique.contains(word)) continue;
            int count = 0;
            for (String w : words) {
                if (w.equals(word)) count++;
            }
            System.out.printf("%s : %d\n", word, count);
            unique.add(word);
        }
    }

    public static List<String> findOccurance(List<String> words) {
        List<String> unique = new ArrayList<>();
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (unique.contains(word)) continue;
            int count = 0;
            for (String w : words) {
                if (w.equals(word)) count++;
            }
            result.add("\nname: " + "\"" + word + "\", " + "occurrence: " + count);
            unique.add(word);
        }
        return result;
    }
}