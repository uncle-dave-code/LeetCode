package com.dscfgos.leet_code_problems.dynamic_programming.house_robber;

import java.util.HashMap;
import java.util.Map;

/**
 * (198) - House Robber
 * <p>
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is
 * that adjacent houses have security systems connected and it will automatically contact the police if two
 * adjacent houses were broken into on the same night.
 * <p>
 */
public class HouseRobber {
    private static Map<Integer, Integer> memo = new HashMap<>();
    private static int[] nums = null;

    public static void main(String[] args) {
        nums = new int[]{2, 7, 9, 3, 1};

        System.out.println(rob2());
    }

    private static int rob(int position) {
        if (nums.length > 0) {
            //TODO init positions
            if (position == 0) {
                return nums[0];
            }
            if (position == 1) {
                return Math.max(nums[0], nums[1]);
            }
            if (!memo.containsKey(position)) {
                int value = Math.max(rob(position - 1), rob(position - 2) + nums[position]);
                memo.put(position, value);
            }

            return memo.get(position);
        }

        return 0;
    }

    private static int rob2() {
        if (nums.length > 0) {
            //TODO init positions
            if (nums.length == 1) {
                return nums[0];
            }

            int[] values = new int[nums.length];
            values[0] = nums[0];
            values[1] = Math.max(nums[0], nums[1]);

            for (int i = 2; i < nums.length; i++) {
                values[i] = Math.max(values[i - 1], nums[i] + values[i - 2]);
            }

            return values[nums.length - 1];
        }

        return 0;
    }
}
