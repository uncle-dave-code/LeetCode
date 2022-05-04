package com.dscfgos.leet_code_problems.data_structure.two_sum;

import java.util.HashMap;
import java.util.Map;

/**
 * (1) - Two Sum
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = null;
        if (nums != null && nums.length > 0) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    result = new int[]{map.get(complement), i};
                    break;
                }
                map.put(nums[i], i);
            }
        }

        return result;
    }
}
