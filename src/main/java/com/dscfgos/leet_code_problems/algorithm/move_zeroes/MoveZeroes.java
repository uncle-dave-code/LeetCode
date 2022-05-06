package com.dscfgos.leet_code_problems.algorithm.move_zeroes;

/**
 * (283) - Move Zeroes
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 */
public class MoveZeroes {
    public int[] moveZeroes(int[] nums) {
        if (nums != null && nums.length > 1) {
            int zeroPointer = nums.length - 1;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] == 0) {
                    for (int j = i; j < zeroPointer; j++) {
                        int tmp = nums[j + 1];
                        nums[j + 1] = nums[j];
                        nums[j] = tmp;
                    }
                    zeroPointer--;
                }
            }
        }
        return nums;

    }
}
