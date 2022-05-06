package com.dscfgos.leet_code_problems.data_structure.intersection_two_arrays_II;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (350) - Intersection of Two Arrays II
 * <p>
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must appear as many times as it shows in both arrays
 * and you may return the result in any order.
 */
public class IntersectionTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                map.put(nums2[i], map.get(nums2[i]) - 1);

                resultList.add(nums2[i]);
            }
        }

        int[] result = (resultList != null && !resultList.isEmpty()) ? new int[resultList.size()] : new int[0];
        for (int i = 0; i < result.length; i++) {
            result[i] = resultList.get(i);
        }


        return result;
    }
}
