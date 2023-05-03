package com.dscfgos.leet_code_problems.dynamic_programming.min_cost_climbing_stairs;

/**
 * (746) Min Cost Climbing Stairs
 * <p>
 * You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
 * Once you pay the cost, you can either climb one or two steps.
 * You can either start from the step with index 0, or the step with index 1.
 * <p>
 * Return the minimum cost to reach the top of the floor.
 */
public class MinCostClimbingStairs {

    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};

        System.out.println(minCostClimbingStairs(cost));
    }

    private static int minCostClimbingStairs(int[] cost) {
        if(cost == null || cost.length==0){
            return 0;
        }

//        int[] values = new int[cost.length];
//        values[0] = cost[0];
//        values[1] = cost[1];

        for (int i = 2; i < cost.length; i++) {
            cost[i] = Math.min(cost[i]+cost[i-1],cost[i]+cost[i-2]);
        }

        return Math.min(cost[cost.length-1],cost[cost.length-2]);
    }
}
