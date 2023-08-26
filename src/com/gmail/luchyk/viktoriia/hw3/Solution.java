package com.gmail.luchyk.viktoriia.hw3;

import java.util.Arrays;

public class Solution {
    public static boolean isAnagram(String firstText, String secondText) {
        if ((firstText == null && secondText == null) || ("".equals(firstText) && "".equals(secondText))) {
            return true;
        }
        if (firstText == null || secondText == null) {
            return false;
        }
        if (firstText.length() == secondText.length()) {
            String firstTextSorted = sort(firstText.toLowerCase());
            String secondTextSorted = sort(secondText.toLowerCase());
            return firstTextSorted.equalsIgnoreCase(secondTextSorted);
        } else {
            return false;
        }
    }

    private static String sort(String text) {
        if (isNotEmpty(text)) {
            char[] array = text.toCharArray();
            Arrays.sort(array);
            return new String(array);
        } else {
            return text;
        }
    }

    private static boolean isNotEmpty(String text) {
        return text != null && !"".equals(text);
    }
}
