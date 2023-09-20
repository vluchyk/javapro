package com.gmail.luchyk.viktoriia.hw6;

import java.util.Arrays;
import java.util.HashMap;

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
    /*
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> collector = new HashMap<>();
        for (int number : nums) {
            if (collector.containsKey(number)) {
                return new int[]{number, collector.get(number)};
            } else {
                collector.put(target - number, number);
            }
        }
        return null;
    }
     */

    /*
    public static int[] twoSum(int[] nums, int target) {
        // 3, 10, 8, 45, 5, target = 15
        // 3, 5, 8, 10, 45
        // 3, 5, 10, 25, 43, 44, 45
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int total = nums[left] + nums[right];
            if (total > target) {
                right--;
            } else if (total < target) {
                left++;
            } else {
                return new int[] {left, right};
            }
        }
        return null;
    }
     */
}