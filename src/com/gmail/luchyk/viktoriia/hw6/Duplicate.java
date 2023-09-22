package com.gmail.luchyk.viktoriia.hw6;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        int[] firstNumbers = {1, 2, 3, 1};
        System.out.println(containsDuplicate(firstNumbers));

        int[] secondNumbers = {1, 2, 3, 4};
        System.out.println(containsDuplicate(secondNumbers));

        int[] thirdNumbers = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(thirdNumbers));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for (int number : nums) {
            numbers.add(number);
        }
        return nums.length != numbers.size();
    }
}
