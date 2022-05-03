package com.dscfgos.leet_code_problems.data_structure;

import com.dscfgos.leet_code_problems.data_structure.contains_duplicate.ContainsDuplicate;
import com.dscfgos.leet_code_problems.data_structure.maximum_subarray.MaximumSubarray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataStructureTest {
    @Test
    void containsDuplicateTest() {
        int[] nums1 = new int[]{1,2,3,1};
        int[] nums2 = new int[]{1,2,3,4};
        int[] nums3 = new int[]{1,1,1,3,3,4,3,2,4,2};

        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        assertAll(
                () -> assertTrue(containsDuplicate.containsDuplicate(nums1)),
                () -> assertFalse(containsDuplicate.containsDuplicate(nums2)),
                () -> assertTrue(containsDuplicate.containsDuplicate(nums3))
        );
    }

    @Test
    void maximumSubarrayTest() {
        int[] nums1 = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int[] nums2 = new int[]{1};
        int[] nums3 = new int[]{5,4,-1,7,8};

        MaximumSubarray maximumSubarray = new MaximumSubarray();
        assertAll(
                () -> assertEquals(6, maximumSubarray.maxSubArray(nums1)),
                () -> assertEquals(1, maximumSubarray.maxSubArray(nums2)),
                () -> assertEquals(23, maximumSubarray.maxSubArray(nums3))
        );
    }
}