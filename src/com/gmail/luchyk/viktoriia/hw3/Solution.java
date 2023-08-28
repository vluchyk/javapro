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
            //quickSort(array, 0, array.length - 1);
            return new String(array);
        } else {
            return text;
        }
    }

    public static void quickSort(char[] array, int first, int last) {
        int left = first;
        int right = last;
        int pivot = array[(left + right) / 2];
        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                char temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
        if (first < right) {
            quickSort(array, first, right);
        }
        if (left < last) {
            quickSort(array, left, last);
        }
    }

    private static boolean isNotEmpty(String text) {
        return text != null && !"".equals(text);
    }
}
