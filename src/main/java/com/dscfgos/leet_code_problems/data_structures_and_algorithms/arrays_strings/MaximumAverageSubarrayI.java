package com.dscfgos.leet_code_problems.data_structures_and_algorithms.arrays_strings;

/**
 * (643) - Maximum Average Subarray I
 */
public class MaximumAverageSubarrayI {
    public static void main(String[] args) {

        int[] arra = {1, 12, -5, -6, 50, 3};
        int[] arra1 = {-1};

        var maxAverage = new MaximumAverageSubarrayI();
        System.out.println(maxAverage.findMaxAverage(arra, 4));
        System.out.println(maxAverage.findMaxAverage(arra1, 1));
    }

    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        //sum first k elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double result = sum;
        //start from k. new sum is equal to previous sum + current element - element k steps before
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            result = Math.max(result, sum); //compare sum with previous sum and update result
        }
        return result / k; //return average
    }


}
