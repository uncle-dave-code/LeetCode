package com.dscfgos.leet_code_problems.data_structure.arrays_101.merge_sorted_array;

import java.util.Arrays;

/**
 * Merge Sorted Array
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * <p>
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * <p>
 * The final sorted array should not be returned by the function,
 * but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n,
 * where the first m elements denote the elements that should be merged,
 * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */
public class MergeSortedArray {
    public int[] squareAndSort(int[] nums1, int m, int[] nums2, int n) {

        for (int i = nums1.length - 1; (m > 0 || n > 0); i--) {
            if (m > 0 && n > 0) {
                if(nums1[m-1]> nums2[n-1]){
                    nums1[i] = nums1[--m];
                }else{
                    nums1[i] = nums2[--n];
                }
            } else if (m > 0) {
                nums1[i] = nums1[--m];
            } else {
                nums1[i] = nums2[--n];
            }
        }

        return nums1;
    }
}
