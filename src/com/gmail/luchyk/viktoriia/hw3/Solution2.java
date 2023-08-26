package com.gmail.luchyk.viktoriia.hw3;

public class Solution2 {
    public static boolean isAnagram(String firstText, String secondText) {
        if ((firstText == null && secondText == null) || ("".equals(firstText) && "".equals(secondText))) {
            return true;
        }
        if (firstText == null || secondText == null) {
            return false;
        }
        if (firstText.length() == secondText.length()) {
            return charSum(firstText.toLowerCase()) == charSum(secondText.toLowerCase());
        } else {
            return false;
        }
    }

    private static int charSum(String text) {
        if (isNotEmpty(text)) {
            char[] array = text.toCharArray();
            int total = 0;
            for (int i = 0; i < array.length; i++) {
                total += array[i];
            }
            return total;
        } else {
            return 0;
        }
    }

    private static boolean isNotEmpty(String text) {
        return text != null && !"".equals(text);
    }
}
