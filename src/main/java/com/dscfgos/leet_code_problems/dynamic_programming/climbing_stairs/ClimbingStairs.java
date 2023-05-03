package com.dscfgos.leet_code_problems.dynamic_programming.climbing_stairs;

import java.util.HashMap;
import java.util.Map;

/**
 * (70) - Climbing Stairs
 * <p>
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 */
public class ClimbingStairs {

    private static Map<Integer, Integer> map = new HashMap<>();
    private static int[] steps;

    public static void main(String[] args) {
        steps = new int[3];
        System.out.println(stepsCount3(3));
    }

    //With memoization
    private static int stepsCount1(int staircase) {
        if (staircase == 1 || staircase == 2) {
            return staircase;
        }

        if (!map.containsKey(staircase)) {
            map.put(staircase, stepsCount1(staircase - 1) + stepsCount1(staircase - 2));
        }

        return map.get(staircase);
    }

    //With memoization
    private static int stepsCount2(int staircase) {
        if (staircase == 1 || staircase == 2) {
            return staircase;
        }

        if (steps[staircase - 1] == 0) {
            steps[staircase - 1] = stepsCount2(staircase - 1) + stepsCount2(staircase - 2);
        }

        return steps[staircase - 1];
    }

    //Without memoization
    private static int stepsCount3(int staircase) {
        if (staircase == 1 || staircase == 2) {
            return staircase;
        }

        int[] steps2 = new int[3];

        steps2[0] = 1; //Base cases
        steps2[1] = 2; //Base cases

        for (int i = 2; i < staircase; i++) {
            steps2[i] = steps2[i - 1] + steps2[i - 2];
        }

        return steps2[staircase - 1];
    }

}


