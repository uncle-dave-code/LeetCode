package com.dscfgos.leet_code_problems.algorithm;

import com.dscfgos.leet_code_problems.algorithm.binary_search.BinarySearch;
import com.dscfgos.leet_code_problems.algorithm.first_bad_version.FirstBadVersion;
import com.dscfgos.leet_code_problems.algorithm.insert_position.InsertPosition;
import com.dscfgos.leet_code_problems.algorithm.rotate_array.RotateArray;
import com.dscfgos.leet_code_problems.algorithm.squares_sorted_array.SquaresSortedArray;
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

    @Test
    void squareSortedArrayTest() {
        int[] nums1 = new int[]{-4, -1, 0, 3, 10};
        int[] nums2 = new int[]{-7, -3, 2, 3, 11};

        SquaresSortedArray squaresSortedArray = new SquaresSortedArray();
        assertAll(
                () -> assertArrayEquals(new int[]{0, 1, 9, 16, 100}, squaresSortedArray.squareAndSort(nums1)),
                () -> assertArrayEquals(new int[]{4, 9, 9, 49, 121}, squaresSortedArray.squareAndSort(nums2))
        );
    }

    @Test
    void rotateArrayTest() {
        int[] nums1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] nums2 = new int[]{-1, -100, 3, 99};
        RotateArray rotateArray = new RotateArray();
        assertAll(
                () -> assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, rotateArray.rotate(nums1, 3)),
                () -> assertArrayEquals(new int[]{3, 99, -1, -100}, rotateArray.rotate(nums2, 2))
        );
    }
}