package com.dscfgos.leet_code_problems.daily_challenge.max_number_k_sum_pairs;

import java.util.HashMap;
import java.util.Map;

/**
 * (1679) - Max Number of K-Sum Pairs
 * <p>
 * You are given an integer array nums and an integer k.
 * <p>
 * In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
 * <p>
 * Return the maximum number of operations you can perform on the array.
 */
public class MaxNumberKSumPairs {
    public int maxOperations(int[] nums, int k) {
        int result = 0;
        if (nums != null && nums.length > 0) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = k - nums[i];

                int value = map.getOrDefault(complement, 0);
                if (value > 0) {
                    result++;
                    map.put(complement,--value);
                } else {
                    map.put(nums[i], map.getOrDefault(nums[i],0) +1);
                }
            }
        }
        return result;
    }
}
