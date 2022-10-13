package com.dscfgos.leet_code_problems.algorithm.find_k_closest_elements;

import java.util.ArrayList;
import java.util.List;

/**
 * (658) - Find K Closest Elements
 * <p>
 * Given a sorted integer array arr, two integers k and x,
 * return the k closest integers to x in the array.
 * The result should also be sorted in ascending order.
 */
public class FindKClosestElements {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        int lowIndex = 0;
        int highIndex = arr.length - k;

        while (lowIndex < highIndex) {
            int mid = lowIndex + (highIndex - lowIndex) / 2;

            if(x-arr[mid] > arr[mid+k]-x){
                lowIndex = mid+1;
            }else {
                highIndex = mid;
            }
        }

        for (int i = lowIndex; i < lowIndex+k; i++) {
            result.add(arr[i]);
        }

        return result;
    }

}
