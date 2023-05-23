package com.dscfgos.leet_code_problems.data_structures_and_algorithms.arrays_strings;

/**
 * (1413) - Minimum Value to Get Positive Step by Step Sum
 * <p>
 * Given an array of integers nums, you start with an initial positive value startValue.
 * In each iteration, you calculate the step by step sum of startValue plus elements in nums (from left to right).
 * Return the minimum positive value of startValue such that the step by step sum is never less than 1.
 * <p>
 */
public class MinimumValuePositiveStepbyStepSum {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, -5, -1};

        var minValue = new MinimumValuePositiveStepbyStepSum();
        System.out.println(minValue.minStartValue(nums)); //5
    }

    public int minStartValue(int[] nums) {
        int sum = nums[0];
        int minValue = sum;
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            if (sum < minValue) {
                minValue = sum;
            }
        }

        return (minValue > 0) ? 1 : 1 - minValue;
    }
}
