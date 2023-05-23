package com.dscfgos.leet_code_problems.data_structures_and_algorithms.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * (1) Two Sum
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 * You can return the answer in any order.
 * <p>
 */
public class TwoSum {
    public static void main(String[] args) {

        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum.twoSum(nums, target)));

    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapNumPos = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (mapNumPos.containsKey(target - nums[i])) {
                return new int[]{mapNumPos.get(target - nums[i]), i};
            }
            mapNumPos.put(nums[i], i);

        }
        return new int[]{-1, -1};
    }
}
