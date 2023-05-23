package com.dscfgos.leet_code_problems.data_structures_and_algorithms.arrays_strings;

/**
 * (283) Move Zeroes
 * Given an integer array nums, move all 0's to the end of it while
 * maintaining the relative order of the non-zero elements.
 * <p>
 * Note that you must do this in-place without making a copy of the array.
 * <p>
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(nums);
    }

    public void moveZeroes(int[] nums) {
        int lastZero = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                lastZero = i;
                break;
            }
        }
        if (lastZero != -1 && nums.length - 1 > lastZero) {
            for (int i = lastZero + 1; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[lastZero] = nums[i];
                    nums[i] = 0;
                    lastZero++;
                }
            }
        }
    }
}
