package com.dscfgos.leet_code_problems.data_structure.arrays_101.find_numbers_disappeared_in_array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * (448) - Find All Numbers Disappeared in an Array
 * <p>
 * Given an array nums of n integers where nums[i] is in the range [1, n],
 * return an array of all the integers in the range [1, n] that do not appear in nums.
 */
public class FindAllNumbersDisappearedInArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums != null && nums.length > 1) {
            Set<Integer> setValues = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= 1 && nums[i] <= nums.length) {
                    setValues.add(nums[i]);
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (!setValues.contains(i+1)) {
                    result.add(i + 1);
                }
            }
        }

        return result;
    }

    public static void main(String... args) {
        int[] nums1 = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        int[] nums2 = new int[]{1, 1};

        var testCase = new FindAllNumbersDisappearedInArray();
        var result = testCase.findDisappearedNumbers(nums1);
        result = testCase.findDisappearedNumbers(nums2);
        result = testCase.findDisappearedNumbers(nums2);
    }
}
