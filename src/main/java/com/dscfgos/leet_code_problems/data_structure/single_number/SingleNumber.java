package com.dscfgos.leet_code_problems.data_structure.single_number;

import java.util.HashSet;
import java.util.Set;

/**
 * 136 - Single Number
 * <p>
 * Given a non-empty array of integers nums, every element appears twice except for one.
 * Find that single one.
 * <p>
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }

        return set.iterator().next();
    }
}
