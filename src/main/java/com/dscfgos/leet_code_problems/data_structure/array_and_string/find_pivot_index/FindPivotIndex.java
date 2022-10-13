package com.dscfgos.leet_code_problems.data_structure.array_and_string.find_pivot_index;

/**
 * (724) - Find Pivot Index
 * <p>
 * Given an array of integers nums, calculate the pivot index of this array.
 * <p>
 * The pivot index is the index where the sum of all the numbers strictly to
 * the left of the index is equal to the sum of all the numbers strictly to the index's right.
 * <p>
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left.
 * This also applies to the right edge of the array.
 * <p>
 * Return the leftmost pivot index. If no such index exists, return -1.
 */
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        if (nums == null) {
            return -1;
        }

        int sum = 0;
        int leftSum = 0;
        for (int number : nums) {
            sum += number;
        }

        for (int i = 0; i < nums.length; i++) {

            if (leftSum == sum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}
