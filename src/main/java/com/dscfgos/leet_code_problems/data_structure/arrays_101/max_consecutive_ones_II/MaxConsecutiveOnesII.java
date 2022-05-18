package com.dscfgos.leet_code_problems.data_structure.arrays_101.max_consecutive_ones_II;

/**
 * (487) - Max Consecutive Ones II
 * <p>
 * Given a binary array nums, return the maximum number of
 * consecutive 1's in the array if you can flip at most one 0.
 */
public class MaxConsecutiveOnesII {
    public int findMaxConsecutiveOnes(int[] nums) {

        boolean flip = false;
        int max = 0;
        int pointer = 0;
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && flip) {
                pointer++;
                i = pointer;
                counter = 0;
                flip = false;
                continue;
            } else if (nums[i] == 0) {
                flip = true;
                counter++;
            } else {
                counter++;
            }
            max = (max >= counter) ? max : counter;
        }
        return max;
    }
}
