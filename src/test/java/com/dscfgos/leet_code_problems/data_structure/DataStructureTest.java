package com.dscfgos.leet_code_problems.data_structure;

import com.dscfgos.leet_code_problems.data_structure.contains_duplicate.ContainsDuplicate;
import com.dscfgos.leet_code_problems.data_structure.maximum_subarray.MaximumSubarray;
import com.dscfgos.leet_code_problems.data_structure.merge_sorted_array.MergeSortedArray;
import com.dscfgos.leet_code_problems.data_structure.two_sum.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataStructureTest {
    @Test
    void containsDuplicateTest() {
        int[] nums1 = new int[]{1, 2, 3, 1};
        int[] nums2 = new int[]{1, 2, 3, 4};
        int[] nums3 = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        assertAll(
                () -> assertTrue(containsDuplicate.containsDuplicate(nums1)),
                () -> assertFalse(containsDuplicate.containsDuplicate(nums2)),
                () -> assertTrue(containsDuplicate.containsDuplicate(nums3))
        );
    }

    @Test
    void maximumSubarrayTest() {
        int[] nums1 = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = new int[]{1};
        int[] nums3 = new int[]{5, 4, -1, 7, 8};

        MaximumSubarray maximumSubarray = new MaximumSubarray();
        assertAll(
                () -> assertEquals(6, maximumSubarray.maxSubArray(nums1)),
                () -> assertEquals(1, maximumSubarray.maxSubArray(nums2)),
                () -> assertEquals(23, maximumSubarray.maxSubArray(nums3))
        );
    }

    @Test
    void twoSumTest() {
        int[] nums1 = new int[]{2, 7, 11, 15};
        int[] nums2 = new int[]{3, 2, 4};
        int[] nums3 = new int[]{3, 3};

        TwoSum twoSum = new TwoSum();
        assertAll(
                () -> assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(nums1, 9)),
                () -> assertArrayEquals(new int[]{1, 2}, twoSum.twoSum(nums2, 6)),
                () -> assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(nums3, 6))
        );
    }

    @Test
    void mergeSortedTest() {
        int[] nums11 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums12 = new int[]{2, 5, 6};

        int[] nums21 = new int[]{0};
        int[] nums22 = new int[]{1};

        int[] nums31 = new int[]{2, 0};
        int[] nums32 = new int[]{1};

        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        assertAll(
                () -> assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, mergeSortedArray.merge(nums11, 3, nums12, 3)),
                () -> assertArrayEquals(new int[]{1}, mergeSortedArray.merge(nums21, 0, nums22, 1)),
                () -> assertArrayEquals(new int[]{1, 2}, mergeSortedArray.merge(nums31, 1, nums32, 1))
        );
    }
}