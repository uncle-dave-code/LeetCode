package com.dscfgos.leet_code_problems.data_structure.array_and_string.array_partition_I;

import java.util.Arrays;

/**
 * Array Partition I
 * <p>
 * Given an integer array nums of 2n integers, group these integers
 * into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi)
 * for all i is maximized. Return the maximized sum.
 */
public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        int result = 0;

        if (nums != null && nums.length > 1 && nums.length % 2 == 0) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i+=2) {
                result+= Math.min(nums[i],nums[i+1]);
                //result+= nums[i];  //In sorted array the minimun is the first element
            }
        }

        return result;
    }
}
