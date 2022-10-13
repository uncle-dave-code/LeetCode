package com.dscfgos.leet_code_problems.data_structure.kth_largest_element_in_array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * (215) - Kth Largest Element in an Array
 * <p>
 * Given an integer array nums and an integer k, return the kth largest element in the array.
 * <p>
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 */
public class KthLargestElementArray {

    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length < k) {
            return 0;
        }

        nums = buildHeap(nums);

        for (int i = 0; i < k - 1; i++) {
            swap(nums, 0, nums.length - 1);
            nums = Arrays.copyOf(nums, nums.length - 1);
            nums = buildHeap(nums);
        }

        return nums[0];
    }

    private void swap(int[] nums, int i, int i1) {
        int temp = nums[i];
        nums[i] = nums[i1];
        nums[i1] = temp;
    }


    private int[] buildHeap(int[] nums) {
        for (int i = nums.length / 2 - 1; i >= 0; i--) {
            maxHeapify(nums, i);
        }
        return nums;
    }

    private int[] maxHeapify(int[] nums, int pos) {
        int left = this.getLeft(nums, pos);
        int right = this.getRight(nums, pos);

        if(left < nums.length && nums[left] > nums[pos]) {
            swap(nums, left, pos);
            maxHeapify(nums, left);
        }
        if(right < nums.length && nums[right] > nums[pos]) {
            swap(nums, right, pos);
            maxHeapify(nums, right);
        }

        return nums;
    }

    private int getLeft(int[] nums, int pos) {
        return 2 * pos + 1;
    }

    private int getRight(int[] nums, int pos) {
        return 2 * pos + 2;
    }
}
