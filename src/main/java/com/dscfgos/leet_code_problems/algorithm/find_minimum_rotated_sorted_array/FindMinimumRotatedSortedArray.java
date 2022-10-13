package com.dscfgos.leet_code_problems.algorithm.find_minimum_rotated_sorted_array;

/**
 * (153) - Find Minimum in Rotated Sorted Array
 * <p>
 * Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
 * For example, the array nums = [0,1,2,4,5,6,7] might become:
 * <p>
 * [4,5,6,7,0,1,2] if it was rotated 4 times.
 * [0,1,2,4,5,6,7] if it was rotated 7 times.
 * Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]]
 * 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
 * <p>
 * Given the sorted rotated array nums of unique elements,
 * return the minimum element of this array.
 * <p>
 * You must write an algorithm that runs in O(log n) time.
 */
public class FindMinimumRotatedSortedArray {

    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        int left = 0, right = nums.length - 1;

        //Already Sorted Array, return first element
        if (nums[right] > nums[left]) {
            return nums[left];
        }

        //Binary Search
        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Is mid is greater then is de pivot point
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }

            // Is before mid is greater then is de pivot point
            if (nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }

            if (nums[mid] > nums[0]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

}
