package com.dscfgos.leet_code_problems.data_structure.array_and_string.largest_number_at_least_twice_others;

/**
 * Largest Number At Least Twice of Others
 * <p>
 * You are given an integer array nums where the largest integer is unique.
 * <p>
 * Determine whether the largest element in the array is at least twice as much
 * as every other number in the array. If it is, return the index of the largest element,
 * or return -1 otherwise.
 */
public class LargestNumberAtLeastTwiceOthers {
    public int dominantIndex(int[] nums) {
        if (nums != null && nums.length > 0) {
            int largestIndex = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > nums[largestIndex]) {
                    largestIndex = i;
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (i != largestIndex) {
                   if(nums[i]*2>nums[largestIndex]){
                       return -1;
                   }
                }
            }

            return largestIndex;
        }

        return -1;
    }
}
