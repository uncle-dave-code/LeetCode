package com.dscfgos.leet_code_problems.algorithm.find_duplicate_number;

import java.util.HashSet;
import java.util.Set;

/**
 * (287) - Find the Duplicate Number
 * <p>
 * Given an array of integers nums containing n + 1 integers
 * where each integer is in the range [1, n] inclusive.
 * <p>
 * There is only one repeated number in nums, return this repeated number.
 * <p>
 * You must solve the problem without modifying the array nums and uses only constant extra space.
 */
public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return nums[i];
            }
            set.add(nums[i]);
        }

        return -1;
    }


}
