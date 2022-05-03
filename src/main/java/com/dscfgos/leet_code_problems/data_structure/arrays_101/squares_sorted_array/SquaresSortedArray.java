package com.dscfgos.leet_code_problems.data_structure.arrays_101.squares_sorted_array;

import java.util.Arrays;

/**
 * (977) - Squares of a Sorted Array
 * Given an integer array nums sorted in non-decreasing order,
 * return an array of the squares of each number sorted in non-decreasing order.
 */
public class SquaresSortedArray {
    public int[] squareAndSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);

        return nums;
    }
}
