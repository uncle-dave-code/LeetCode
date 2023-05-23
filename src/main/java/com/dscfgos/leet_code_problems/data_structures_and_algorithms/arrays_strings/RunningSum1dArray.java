package com.dscfgos.leet_code_problems.data_structures_and_algorithms.arrays_strings;

import java.util.Arrays;

/**
 * (1480) - Running Sum of 1d Array
 * <p>
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 * <p>
 */
public class RunningSum1dArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        RunningSum1dArray runningSum1dArray = new RunningSum1dArray();
        System.out.println(Arrays.toString(runningSum1dArray.runningSum(nums)));
    }

    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i-1]+nums[i];
        }

        return result;
    }
}
