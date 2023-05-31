package com.dscfgos.leet_code_problems.data_structures_and_algorithms.arrays_strings;

import java.util.Arrays;

/**
 * (2090) - K Radius Subarray Averages
 * You are given a 0-indexed array nums of n integers, and an integer k.
 * <p>
 * The k-radius average for a subarray of nums centered at some index i
 * with the radius k is the average of all elements in nums between the
 * indices i - k and i + k (inclusive).
 * If there are less than k elements before or after the index i, then the k-radius average is -1.
 * <p>
 * Build and return an array avgs of length n where avgs[i]
 * is the k-radius average for the subarray centered at index i.
 * <p>
 * The average of x elements is the sum of the x elements divided by x,
 * using integer division.
 * The integer division truncates toward zero, which means losing its fractional part.
 */
public class KRadiusSubarrayAverages {

    public static void main(String[] args) {
        KRadiusSubarrayAverages kRadiusSubarrayAverages = new KRadiusSubarrayAverages();
        int[] nums = {8};
        int k = 100000;
        int[] result = kRadiusSubarrayAverages.getAverages1(nums, k);

        System.out.println(Arrays.toString(result));
    }

    //Prefix Sum
    public int[] getAverages1(int[] nums, int k) {

        int[] result = new int[nums.length];

        Arrays.fill(result, -1);

        if (nums.length < k * 2 + 1) {
            return result;
        }

        long[] prefix = new long[nums.length + 1];
        prefix[0] = 0;
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
        }

        for (int i = k; i < nums.length - k; i++) {
            long sum = prefix[i + k + 1] - prefix[i - k];
            result[i] = (int) (sum / (2 * k + 1));
        }

        return result;
    }

    //Sliding Window
    public int[] getAverages2(int[] nums, int k) {

        int slideSize = (k * 2 + 1);
        int[] result = new int[nums.length];

        Arrays.fill(result, -1);
        if (nums.length < k * 2 + 1) {
            return result;
        }
        long slideSum = 0;
        for (int i = 0; i < slideSize; i++) {
            slideSum += nums[i];
        }

        result[k] = (int) (slideSum / slideSize);
        for (int i = k + 1; i < nums.length - k; i++) {
            slideSum = slideSum - nums[i - k - 1] + nums[i + k];
            result[i] = (int) (slideSum / slideSize);
        }

        return result;
    }
}
