package com.dscfgos.leet_code_problems.algorithm.rotate_array;

import java.util.Arrays;

/**
 * 189. Rotate Array
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 */
public class RotateArray {
    public int[] rotate(int[] nums, int k) {
        if (k > 0 && nums != null && nums.length > 1) {
            int[] a = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                a[(i + k) % nums.length] = nums[i]; //(i + k) % nums.length Shifted index
            }
            for (int i = 0; i < nums.length; i++) { //Copy array to default
                nums[i] = a[i];
            }
        }

        return nums;

    }
}
