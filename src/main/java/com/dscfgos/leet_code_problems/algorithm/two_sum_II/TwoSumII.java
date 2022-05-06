package com.dscfgos.leet_code_problems.algorithm.two_sum_II;

/**
 * (167) - Two Sum II - Input Array Is Sorted
 * <p>
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
 * find two numbers such that they add up to a specific target number.
 * Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 * <p>
 * Return the indices of the two numbers, index1 and index2,
 * added by one as an integer array [index1, index2] of length 2.
 * <p>
 * The tests are generated such that there is exactly one solution.
 * You may not use the same element twice.
 * <p>
 * Your solution must use only constant extra space.
 */
public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {

        if (numbers != null && numbers.length > 1) {
            for (int i = 0; i < numbers.length - 1; i++) {
                int complement = target - numbers[i];

                int result = this.search(numbers, complement, i+1, numbers.length - 1);
                if (result != -1) {
                    return new int[]{i + 1, result + 1};
                }
            }
        }
        return null;
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
