package com.dscfgos.leet_code_problems.data_structure.arrays_101.third_maximum_number;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * (414) - Third Maximum Number
 * <p>
 * Given an integer array nums, return the third distinct maximum number in this array.
 * If the third maximum does not exist, return the maximum number.
 */
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {

        if (nums != null && nums.length > 0) {
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                set.add(nums[i]);
            }

            if (set.size() >= 3) {
                for (int i = 0; i < 2; i++) {
                    set.remove(Collections.max(set));
                }
            }

            return Collections.max(set);
        }

        return -1;
    }
}
