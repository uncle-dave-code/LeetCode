package com.dscfgos.leet_code_problems.data_structures_and_algorithms.arrays_strings;

/**
 * (724) Find Pivot Index
 * Given an array of integers nums, calculate the pivot index of this array.
 * <p>
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal
 * to the sum of all the numbers strictly to the index's right.
 * <p>
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left.
 * This also applies to the right edge of the array.
 * <p>
 * Return the leftmost pivot index. If no such index exists, return -1.
 */
public class FindPivotIndex {

    public static void main(String[] args) {
        FindPivotIndex findPivotIndex = new FindPivotIndex();
        System.out.println(findPivotIndex.pivotIndex2(new int[]{-1,-1,-1,-1,-1,-1}));
    }


    public int pivotIndex(int[] nums) {
        int left = 0, right = nums.length - 1;
        int leftSum = nums[left], rightSum = nums[right];

        while (left < right) {
            if (leftSum > rightSum) {
                rightSum += nums[--right];
            } else if (rightSum > leftSum) {
                leftSum += nums[++left];
            } else {
                leftSum += nums[++left];
                rightSum += nums[--right];
            }
        }

        return rightSum == leftSum ? right : -1;
    }

    public int pivotIndex2(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }
}
