package com.dscfgos.leet_code_problems.algorithm.split_array_largest_sum;

import java.util.Arrays;

/**
 * (410) - Split Array Largest Sum
 * <p>
 * Given an array nums which consists of non-negative integers and an integer m,
 * you can split the array into m non-empty continuous subarrays.
 * <p>
 * Write an algorithm to minimize the largest sum among these m subarrays.
 */
public class SplitArrayLargestSum {

    public int splitArray(int[] nums, int m) {
        int sum = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, nums[i]);
        }

        int left = max;
        int right = sum;
        int minimumLargestSplitSum = 0;

        while (left <= right) {
            int maxSumAllowed = left + (right - left) / 2;

            if (minimumSubarraysRequired(nums, maxSumAllowed) <= m) {
                right = maxSumAllowed - 1;
                minimumLargestSplitSum = maxSumAllowed;
            } else {
                left = maxSumAllowed + 1;
            }
        }
        return minimumLargestSplitSum;

    }

    private int minimumSubarraysRequired(int[] nums, int maxSumAllowed) {
        int currentSum = 0;
        int splitRequired = 0;

        for (int i = 0; i < nums.length; i++) {
            if (currentSum + nums[i] > maxSumAllowed) {
                splitRequired++;
                currentSum = nums[i];
            } else {
                currentSum += nums[i];
            }
        }

        return splitRequired + 1;
    }

}
