package com.dscfgos.leet_code_problems.data_structures_and_algorithms.arrays_strings;

import java.util.Arrays;

/**
 * (977) - Squares of a Sorted Array
 * <p>
 * Given an integer array nums sorted in non-decreasing order,
 * return an array of the squares of each number sorted in non-decreasing order.
 */
public class SquaresSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {-4, -1, 0, 3, 10};
        int[] nums2 = {-7, -3, 2, 3, 11};

        System.out.println(Arrays.toString(new SquaresSortedArray().sortedSquares(nums1)));
        System.out.println(Arrays.toString(new SquaresSortedArray().sortedSquares(nums2)));

    }

    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int left = 0, right = nums.length - 1, current = nums.length - 1;

        while (left < right) {
            int num1 = Math.abs(nums[left]);
            int num2 = Math.abs(nums[right]);

            if (num1 > num2) {
                result[current--] = num1 * num1;
                left++;
            } else if (num2 > num1) {
                result[current--] = num2 * num2;
                right--;
            } else {
                result[current--] = num2 * num2;
                result[current--] = num2 * num2;
                left++;
                right--;
            }
        }

        if (left == right) {
            result[current] = nums[left] * nums[left];
        }

        return result;
    }
}
