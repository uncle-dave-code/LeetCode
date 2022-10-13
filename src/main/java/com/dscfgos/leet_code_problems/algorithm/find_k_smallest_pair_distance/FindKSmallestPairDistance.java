package com.dscfgos.leet_code_problems.algorithm.find_k_smallest_pair_distance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * (719) - Find K-th Smallest Pair Distance
 * <p>
 * The distance of a pair of integers a and b is defined as the absolute
 * difference between a and b.
 * <p>
 * Given an integer array nums and an integer k, return the kth smallest distance
 * among all the pairs nums[i] and nums[j] where 0 <= i < j < nums.length.
 */
public class FindKSmallestPairDistance {

    public int smallestDistancePair(int[] arr, int k) {
        Arrays.sort(arr);

        int minK = 0;
        int maxK = arr[arr.length - 1] - arr[0];

        while(minK < maxK){
            int midK = (minK + maxK) / 2;

            int count = 0;
            int left = 0;

            for (int right = 1; right < arr.length; right++) {
                while (arr[right] - arr[left] > midK) {
                    left++;
                }
                count += right - left;
            }

            if (count >= k) {
                maxK = midK;
            } else {
                minK = midK + 1;
            }
        }

        return  minK;

    }

}
