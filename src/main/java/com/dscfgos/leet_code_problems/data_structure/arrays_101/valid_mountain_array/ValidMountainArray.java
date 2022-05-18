package com.dscfgos.leet_code_problems.data_structure.arrays_101.valid_mountain_array;

/**
 * Valid Mountain Array
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 */
public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr != null && arr.length >= 3 && arr[0] < arr[1]) {
            boolean increasing = true;
            for (int i = 2; i < arr.length; i++) {
                if (arr[i - 1] == arr[i]) {
                    return false;
                }
                if (increasing && arr[i - 1] > arr[i]) {
                    increasing = false;
                } else if (!increasing && arr[i - 1] <= arr[i]) {
                    return false;
                }
            }
            return !increasing;
        } else {
            return false;
        }
    }
}
