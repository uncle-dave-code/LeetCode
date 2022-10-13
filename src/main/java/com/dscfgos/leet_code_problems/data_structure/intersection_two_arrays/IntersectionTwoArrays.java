package com.dscfgos.leet_code_problems.data_structure.intersection_two_arrays;

import java.util.*;

/**
 * (349) - Intersection of Two Arrays
 * <p>
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must be unique and you may return the result in any order.
 */
public class IntersectionTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> setInput = new HashSet<>(nums1.length);
        Set<Integer> setOutput = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            setInput.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (setInput.contains(nums2[i])) {
                setOutput.add(nums2[i]);
            }
        }

        int[] result = setOutput.stream().mapToInt(i -> i).toArray();

        return result;
    }
}
