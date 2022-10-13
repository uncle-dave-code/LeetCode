package com.dscfgos.leet_code_problems.data_structure.array_and_string.minimum_size_subarray_sum;

/**
 * Minimum Size Subarray Sum
 * <p>
 * Given an array of positive integers nums and a positive integer target,
 * return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr]
 * of which the sum is greater than or equal to target.
 * <p>
 * If there is no such subarray, return 0 instead.
 */
public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int result = -1;

        if (nums != null && nums.length > 0) {
            if (nums[0] >= target) {
                return 1;
            }

            int currentIndex = 0;
            boolean found = true;
            while (currentIndex < nums.length && found == true) {
                int sum = 0;
                int count = 0;
                found = false;
                for (int i = currentIndex; i < nums.length; i++) {
                    count++;
                    sum += nums[i];
                    if (sum >= target) {
                        result = (result == -1) ? count : Math.min(count, result);
                        found = true;
                        break;
                    }
                }
                currentIndex++;
            }
        }
        return (result == -1) ? 0 : result;
    }
}
