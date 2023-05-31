package com.dscfgos.leet_code_problems.data_structures_and_algorithms.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * (560) - Subarray Sum Equals K
 * Given an array of integers nums and an integer k,
 * return the total number of continuous subarrays whose sum equals to k.
 */
public class SubarraySumEqualsK {
    public static void main(String[] args) {
        SubarraySumEqualsK subarraySumEqualsK = new SubarraySumEqualsK();
        int[] nums = {1, -1, 0};
        System.out.println(subarraySumEqualsK.subarraySum(nums, 0)); // 2


    }

    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        count.put(0, 1);
        int sum = 0;
        int result = 0;
        for (int num : nums) {
            sum += num;
            if (count.containsKey(sum - k)) {
                result++;
            }
            count.put(sum, count.getOrDefault(sum, 0) + 1);
        }

        return result;
    }
}
