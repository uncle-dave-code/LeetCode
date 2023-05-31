package com.dscfgos.leet_code_problems.data_structures_and_algorithms.hashing;

import java.util.*;

/**
 * (2248) - Intersection of Multiple Arrays
 * Given n integer arrays nums, return an array of all the integers that appear
 * in all the arrays in nums sorted in ascending order.
 */
public class IntersectionMultipleArrays {

    public static void main(String[] args) {
        IntersectionMultipleArrays intersectionMultipleArrays = new IntersectionMultipleArrays();
        int[][] nums = {{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}};
        System.out.println(intersectionMultipleArrays.intersection(nums));
    }

    public List<Integer> intersection(int[][] nums) {

        Map<Integer, Integer> count = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        if (nums.length > 1) {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int num : nums[i]) {
                    count.put(num, count.getOrDefault(num, 0) + 1);
                }
            }
            for (int num : nums[nums.length - 1]) {
                Integer counter = count.get(num);
                if (counter != null && counter == nums.length - 1) {
                    result.add(num);
                }
            }
        } else if (nums.length == 1) {
            for (int num : nums[0]) {
                result.add(num);
            }
        }
        Collections.sort(result);
        return result;
    }
}
