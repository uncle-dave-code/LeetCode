package com.dscfgos.leet_code_problems.data_structure.contains_duplicate;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * (53) - Maximum Subarray
 * Given an integer array nums, find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 * <p>
 * A subarray is a contiguous part of an array.
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int currentMax = nums[0];
        int globalMax = nums[0];

        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                //Check if summing the current number plus current maximum is greater than current number.
                currentMax = (nums[i] > currentMax + nums[i]) ? nums[i] : currentMax + nums[i];

                //If current maximum is greater than global maximum then assign the new maximum to global
                if (currentMax > globalMax) {
                    globalMax = currentMax;
                }
            }
        }

        return globalMax;
    }
}
