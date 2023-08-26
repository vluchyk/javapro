package com.gmail.luchyk.viktoriia.hw3;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String answer;
        do {
            System.out.print("Specify the first string: ");
            String firstText = scanner.nextLine();
            System.out.print("Specify the second string: ");
            String secondText = scanner.nextLine();
            if (Solution.isAnagram(firstText, secondText)) {
//            if (Solution2.isAnagram(firstText, secondText)) {
                System.out.println("The two strings are anagram of each other.");
            } else {
                System.out.println("The two strings are not anagram of each other.");
            }
            System.out.println("Again? Y/N:");
            answer = scanner.nextLine();
        } while ("Y".equalsIgnoreCase(answer));

        scanner.close();
    }
}
