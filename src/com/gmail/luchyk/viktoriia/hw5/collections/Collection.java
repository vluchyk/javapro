package com.gmail.luchyk.viktoriia.hw5.collections;

import java.util.ArrayList;
import java.util.List;

public class Collection {
    public static int countOccurance(List<String> sentences, String partText) {
        int numberOfMatches = 0;
        for (String sentence : sentences) {
            numberOfMatches += countOccuranceIn(sentence, partText);
        }
        return numberOfMatches;
    }

    public static List<Integer> toList(int[] numbers) {
        List<Integer> convertedNumbers = new ArrayList<>();
        for (int number : numbers) {
            convertedNumbers.add(number);
        }
        return convertedNumbers;
    }

    private static int countOccuranceIn(String sentence, String partText) {
        String modifiedSentence = (isNotEmpty(sentence)) ? sentence.toLowerCase() : "";
        partText = (isNotEmpty(partText)) ? partText.toLowerCase() : "";
        int numberOfMatches = 0;
        while (modifiedSentence.contains(partText)) {
            modifiedSentence = modifiedSentence.replaceFirst(partText, "");
            numberOfMatches++;
        }
        return numberOfMatches;
    }

    private static boolean isNotEmpty(String text) {
        return text != null && !"".equals(text);
    }
}
