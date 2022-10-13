package com.dscfgos.leet_code_problems.data_structure.array_and_string;

import com.dscfgos.leet_code_problems.data_structure.array_and_string.array_partition_I.ArrayPartitionI;
import com.dscfgos.leet_code_problems.data_structure.array_and_string.diagonal_traverse.DiagonalTraverse;
import com.dscfgos.leet_code_problems.data_structure.array_and_string.find_pivot_index.FindPivotIndex;
import com.dscfgos.leet_code_problems.data_structure.array_and_string.largest_number_at_least_twice_others.LargestNumberAtLeastTwiceOthers;
import com.dscfgos.leet_code_problems.data_structure.array_and_string.minimum_size_subarray_sum.MinimumSizeSubarraySum;
import com.dscfgos.leet_code_problems.data_structure.array_and_string.pascal_triangle_II.PascalsTriangleII;
import com.dscfgos.leet_code_problems.data_structure.array_and_string.plus_one.PlusOne;
import com.dscfgos.leet_code_problems.data_structure.array_and_string.reverse_words_in_a_string.ReverseWordsInString;
import com.dscfgos.leet_code_problems.data_structure.array_and_string.spiral_matrix.SpiralMatrix;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayAndStringTest {

    @Test
    void findPivotIndexTest() {
        int[] nums1 = new int[]{1, 7, 3, 6, 5, 6};
        int[] nums2 = new int[]{1, 2, 3};
        int[] nums3 = new int[]{2, 1, -1};

        FindPivotIndex findPivotIndex = new FindPivotIndex();
        assertAll(
                () -> assertEquals(3, findPivotIndex.pivotIndex(nums1)),
                () -> assertEquals(-1, findPivotIndex.pivotIndex(nums2)),
                () -> assertEquals(0, findPivotIndex.pivotIndex(nums3))
        );
    }

    @Test
    void largestNumberAtLeastTwiceOthersTest() {
        int[] nums1 = new int[]{3, 6, 1, 0};
        int[] nums2 = new int[]{1, 2, 3, 4};
        int[] nums3 = new int[]{1};
        int[] nums4 = new int[]{0, 0, 0, 1};

        LargestNumberAtLeastTwiceOthers largestNumberAtLeastTwiceOthers = new LargestNumberAtLeastTwiceOthers();
        assertAll(
                () -> assertEquals(1, largestNumberAtLeastTwiceOthers.dominantIndex(nums1)),
                () -> assertEquals(-1, largestNumberAtLeastTwiceOthers.dominantIndex(nums2)),
                () -> assertEquals(0, largestNumberAtLeastTwiceOthers.dominantIndex(nums3)),
                () -> assertEquals(3, largestNumberAtLeastTwiceOthers.dominantIndex(nums4))
        );
    }

    @Test
    void plusOneTest() {
        PlusOne plusOne = new PlusOne();
        int[] nums1 = new int[]{1, 2, 3};
        int[] nums2 = new int[]{4, 3, 2, 1};
        int[] nums3 = new int[]{9};
        assertAll(
                () -> assertArrayEquals(new int[]{1, 2, 4}, plusOne.plusOne(nums1)),
                () -> assertArrayEquals(new int[]{4, 3, 2, 2}, plusOne.plusOne(nums2)),
                () -> assertArrayEquals(new int[]{1, 0}, plusOne.plusOne(nums3))
        );
    }

    @Test
    void diagonalTraverseTest() {
        DiagonalTraverse diagonalTraverse = new DiagonalTraverse();
        int[][] nums1 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] nums2 = new int[][]{{1, 2}, {3, 4}};

        assertAll(
                () -> assertArrayEquals(new int[]{1, 2, 4, 7, 5, 3, 6, 8, 9}, diagonalTraverse.findDiagonalOrder(nums1)),
                () -> assertArrayEquals(new int[]{1, 2, 3, 4}, diagonalTraverse.findDiagonalOrder(nums2))
        );
    }

    @Test
    void spiralMatrixTest() {
        int[][] nums1 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] nums2 = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        SpiralMatrix spiralMatrix = new SpiralMatrix();
        assertAll(
                //() -> assertEquals(List.of(1,2,3,6,9,8,7,4,5), spiralMatrix.spiralOrder(nums1)),
                () -> assertEquals(List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), spiralMatrix.spiralOrder(nums2))
        );
    }

    @Test
    void arrayPartitionITest() {
        ArrayPartitionI arrayPartitionI = new ArrayPartitionI();
        int[] nums1 = new int[]{1, 4, 3, 2};
        int[] nums2 = new int[]{6, 2, 6, 5, 1, 2};
        assertAll(
                () -> assertEquals(4, arrayPartitionI.arrayPairSum(nums1)),
                () -> assertEquals(9, arrayPartitionI.arrayPairSum(nums2))
        );
    }

    @Test
    void minimumSizeSubarraySumTest() {
        MinimumSizeSubarraySum minimumSizeSubarraySum = new MinimumSizeSubarraySum();
        int[] nums1 = new int[]{2, 3, 1, 2, 4, 3};
        int[] nums2 = new int[]{1, 4, 4};
        int[] nums3 = new int[]{1, 1, 1, 1, 1, 1, 1, 1};

        assertAll(
                () -> assertEquals(2, minimumSizeSubarraySum.minSubArrayLen(7, nums1)),
                () -> assertEquals(1, minimumSizeSubarraySum.minSubArrayLen(4, nums2)),
                () -> assertEquals(0, minimumSizeSubarraySum.minSubArrayLen(11, nums3))
        );
    }

    @Test
    void pascalTriangleIITest() {

        PascalsTriangleII pascalsTriangleII = new PascalsTriangleII();
        assertAll(
                () -> assertEquals(List.of(1, 3, 3, 1), pascalsTriangleII.getRow(3)),
                () -> assertEquals(List.of(1), pascalsTriangleII.getRow(0)),
                () -> assertEquals(List.of(1, 1), pascalsTriangleII.getRow(1))
        );
    }

    @Test
    void reverseWordsInStringTest() {

        ReverseWordsInString reverseWordsInString = new ReverseWordsInString();
        assertAll(
                () -> assertEquals("blue is sky the", reverseWordsInString.reverseWords("the sky is blue")),
                () -> assertEquals("world hello", reverseWordsInString.reverseWords("  hello world  ")),
                () -> assertEquals("example good a", reverseWordsInString.reverseWords("a good   example"))

        );
    }


}