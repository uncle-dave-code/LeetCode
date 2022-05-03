package com.dscfgos.leet_code_problems.algorithm.binary_search;

/**
 * (704) - Binary Search
 * Given an array of integers nums which is sorted in ascending order,
 * and an integer target, write a function to search target in nums.
 * If target exists, then return its index. Otherwise, return -1.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        return (nums != null && nums.length > 0) ? this.search(nums, target, 0, nums.length - 1) : -1;
    }

    private int search(int[] nums, int target, int lowIndex, int highIndex) {
        int result = -1;
        if (highIndex >= lowIndex) {
            int midIndex = lowIndex + (highIndex - lowIndex) / 2;
            if (nums[midIndex] == target) {
                result = midIndex;
            } else if (nums[midIndex] > target) {
                result = search(nums, target, lowIndex, midIndex - 1);
            } else {
                result = search(nums, target, midIndex + 1, highIndex);
            }
        }
        return result;
    }
}
