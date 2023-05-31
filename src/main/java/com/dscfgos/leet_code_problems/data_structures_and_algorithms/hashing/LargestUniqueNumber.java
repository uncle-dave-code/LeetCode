package com.dscfgos.leet_code_problems.data_structures_and_algorithms.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * (1133) - Largest Unique Number
 * <p>
 * Given an array of integers A, return the largest integer that only occurs once.
 * If no integer occurs once, return -1.
 */
public class LargestUniqueNumber {

    public static void main(String[] args) {
        LargestUniqueNumber largestUniqueNumber = new LargestUniqueNumber();
        int[] nums = {5, 7, 3, 9, 4, 9, 8, 3, 1};
        int largestUniqueNumber1 = largestUniqueNumber.largestUniqueNumber(nums);
        System.out.println(largestUniqueNumber1); // 8
    }

    public int largestUniqueNumber(int[] nums) {
        int result = -1;

        Map<Integer, Boolean> uniqueNumbers = new HashMap<>();
        for (int num : nums) {
            uniqueNumbers.put(num, !uniqueNumbers.containsKey(num));
        }

        for (Map.Entry<Integer, Boolean> entry : uniqueNumbers.entrySet()) {
            if (entry.getValue() && entry.getKey() > result) {
                result = entry.getKey();
            }
        }

        return result;
    }
}
