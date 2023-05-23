package com.dscfgos.leet_code_problems.data_structures_and_algorithms.arrays_strings;

/**
 * (209) Minimum Size Subarray Sum
 * Given an array of positive integers nums and a positive integer target,
 * return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr]
 * of which the sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 */
public class MinimumSizeSubarraySum {

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 2, 4, 3};
        MinimumSizeSubarraySum minimumSizeSubarraySum = new MinimumSizeSubarraySum();
        System.out.println(minimumSizeSubarraySum.minSubArrayLen(7, nums));

    }

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target && left <= i) {
                ans = Math.min(ans, i - left + 1);
                if (ans == 1)
                    return ans;
                sum -= nums[left];
                left++;
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
