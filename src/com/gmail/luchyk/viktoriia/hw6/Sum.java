package com.gmail.luchyk.viktoriia.hw6;

import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        int[] firstNumbers = {2, 7, 11, 15};
        int firstTarget = 9;
        int[] firstResult = twoSum(firstNumbers, firstTarget);
        System.out.println(Arrays.toString(firstNumbers) + ", target: " + firstTarget);
        System.out.println("Indices of the two numbers that add up to target: " + Arrays.toString(firstResult));
        System.out.println();

        int[] secondNumbers = {3, 2, 4};
        int secondTarget = 6;
        int[] secondResult = twoSum(secondNumbers, secondTarget);
        System.out.println(Arrays.toString(secondNumbers) + ", target: " + secondTarget);
        System.out.println("Indices of the two numbers that add up to target: " + Arrays.toString(secondResult));
        System.out.println();

        int[] thirdNumbers = {3, 3};
        int thirdTarget = 6;
        int[] thirdResult = twoSum(thirdNumbers, thirdTarget);
        System.out.println(Arrays.toString(thirdNumbers) + ", target: " + thirdTarget);
        System.out.println("Indices of the two numbers that add up to target: " + Arrays.toString(thirdResult));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}