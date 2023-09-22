package com.gmail.luchyk.viktoriia.hw6;

import java.util.LinkedList;
import java.util.List;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
        System.out.println();

        System.out.println(isPalindrome2("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome2("race a car"));
        System.out.println(isPalindrome2(" "));
    }

    public static boolean isPalindrome(String text) {
        text = (text != null) ? text.toLowerCase() : "";

        String concatenated = text.replaceAll("[^A-Za-z\\d]+", "");
        StringBuilder copy = new StringBuilder(concatenated);
        String reversed = String.valueOf(copy.reverse());

        return concatenated.equals(reversed);
    }

    public static boolean isPalindrome2(String text) {
        text = (text != null) ? text.toLowerCase() : "";

        String concatenated = text.replaceAll("[^A-Za-z\\d]+", "");
        List<String> letters = new LinkedList<>();
        for (int i = 0; i < concatenated.length(); i++) {
            letters.add(String.valueOf(concatenated.charAt(i)));
        }
        int countOfSteps = letters.size() / 2;
        for (int i = 0; i < countOfSteps; i++) {
            if (!letters.get(i).equals(letters.get(letters.size() - 1 - i))) return false;
        }
        return true;
    }
}