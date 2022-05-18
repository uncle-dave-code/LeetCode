package com.dscfgos.leet_code_problems.data_structure.arrays_101.replace_elements_greatest_right_side;

/**
 * Replace Elements with Greatest Element on Right Side
 *
 * Given an array arr, replace every element in that array with the greatest
 * element among the elements to its right, and replace the last element with -1.
 *
 * After doing so, return the array.
 */
public class ReplaceElementsGreatestRightSide {
    public int[] replaceElements(int[] arr) {
        if (arr != null && arr.length > 0) {

            int max = arr[arr.length - 1];
            arr[arr.length - 1] = -1;
            if (arr.length == 1) {
                return arr;
            }
            for (int i = arr.length - 1; i > 0; i--) {
                int newMax = arr[i - 1] > max ? arr[i - 1] : max; // Math.max(arr[i - 1],max);
                arr[i - 1] = max;
                max = newMax;
            }
        }
        return arr;
    }
}
