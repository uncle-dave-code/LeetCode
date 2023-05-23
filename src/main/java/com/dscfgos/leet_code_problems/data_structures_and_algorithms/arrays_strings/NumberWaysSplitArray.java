package com.dscfgos.leet_code_problems.data_structures_and_algorithms.arrays_strings;

/**
 * (2270) - Number of Ways to Split a String
 * <p>
 * You are given a 0-indexed integer array nums of length n.
 * nums contains a valid split at index i if the following are true:
 * The sum of the first i + 1 elements is greater than or equal to the sum of the last n - i - 1 elements.
 * There is at least one element to the right of i. That is, 0 <= i < n - 1.
 * Return the number of valid splits in nums.
 */
public class NumberWaysSplitArray {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0};

        NumberWaysSplitArray numberWaysSplitArray = new NumberWaysSplitArray();
        System.out.println(numberWaysSplitArray.waysToSplitArray(nums));
    }


    public int waysToSplitArray(int[] nums) {

        long total = 0;
        int result = 0;
        long tmpSum = 0;
        for (int num : nums) {
            total += num;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            tmpSum += nums[i];
            if (tmpSum >= (total - tmpSum)) {
                result++;
            }
        }

        return result;
    }
}
