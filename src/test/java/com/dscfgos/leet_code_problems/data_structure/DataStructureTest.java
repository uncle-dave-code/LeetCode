package com.dscfgos.leet_code_problems.data_structure;

import com.dscfgos.leet_code_problems.data_structure.best_time_buy_sell_stock.BestTimeBuySellStock;
import com.dscfgos.leet_code_problems.data_structure.best_time_buy_sell_stock_ii.BestTimeBuySellStockII;
import com.dscfgos.leet_code_problems.data_structure.contains_duplicate.ContainsDuplicate;
import com.dscfgos.leet_code_problems.data_structure.first_unique_character.FirstUniqueCharacter;
import com.dscfgos.leet_code_problems.data_structure.intersection_two_arrays_II.IntersectionTwoArraysII;
import com.dscfgos.leet_code_problems.data_structure.kth_largest_element_in_array.KthLargestElementArray;
import com.dscfgos.leet_code_problems.data_structure.last_stone_weight.LastStoneWeight;
import com.dscfgos.leet_code_problems.data_structure.longest_palindrome.LongestPalindrome;
import com.dscfgos.leet_code_problems.data_structure.maximum_subarray.MaximumSubarray;
import com.dscfgos.leet_code_problems.data_structure.merge_sorted_array.MergeSortedArray;
import com.dscfgos.leet_code_problems.data_structure.ransom_note.RansomNote;
import com.dscfgos.leet_code_problems.data_structure.reshape_matrix.ReshapeMatrix;
import com.dscfgos.leet_code_problems.data_structure.rotate_image.RotateImage;
import com.dscfgos.leet_code_problems.data_structure.search_2d_matrix.Search2DMatrix;
import com.dscfgos.leet_code_problems.data_structure.top_k_frequent_elements.TopKFrequentElements;
import com.dscfgos.leet_code_problems.data_structure.two_sum.TwoSum;
import com.dscfgos.leet_code_problems.data_structure.valid_anagram.ValidAnagram;
import com.dscfgos.leet_code_problems.data_structure.valid_parentheses.ValidParentheses;
import com.dscfgos.leet_code_problems.data_structure.valid_sudoku.ValidSudoku;
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

    @Test
    void intersectionTwoArraysTest() {
        int[] nums11 = new int[]{1, 2, 2, 1};
        int[] nums12 = new int[]{2, 2};

        int[] nums21 = new int[]{0};
        int[] nums22 = new int[]{1};

        IntersectionTwoArraysII intersectionTwoArraysII = new IntersectionTwoArraysII();
        assertAll(
                () -> assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, intersectionTwoArraysII.intersect(nums11, nums12)),
                () -> assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, intersectionTwoArraysII.intersect(nums21, nums22))
        );
    }


    @Test
    void bestTimeToSellBuyTest() {
        int[] nums1 = new int[]{7, 1, 5, 3, 6, 4};
        int[] nums2 = new int[]{7, 6, 4, 3, 1};

        BestTimeBuySellStock bestTimeBuySellStock = new BestTimeBuySellStock();

        assertAll(
                () -> assertEquals(5, bestTimeBuySellStock.maxProfit(nums1)),
                () -> assertEquals(0, bestTimeBuySellStock.maxProfit(nums2))
        );
    }

    @Test
    void bestTimeToSellBuyIITest() {
        int[] nums1 = new int[]{7, 1, 5, 3, 6, 4};
        int[] nums2 = new int[]{1, 2, 3, 4, 5};
        int[] nums3 = new int[]{7, 6, 4, 3, 1};

        BestTimeBuySellStockII bestTimeBuySellStockII = new BestTimeBuySellStockII();

        assertAll(
                () -> assertEquals(7, bestTimeBuySellStockII.maxProfit(nums1)),
                () -> assertEquals(4, bestTimeBuySellStockII.maxProfit(nums2)),
                () -> assertEquals(0, bestTimeBuySellStockII.maxProfit(nums3))
        );
    }

    @Test
    void reshapeMatrixTest() {
        int[][] nums1 = new int[][]{{1, 2}, {3, 4}};
        int[][] nums2 = new int[][]{{1, 2}, {3, 4}};


        ReshapeMatrix reshapeMatrix = new ReshapeMatrix();

        assertAll(
                () -> assertArrayEquals(new int[][]{{1, 2, 3, 4}}, reshapeMatrix.matrixReshape(nums1, 1, 4)),
                () -> assertArrayEquals(new int[][]{{1, 2}, {3, 4}}, reshapeMatrix.matrixReshape(nums2, 2, 4))
        );
    }

    @Test
    void validSudokuTest() {
        char[][] board1 = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        char[][] board2 = new char[][]{
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        char[][] board3 = new char[][]{
                {'.', '.', '.', '.', '5', '.', '.', '1', '.'},
                {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
                {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
                {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
                {'.', '1', '5', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
                {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
                {'.', '.', '4', '.', '.', '.', '.', '.', '.'}
        };


        ValidSudoku validSudoku = new ValidSudoku();
        assertAll(
                () -> assertTrue(validSudoku.isValidSudoku(board1)),
                () -> assertFalse(validSudoku.isValidSudoku(board2)),
                () -> assertFalse(validSudoku.isValidSudoku(board3))
        );
    }

    @Test
    void search2DMatrixTest() {
        int[][] nums1 = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int[][] nums2 = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};


        Search2DMatrix search2DMatrix = new Search2DMatrix();

        assertAll(
                () -> assertTrue(search2DMatrix.searchMatrix(nums1, 3)),
                () -> assertFalse(search2DMatrix.searchMatrix(nums2, 13))
        );
    }

    @Test
    void firstUniqueCharacterStringTest() {
        String str1 = "leetcode";
        String str2 = "loveleetcode";
        String str3 = "aabb";

        FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();

        assertAll(
                () -> assertEquals(0, firstUniqueCharacter.firstUniqChar(str1)),
                () -> assertEquals(2, firstUniqueCharacter.firstUniqChar(str2)),
                () -> assertEquals(-1, firstUniqueCharacter.firstUniqChar(str3)),
                () -> assertEquals(0, firstUniqueCharacter.firstUniqChar2(str1)),
                () -> assertEquals(2, firstUniqueCharacter.firstUniqChar2(str2)),
                () -> assertEquals(-1, firstUniqueCharacter.firstUniqChar2(str3))
        );
    }

    @Test
    void ransomNoteTest() {
        String str11 = "a";
        String str12 = "b";
        String str21 = "aa";
        String str22 = "ab";
        String str31 = "aa";
        String str32 = "aab";

        RansomNote ransomNote = new RansomNote();

        assertAll(
                () -> assertFalse(ransomNote.canConstruct(str11, str12)),
                () -> assertFalse(ransomNote.canConstruct(str22, str21)),
                () -> assertTrue(ransomNote.canConstruct(str31, str32))
        );
    }

    @Test
    void validAnagramTest() {
        String str11 = "anagram";
        String str12 = "nagaram";
        String str21 = "rat";
        String str22 = "car";

        ValidAnagram validAnagram = new ValidAnagram();

        assertAll(
                () -> assertTrue(validAnagram.isAnagram(str11, str12)),
                () -> assertFalse(validAnagram.isAnagram(str22, str21))
        );
    }

    @Test
    void validParenthesesTest() {
        String str1 = "()";
        String str2 = "()[]{}";
        String str3 = "(]";


        ValidParentheses validParentheses = new ValidParentheses();

        assertAll(
                () -> assertTrue(validParentheses.isValid(str1)),
                () -> assertTrue(validParentheses.isValid(str2)),
                () -> assertFalse(validParentheses.isValid(str3))
        );
    }

    @Test
    void longestPalindromeTest() {
        String str1 = "abccccdd";
        String str2 = "a";
        String str3 = "ccc";
        String str4 = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        LongestPalindrome longestPalindrome = new LongestPalindrome();

        assertAll(
                () -> assertEquals(7, longestPalindrome.longestPalindrome(str1)),
                () -> assertEquals(1, longestPalindrome.longestPalindrome(str2)),
                () -> assertEquals(3, longestPalindrome.longestPalindrome(str3)),
                () -> assertEquals(983, longestPalindrome.longestPalindrome(str4))
        );
    }

    @Test
    void kthLargestElementArrayTest() {
        int[] nums1 = new int[]{3, 2, 1, 5, 6, 4};
        int[] nums2 = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        int[] nums3 = new int[]{1, 2, 3, 4, 5, 6};

        KthLargestElementArray kthLargestElementArray = new KthLargestElementArray();

        assertAll(
                () -> assertEquals(5, kthLargestElementArray.findKthLargest(nums1, 2)),
                () -> assertEquals(4, kthLargestElementArray.findKthLargest(nums2, 4)),
                () -> assertEquals(6, kthLargestElementArray.findKthLargest(nums3, 1))
        );
    }

    @Test
    void topKFrequentElementsTest() {
        int[] nums1 = new int[]{1, 1, 1, 2, 2, 3};
        int[] nums2 = new int[]{1};

        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();

        assertAll(
                () -> assertArrayEquals(new int[]{1, 2}, topKFrequentElements.topKFrequent(nums1, 2)),
                () -> assertArrayEquals(new int[]{1}, topKFrequentElements.topKFrequent(nums2, 1))
        );
    }

    @Test
    void lastStoneWeightTest() {
        int[] nums1 = new int[]{2, 7, 4, 1, 8, 1};
        int[] nums2 = new int[]{1};
        int[] nums3 = new int[]{2, 2};
        int[] nums4 = new int[]{4, 3, 4, 3, 2};

        LastStoneWeight lastStoneWeight = new LastStoneWeight();

        assertAll(
//                () -> assertEquals(1, lastStoneWeight.lastStoneWeight(nums1)),
//                () -> assertEquals(1, lastStoneWeight.lastStoneWeight(nums2)),
//                () -> assertEquals(0, lastStoneWeight.lastStoneWeight(nums3)),
                () -> assertEquals(2, lastStoneWeight.lastStoneWeight(nums4))

        );
    }

    @Test
    void rotateTest() {
        int[][] nums1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] nums2 = new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};


        RotateImage rotateImage = new RotateImage();

        assertAll(
                () -> assertArrayEquals(new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}, rotateImage.rotate(nums1)),
                () -> assertArrayEquals(new int[][]{{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}}, rotateImage.rotate(nums2))
        );
    }

}