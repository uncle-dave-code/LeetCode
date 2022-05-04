package com.dscfgos.leet_code_problems.data_structure.arrays_101;

import com.dscfgos.leet_code_problems.data_structure.arrays_101.duplicate_zeros.DuplicateZeros;
import com.dscfgos.leet_code_problems.data_structure.arrays_101.even_number_digits.EvenNumberDigits;
import com.dscfgos.leet_code_problems.data_structure.arrays_101.max_consecutive_ones.MaxConsecutiveOnes;
import com.dscfgos.leet_code_problems.data_structure.arrays_101.remove_duplicates_sorted_array.RemoveDuplicatesSortedArray;
import com.dscfgos.leet_code_problems.data_structure.arrays_101.remove_element.RemoveElement;
import com.dscfgos.leet_code_problems.data_structure.merge_sorted_array.MergeSortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Arrays101Test {

    @Test
    void containsDuplicateTest() {
        int[] nums1 = new int[]{1, 1, 0, 1, 1, 1};
        int[] nums2 = new int[]{1, 0, 1, 1, 0, 1};

        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        assertAll(
                () -> assertEquals(3, maxConsecutiveOnes.consecutiveOnes(nums1)),
                () -> assertEquals(2, maxConsecutiveOnes.consecutiveOnes(nums2))
        );
    }

    @Test
    void evenNumberOfDigitsTest() {
        int[] nums1 = new int[]{12, 345, 2, 6, 7896};
        int[] nums2 = new int[]{555, 901, 482, 1771};

        EvenNumberDigits evenNumberDigits = new EvenNumberDigits();
        assertAll(
                () -> assertEquals(2, evenNumberDigits.evenNumbers(nums1)),
                () -> assertEquals(1, evenNumberDigits.evenNumbers(nums2))
        );
    }

    @Test
    void duplicateZerosTest() {
        int[] nums1 = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        int[] nums2 = new int[]{1, 2, 3};
        int[] nums3 = new int[]{0, 0, 0, 0, 0, 0, 0};

        DuplicateZeros duplicateZeros = new DuplicateZeros();
        assertAll(
                () -> assertArrayEquals(new int[]{1, 0, 0, 2, 3, 0, 0, 4}, duplicateZeros.duplicate(nums1)),
                () -> assertArrayEquals(new int[]{1, 2, 3}, duplicateZeros.duplicate(nums2)),
                () -> assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0}, duplicateZeros.duplicate(nums3))
        );
    }

    @Test
    void removeElementTest() {
        int[] nums1 = new int[]{3, 2, 2, 3};
        int[] nums2 = new int[]{0, 1, 2, 2, 3, 0, 4, 2};

        RemoveElement removeElement = new RemoveElement();
        assertAll(
                () -> assertEquals(2, removeElement.removeElement(nums1, 3)),
                () -> assertEquals(5, removeElement.removeElement(nums2, 2))
        );
    }

    @Test
    void removeDuplicatesSortedArrayTest() {
        int[] nums1 = new int[]{1,1,2};
        int[] nums2 = new int[]{0,0,1,1,1,2,2,3,3,4};
        int[] nums3 = new int[]{1};

        RemoveDuplicatesSortedArray removeDuplicatesSortedArray = new RemoveDuplicatesSortedArray();
        assertAll(
                () -> assertEquals(2, removeDuplicatesSortedArray.removeDuplicatesElement(nums1)),
                () -> assertEquals(5, removeDuplicatesSortedArray.removeDuplicatesElement(nums2)),
                () -> assertEquals(1, removeDuplicatesSortedArray.removeDuplicatesElement(nums3))
        );
    }

}