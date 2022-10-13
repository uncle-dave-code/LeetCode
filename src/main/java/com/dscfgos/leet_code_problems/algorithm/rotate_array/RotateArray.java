package com.dscfgos.leet_code_problems.algorithm.rotate_array;

/**
 * (189) - Rotate Array
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

    //      [-1,-100,3,99] Input
    //      [-1,-100,-1,99] output
    //      [3,99,-1,-100] expected

    public int[] rotate2(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
        return nums;
    }
}
