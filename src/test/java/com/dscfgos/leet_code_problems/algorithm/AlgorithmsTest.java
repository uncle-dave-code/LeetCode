package com.dscfgos.leet_code_problems.algorithm;

import com.dscfgos.leet_code_problems.algorithm.binary_search.BinarySearch;
import com.dscfgos.leet_code_problems.algorithm.find_k_smallest_pair_distance.FindKSmallestPairDistance;
import com.dscfgos.leet_code_problems.algorithm.find_minimum_rotated_sorted_array.FindMinimumRotatedSortedArray;
import com.dscfgos.leet_code_problems.algorithm.find_minimum_rotated_sorted_array_ii.FindMinimumRotatedSortedArrayII;
import com.dscfgos.leet_code_problems.algorithm.first_bad_version.FirstBadVersion;
import com.dscfgos.leet_code_problems.algorithm.flood_fill.FloodFill;
import com.dscfgos.leet_code_problems.algorithm.insert_position.InsertPosition;
import com.dscfgos.leet_code_problems.algorithm.is_subsequence.IsSubsequence;
import com.dscfgos.leet_code_problems.algorithm.longest_substring_without_repeating.LongestSubstringWithoutRepeatingCharacters;
import com.dscfgos.leet_code_problems.algorithm.matrix.ZeroOneMatrix;
import com.dscfgos.leet_code_problems.algorithm.max_area_of_island.MaxAreaIsland;
import com.dscfgos.leet_code_problems.algorithm.move_zeroes.MoveZeroes;
import com.dscfgos.leet_code_problems.algorithm.number_of_islands.NumberIslands;
import com.dscfgos.leet_code_problems.algorithm.permutation_string.PermutationInString;
import com.dscfgos.leet_code_problems.algorithm.pow.Pow;
import com.dscfgos.leet_code_problems.algorithm.reverse_string.ReverseString;
import com.dscfgos.leet_code_problems.algorithm.reverse_words_string_III.ReverseWordsStringIII;
import com.dscfgos.leet_code_problems.algorithm.rotate_array.RotateArray;
import com.dscfgos.leet_code_problems.algorithm.rotting_oranges.RottingOranges;
import com.dscfgos.leet_code_problems.algorithm.split_array_largest_sum.SplitArrayLargestSum;
import com.dscfgos.leet_code_problems.algorithm.sqrx.SqrX;
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
                () -> assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, rotateArray.rotate2(nums1, 3)),
                () -> assertArrayEquals(new int[]{3, 99, -1, -100}, rotateArray.rotate2(nums2, 2))
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

    @Test
    void longestSubstringWithoutRepeatingCharactersTest() {
        String str1 = "abcabcbb";
        String str2 = "bbbbb";
        String str3 = "pwwkew";
        String str4 = "dvdf";

        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        assertAll(
                () -> assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(str1)),
                () -> assertEquals(1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(str2)),
                () -> assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(str3)),
                () -> assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(str4))

        );
    }

    @Test
    void permutationInStringTest() {
        String str11 = "ab";
        String str12 = "eidbaooo";
        String str21 = "ab";
        String str22 = "eidboaoo";
        String str31 = "adc";
        String str32 = "dcda";

        PermutationInString permutationInString = new PermutationInString();
        assertAll(
                () -> assertTrue(permutationInString.checkInclusion(str11, str12)),
                () -> assertFalse(permutationInString.checkInclusion(str21, str22)),
                () -> assertTrue(permutationInString.checkInclusion(str31, str32))
        );
    }

    @Test
    void floodFillTest() {
        int[][] nums1 = new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int[][] nums2 = new int[][]{{0, 0, 0}, {0, 0, 0}};

        FloodFill floodFill = new FloodFill();
        assertAll(
                () -> assertArrayEquals(new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}}, floodFill.floodFill(nums1, 1, 1, 2)),
                () -> assertArrayEquals(new int[][]{{2, 2, 2}, {2, 2, 2}}, floodFill.floodFill(nums2, 0, 0, 2))
        );
    }

    @Test
    void maxAreaIslandTest() {
        int[][] nums1 = new int[][]{
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
        int[][] nums2 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0}};
        int[][] nums3 = new int[][]{
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 1, 1}
        };

        MaxAreaIsland maxAreaIsland = new MaxAreaIsland();
        assertAll(
                () -> assertEquals(6, maxAreaIsland.maxAreaOfIsland(nums1)),
                () -> assertEquals(0, maxAreaIsland.maxAreaOfIsland(nums2)),
                () -> assertEquals(4, maxAreaIsland.maxAreaOfIsland(nums3))
        );
    }

    @Test
    void zeroOneMatrixTest() {
        int[][] nums1 = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int[][] nums2 = new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] nums3 = new int[][]{{0, 1, 0}, {0, 1, 0}, {0, 1, 0}, {0, 1, 0}};

        ZeroOneMatrix zeroOneMatrix = new ZeroOneMatrix();
        assertAll(
//                () -> assertArrayEquals(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}, zeroOneMatrix.updateMatrix(nums1)),
//                () -> assertArrayEquals(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 2, 1}}, zeroOneMatrix.updateMatrix(nums2)),
                () -> assertArrayEquals(new int[][]{{0, 1, 0}, {0, 1, 0}, {0, 1, 0}, {0, 1, 0}}, zeroOneMatrix.updateMatrix(nums3))
        );
    }

    @Test
    void rottingOrangesTest() {
        int[][] nums1 = new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int[][] nums2 = new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        int[][] nums3 = new int[][]{{0, 2}};

        RottingOranges rottingOranges = new RottingOranges();
        assertAll(
                () -> assertEquals(4, rottingOranges.orangesRotting(nums1)),
                () -> assertEquals(-1, rottingOranges.orangesRotting(nums2)),
                () -> assertEquals(0, rottingOranges.orangesRotting(nums3))
        );
    }

    @Test
    void sqrXTest() {
        SqrX sqrx = new SqrX();
        assertAll(
                () -> assertEquals(2, sqrx.mySqrt(4)),
                () -> assertEquals(2, sqrx.mySqrt(8))
        );
    }

    @Test
    void findMinimumRotatedSortedArrayTest() {
        int[] nums1 = new int[]{3, 4, 5, 1, 2};
        int[] nums2 = new int[]{4, 5, 6, 7, 0, 1, 2};
        int[] nums3 = new int[]{11, 13, 15, 17};

        FindMinimumRotatedSortedArray findMinimumRotatedSortedArray = new FindMinimumRotatedSortedArray();
        assertAll(
                () -> assertEquals(1, findMinimumRotatedSortedArray.findMin(nums1)),
                () -> assertEquals(0, findMinimumRotatedSortedArray.findMin(nums2)),
                () -> assertEquals(11, findMinimumRotatedSortedArray.findMin(nums3))
        );
    }

    @Test
    void findMinimumRotatedSortedArrayIITest() {
        int[] nums1 = new int[]{4, 5, 6, 7, 0, 1, 4};
        int[] nums2 = new int[]{1, 3, 5};
        int[] nums3 = new int[]{2, 2, 2, 0, 1};
        int[] nums4 = new int[]{3, 1, 3};


        FindMinimumRotatedSortedArrayII findMinimumRotatedSortedArray = new FindMinimumRotatedSortedArrayII();
        assertAll(
                () -> assertEquals(0, findMinimumRotatedSortedArray.findMin(nums1)),
                () -> assertEquals(1, findMinimumRotatedSortedArray.findMin(nums2)),
                () -> assertEquals(0, findMinimumRotatedSortedArray.findMin(nums3)),
                () -> assertEquals(1, findMinimumRotatedSortedArray.findMin(nums4))
        );
    }

    @Test
    void powTest() {
        Pow pow = new Pow();
        assertAll(
                () -> assertEquals(1024.00000, pow.myPowFastPow(2.00000, 10)),
                () -> assertEquals(9.261000000000001, pow.myPowFastPow(2.10000, 3)),
                () -> assertEquals(0.25000, pow.myPowFastPow(2.00000, -2)),
                () -> assertEquals(1024.00000, pow.myPowBinary(2.00000, 10)),
                () -> assertEquals(9.261000000000001, pow.myPowBinary(2.10000, 3)),
                () -> assertEquals(0.25000, pow.myPowBinary(2.00000, -2))
        );
    }

    @Test
    void findKSmallestPairDistanceTest() {
        int[] nums1 = new int[]{1, 3, 1};
        int[] nums2 = new int[]{1, 1, 1};
        int[] nums3 = new int[]{1, 6, 1};


        FindKSmallestPairDistance findKSmallestPairDistance = new FindKSmallestPairDistance();
        assertAll(
                () -> assertEquals(0, findKSmallestPairDistance.smallestDistancePair(nums1, 1)),
                () -> assertEquals(0, findKSmallestPairDistance.smallestDistancePair(nums2, 2)),
                () -> assertEquals(5, findKSmallestPairDistance.smallestDistancePair(nums3, 3))
        );
    }

    @Test
    void splitArrayLargestSumTest() {
        int[] nums1 = new int[]{7, 2, 5, 10, 8};
        int[] nums2 = new int[]{1, 2, 3, 4, 5};
        int[] nums3 = new int[]{1, 4, 4};


        SplitArrayLargestSum splitArrayLargestSum = new SplitArrayLargestSum();
        assertAll(
                () -> assertEquals(18, splitArrayLargestSum.splitArray(nums1, 2)),
                () -> assertEquals(9, splitArrayLargestSum.splitArray(nums2, 2)),
                () -> assertEquals(4, splitArrayLargestSum.splitArray(nums3, 3))
        );
    }

    @Test
    void isSubsequenceTest() {
        String str11 = "abc";
        String str12 = "ahbgdc";

        String str21 = "axc";
        String str22 = "ahbgdc";


        IsSubsequence isSubsequence = new IsSubsequence();
        assertAll(
                () -> assertTrue(isSubsequence.isSubsequence(str11, str12)),
                () -> assertFalse(isSubsequence.isSubsequence(str21, str22))
        );
    }

    @Test
    void numberIslandsTest() {
        char[][] nums1 = new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'},{'0', '0', '0', '0', '0'}};
        char[][] nums2 = new char[][]{{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'},{'0', '0', '0', '1', '1'}};

        NumberIslands numberIslands = new NumberIslands();
        assertAll(
                //() -> assertEquals(1, numberIslands.numIslands(nums1)),
                () -> assertEquals(3, numberIslands.numIslands(nums2))
        );
    }
}