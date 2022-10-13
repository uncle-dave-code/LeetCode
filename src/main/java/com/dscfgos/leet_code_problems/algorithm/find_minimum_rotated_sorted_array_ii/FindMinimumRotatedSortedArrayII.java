package com.dscfgos.leet_code_problems.algorithm.find_minimum_rotated_sorted_array_ii;

/**
 * (154) - Find Minimum in Rotated Sorted Array II
 * <p>
 * Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
 * For example, the array nums = [0,1,4,4,5,6,7] might become:
 *
 * [4,5,6,7,0,1,4] if it was rotated 4 times.
 * [0,1,4,4,5,6,7] if it was rotated 7 times.
 * Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]]
 * 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
 *
 * Given the sorted rotated array nums that may contain duplicates,
 * return the minimum element of this array.
 *
 * You must decrease the overall operation steps as much as possible.
 */
public class FindMinimumRotatedSortedArrayII {

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
        while (left < right) {

            int mid = left + (right - left) / 2;

            if(nums[mid] < nums[right]) {
                right = mid;
            } else if(nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right--;
            }
        }

        return nums[left];
    }

}
