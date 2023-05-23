package com.dscfgos.leet_code_problems.data_structures_and_algorithms.arrays_strings;

import java.util.Arrays;

/**
 * (303) Range Sum Query - Immutable
 * Given an integer array nums, handle multiple queries of the following type:
 * <p>
 * Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
 * Implement the NumArray class:
 * NumArray(int[] nums) Initializes the object with the integer array nums.
 * int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right
 * inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 * <p>
 */
public class RangeSumQuery {
    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(numArray.sumRange(0, 2)); // return (-2) + 0 + 3 = 1
        System.out.println(numArray.sumRange(2, 5)); // return 3 + (-5) + 2 + (-1) = -1
        System.out.println(numArray.sumRange(0, 5)); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
//        System.out.println(numArray.sumRange(0, 0)); // return -1;
    }
}

class NumArray {
//    private final int[] nums;
    private int[] sums;

    public NumArray(int[] nums) {
//        this.nums = Arrays.copyOf(nums, nums.length);
        sums = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sums[i + 1] = sums[i] + nums[i];
        }

//        sums = new int[nums.length + 1];
//        for (int i = 0; i < nums.length; i++) {
//            sums[i + 1] = sums[i] + nums[i];
//        }
    }

//    public int sumRange(int left, int right) { //Brute Force
//        int sum = 0;
//        if (left <= right && right < nums.length) {
//
//            for (int i = left; i <= right; i++) {
//                sum += nums[i];
//            }
//        }
//
//        return sum;
//    }

    public int sumRange(int left, int right) {
        return sums[right + 1] - sums[left];
    }
}
