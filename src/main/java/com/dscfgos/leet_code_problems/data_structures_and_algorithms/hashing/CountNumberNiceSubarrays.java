package com.dscfgos.leet_code_problems.data_structures_and_algorithms.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * (1248) - Count Number of Nice Subarrays
 * Given an array of integers nums and an integer k.
 * A subarray is called nice if there are k odd numbers on it.
 * Return the number of nice sub-arrays.
 */
public class CountNumberNiceSubarrays {

    public static void main(String[] args) {
        CountNumberNiceSubarrays countNumberNiceSubarrays = new CountNumberNiceSubarrays();
        int[] nums = {2, 2, 2, 1, 2, 2, 1, 2, 2, 2};
        System.out.println(countNumberNiceSubarrays.numberOfSubarrays(nums, 2)); // 2
    }

    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        count.put(0, 1);

        int result = 0;
        int sum = 0;

        for (int num : nums) {
            sum += num % 2;
            result += count.getOrDefault(sum - k, 0);
            count.put(sum, count.getOrDefault(sum, 0) + 1);
        }

        return result;
    }
}
