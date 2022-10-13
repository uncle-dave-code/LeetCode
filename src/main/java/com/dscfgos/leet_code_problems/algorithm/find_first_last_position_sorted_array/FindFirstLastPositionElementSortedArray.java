package com.dscfgos.leet_code_problems.algorithm.find_first_last_position_sorted_array;

/**
 * (34) - Find First and Last Position of Element in Sorted Array
 * <p>
 * Given an array of integers nums sorted in non-decreasing order,
 * find the starting and ending position of a given target value.
 * <p>
 * If target is not found in the array, return [-1, -1].
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class FindFirstLastPositionElementSortedArray {
    public int[] search(int[] nums, int target) {
        if (nums != null && nums.length > 0) {
            int first = search(nums, target, true);
            if (first == -1) {
                return new int[]{-1, -1};
            }
            int last = search(nums, target, false);
            return new int[]{first, last};
        }

        return new int[]{-1, -1};
    }

    private int search(int[] nums, int target, boolean isFirst) {
        int result = -1;
        int lowIndex = 0;
        int highIndex = nums.length-1;

        while (lowIndex<=highIndex){
            int mid = lowIndex + (highIndex-lowIndex)/2;
            if(nums[mid]==target){
                if(isFirst){
                    if(mid==lowIndex || nums[mid-1]!=target){
                        return mid;
                    }
                    highIndex = mid-1;
                }
                else{
                    if(mid == highIndex || nums[mid+1]!=target){
                        return mid;
                    }

                    lowIndex = mid+1;
                }
            }
            else if (nums[mid] > target){
                highIndex = mid-1;
            }else{
                lowIndex = mid+1;
            }
        }
        return -1;
    }


}
