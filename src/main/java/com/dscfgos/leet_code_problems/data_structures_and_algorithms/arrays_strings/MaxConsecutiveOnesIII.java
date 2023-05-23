package com.dscfgos.leet_code_problems.data_structures_and_algorithms.arrays_strings;

/**
 * (1004) - Max Consecutive Ones III
 * <p>
 * Given a binary array nums and an integer k,
 * return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
 * <p>
 */
public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        MaxConsecutiveOnesIII maxConsecutiveOnesIII = new MaxConsecutiveOnesIII();
        System.out.println(maxConsecutiveOnesIII.longestOnes(nums, k));
    }

    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        for (; right < nums.length; right++) {

            if (nums[right] == 0) {
                k--;
            }

            if (k < 0) {
                k += 1 - nums[left];
                left++;
            }
        }

        return right - left;
    }
}


