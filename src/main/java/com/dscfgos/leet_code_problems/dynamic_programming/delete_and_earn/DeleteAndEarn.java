package com.dscfgos.leet_code_problems.dynamic_programming.delete_and_earn;

import java.util.HashMap;
import java.util.Map;

/**
 * (740) Delete and Earn
 * <p>
 * You are given an integer array nums. You want to maximize the number of
 * points you get by performing the following operation any number of times:
 * <p>
 */
public class DeleteAndEarn {

    private static int[] nums = {2, 2, 3, 3, 3, 4};
    private static Map<Integer, Integer> points = new HashMap<>();
    private static Map<Integer, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        DeleteAndEarn deleteAndEarn = new DeleteAndEarn();

        System.out.println(deleteAndEarn.deleteAndEarn(nums));
    }

    public int deleteAndEarn(int[] nums) {
        int maxNumber = 0;

        // Precompute how many points we gain from taking an element
        for (int num : nums) {
            points.put(num, points.getOrDefault(num, 0) + num);
            maxNumber = Math.max(maxNumber, num);
        }

        return maxPoints(maxNumber);
    }

    private static int maxPoints(int num) {
        //Base cases
        if (num == 0) {
            return 0;
        }

        if (num == 1) {
            return points.getOrDefault(1, 0);
        }

        if (cache.containsKey(num)) {
            return cache.get(num);
        }

        //recursive case
        int gain = points.getOrDefault(num, 0);
        cache.put(num, Math.max(maxPoints(num - 1), maxPoints(num - 2) + gain));

        return cache.get(num);
    }

    private static int[] maxPoints ;
    public int deleteAndEarnRecursive(int[] nums) {
        int maxNumber = 0;

        // Precompute how many points we gain from taking an element
        for (int num : nums) {
            points.put(num, points.getOrDefault(num, 0) + num);
            maxNumber = Math.max(maxNumber, num);
        }

        maxPoints = new int[maxNumber+1];

        maxPoints[0] = 0;
        maxPoints[1] = points.getOrDefault(1, 0);

        for (int i = 2; i <= maxNumber; i++) {
            int gain = points.getOrDefault(i, 0);
            maxPoints[i] = Math.max(maxPoints[i-1], maxPoints[i-2] + gain);
        }

        return maxPoints[maxNumber];
    }
}
