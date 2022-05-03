package com.dscfgos.leet_code_problems.data_structure.arrays_101.duplicate_zeros;

import java.util.Arrays;

/**
 * Duplicate Zeros
 * Given a fixed-length integer array arr, duplicate each occurrence of zero,
 * shifting the remaining elements to the right.
 * <p>
 * Note that elements beyond the length of the original array are not written.
 * Do the above modifications to the input array in place and do not return anything.
 */
public class DuplicateZeros {
    public int[] duplicate(int[] nums) {
        if (nums != null && nums.length > 1) {
            for (int i = 0; i < nums.length-1; i++) {
                if (nums[i] == 0) {
                    for (int j = nums.length - 1; j > i + 1; j--) {
                        nums[j] = nums[j - 1];
                    }
                    nums[++i] = 0;
                }
            }
        }
        return nums;
    }
}
