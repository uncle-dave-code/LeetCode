package com.dscfgos.leet_code_problems.algorithm;

import com.dscfgos.leet_code_problems.algorithm.binary_search.BinarySearch;
import com.dscfgos.leet_code_problems.algorithm.first_bad_version.FirstBadVersion;
import com.dscfgos.leet_code_problems.algorithm.insert_position.InsertPosition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @Test
    void binarySearchTest() {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        BinarySearch binarySearch = new BinarySearch();
        assertAll(
                () -> assertEquals(2, binarySearch.search(nums, 3)),
                () -> assertEquals(-1, binarySearch.search(nums, 8))
        );
    }

    @Test
    void firstBadVersionTest() {
        FirstBadVersion firstBadVersion = new FirstBadVersion();
        assertAll(
                () -> assertEquals(4, firstBadVersion.firstBadVersion(4, 5)),
                () -> assertEquals(1, firstBadVersion.firstBadVersion(1, 1))
        );
    }

    @Test
    void insertPositionTest() {
        int[] nums = new int[]{1, 3, 5, 6};

        InsertPosition firstBadVersion = new InsertPosition();
        assertAll(
                () -> assertEquals(2, firstBadVersion.searchInsert(nums, 5)),
                () -> assertEquals(1, firstBadVersion.searchInsert(nums, 2)),
                () -> assertEquals(4, firstBadVersion.searchInsert(nums, 7))
        );
    }
}