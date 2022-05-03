package com.dscfgos.leet_code_problems.algorithm.insert_position;

/**
 * (35) - Search Insert Position
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class InsertPosition {
    public int searchInsert(int[] nums, int target) {
        return searchInsert(nums, target, 0, nums.length - 1);
    }

    private int searchInsert(int[] nums, int target, int lowIndex, int highIndex) {
        if (highIndex >= lowIndex) {
            int mid = lowIndex + (highIndex - lowIndex) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                return this.searchInsert(nums, target, lowIndex, mid - 1);
            } else {
                return this.searchInsert(nums, target, mid + 1, highIndex);
            }
        } else {
            return lowIndex;
        }
    }
}
