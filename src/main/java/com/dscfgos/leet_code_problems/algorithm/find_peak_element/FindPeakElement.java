package com.dscfgos.leet_code_problems.algorithm.find_peak_element;

/**
 * (162) - Find Peak Element
 * <p>
 * A peak element is an element that is strictly greater than its neighbors.
 * <p>
 * Given an integer array nums, find a peak element, and return its index.
 * If the array contains multiple peaks, return the index to any of the peaks.
 * <p>
 * You may imagine that nums[-1] = nums[n] = -∞.
 * <p>
 * You must write an algorithm that runs in O(log n) time.
 */
public class FindPeakElement {
    public int search(int[] nums) {
        return (nums != null && nums.length > 0) ? this.search(nums, 0, nums.length - 1) : -1;
    }

    private int search(int[] nums, int left, int right) {

        if(left==right){
            return left;
        }

        int mid = left + (right-left)/2;

        if(nums[mid] > nums[mid+1]){
            return search(nums, left, mid);
        }

        return search(nums, mid+1, right);
    }
}
