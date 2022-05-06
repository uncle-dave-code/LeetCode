package com.dscfgos.leet_code_problems.algorithm;

import com.dscfgos.leet_code_problems.algorithm.binary_search.BinarySearch;
import com.dscfgos.leet_code_problems.algorithm.first_bad_version.FirstBadVersion;
import com.dscfgos.leet_code_problems.algorithm.insert_position.InsertPosition;
import com.dscfgos.leet_code_problems.algorithm.move_zeroes.MoveZeroes;
import com.dscfgos.leet_code_problems.algorithm.reverse_string.ReverseString;
import com.dscfgos.leet_code_problems.algorithm.reverse_words_string_III.ReverseWordsStringIII;
import com.dscfgos.leet_code_problems.algorithm.rotate_array.RotateArray;
import com.dscfgos.leet_code_problems.algorithm.squares_sorted_array.SquaresSortedArray;
import com.dscfgos.leet_code_problems.algorithm.two_sum_II.TwoSumII;
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

    @Test
    void moveZeroesTest() {
        int[] nums1 = new int[]{0, 1, 0, 3, 12};
        int[] nums2 = new int[]{0};
        MoveZeroes moveZeroes = new MoveZeroes();
        assertAll(
                () -> assertArrayEquals(new int[]{1, 3, 12, 0, 0}, moveZeroes.moveZeroes(nums1)),
                () -> assertArrayEquals(new int[]{0}, moveZeroes.moveZeroes(nums2))
        );
    }

    @Test
    void twoSumIITest() {
        int[] nums1 = new int[]{2, 7, 11, 15};
        int[] nums2 = new int[]{2, 3, 4};
        int[] nums3 = new int[]{-1, 0};
        int[] nums4 = new int[]{1, 2, 3, 4, 4, 9, 56, 90};

        TwoSumII twoSumII = new TwoSumII();
        assertAll(
                () -> assertArrayEquals(new int[]{1, 2}, twoSumII.twoSum(nums1, 9)),
                () -> assertArrayEquals(new int[]{1, 3}, twoSumII.twoSum(nums2, 6)),
                () -> assertArrayEquals(new int[]{1, 2}, twoSumII.twoSum(nums3, -1)),
                () -> assertArrayEquals(new int[]{4, 5}, twoSumII.twoSum(nums4, 8))
        );
    }

    @Test
    void reverseStringTest() {
        char[] chars1 = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] chars2 = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};


        ReverseString reverseString = new ReverseString();
        assertAll(
                () -> assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, reverseString.reverse(chars1)),
                () -> assertArrayEquals(new char[]{'h', 'a', 'n', 'n', 'a', 'H'}, reverseString.reverse(chars2))
        );
    }

    @Test
    void reverseWordsStringIIITest() {
        ReverseWordsStringIII reverseWordsStringIII = new ReverseWordsStringIII();
        assertAll(
                () -> assertEquals("s'teL ekat edoCteeL tsetnoc", reverseWordsStringIII.reverseWords("Let's take LeetCode contest")),
                () -> assertEquals("doG gniD", reverseWordsStringIII.reverseWords("God Ding"))
        );
    }
}