package com.dscfgos.leet_code_problems.data_structure.arrays_101;

import com.dscfgos.leet_code_problems.data_structure.arrays_101.check_if_n_and_double_exist.CheckIfNAndItsDoubleExist;
import com.dscfgos.leet_code_problems.data_structure.arrays_101.duplicate_zeros.DuplicateZeros;
import com.dscfgos.leet_code_problems.data_structure.arrays_101.even_number_digits.EvenNumberDigits;
import com.dscfgos.leet_code_problems.data_structure.arrays_101.height_checker.HeightChecker;
import com.dscfgos.leet_code_problems.data_structure.arrays_101.max_consecutive_ones.MaxConsecutiveOnes;
import com.dscfgos.leet_code_problems.data_structure.arrays_101.max_consecutive_ones_II.MaxConsecutiveOnesII;
import com.dscfgos.leet_code_problems.data_structure.arrays_101.remove_duplicates_sorted_array.RemoveDuplicatesSortedArray;
import com.dscfgos.leet_code_problems.data_structure.arrays_101.remove_element.RemoveElement;
import com.dscfgos.leet_code_problems.data_structure.arrays_101.replace_elements_greatest_right_side.ReplaceElementsGreatestRightSide;
import com.dscfgos.leet_code_problems.data_structure.arrays_101.sort_array_by_parity.SortArrayByParity;
import com.dscfgos.leet_code_problems.data_structure.arrays_101.third_maximum_number.ThirdMaximumNumber;
import com.dscfgos.leet_code_problems.data_structure.arrays_101.valid_mountain_array.ValidMountainArray;
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
    void evenNumberStringOfDigitsTest() {
        int[] nums1 = new int[]{12, 345, 2, 6, 7896};
        int[] nums2 = new int[]{555, 901, 482, 1771};

        EvenNumberDigits evenNumberDigits = new EvenNumberDigits();
        assertAll(
                () -> assertEquals(2, evenNumberDigits.evenNumbersString(nums1)),
                () -> assertEquals(1, evenNumberDigits.evenNumbersString(nums2))
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
        int[] nums1 = new int[]{1, 1, 2};
        int[] nums2 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums3 = new int[]{1};

        RemoveDuplicatesSortedArray removeDuplicatesSortedArray = new RemoveDuplicatesSortedArray();
        assertAll(
                () -> assertEquals(2, removeDuplicatesSortedArray.removeDuplicatesElement(nums1)),
                () -> assertEquals(5, removeDuplicatesSortedArray.removeDuplicatesElement(nums2)),
                () -> assertEquals(1, removeDuplicatesSortedArray.removeDuplicatesElement(nums3))
        );
    }

    @Test
    void checkIfNAndItsDoubleExistTest() {
        int[] nums1 = new int[]{10, 2, 5, 3};
        int[] nums2 = new int[]{7, 1, 14, 11};
        int[] nums3 = new int[]{3, 1, 7, 11};

        CheckIfNAndItsDoubleExist checkIfNAndItsDoubleExist = new CheckIfNAndItsDoubleExist();
        assertAll(
                () -> assertTrue(checkIfNAndItsDoubleExist.checkIfExistDouble(nums1)),
                () -> assertTrue(checkIfNAndItsDoubleExist.checkIfExistDouble(nums2)),
                () -> assertFalse(checkIfNAndItsDoubleExist.checkIfExistDouble(nums3)),
                () -> assertTrue(checkIfNAndItsDoubleExist.checkIfExist(nums1)),
                () -> assertTrue(checkIfNAndItsDoubleExist.checkIfExist(nums2)),
                () -> assertFalse(checkIfNAndItsDoubleExist.checkIfExist(nums3))
        );
    }

    @Test
    void validMountainTest() {
        ValidMountainArray validMountainArray = new ValidMountainArray();
        int[] nums1 = new int[]{2, 1};
        int[] nums2 = new int[]{3, 5, 5};
        int[] nums3 = new int[]{0, 3, 2, 1};
        assertAll(
                () -> assertFalse(validMountainArray.validMountainArray(nums1)),
                () -> assertFalse(validMountainArray.validMountainArray(nums2)),
                () -> assertTrue(validMountainArray.validMountainArray(nums3))
        );
    }

    @Test
    void replaceElementsGreatestRightSideTest() {
        ReplaceElementsGreatestRightSide replaceElementsGreatestRightSide = new ReplaceElementsGreatestRightSide();
        int[] nums1 = new int[]{17, 18, 5, 4, 6, 1};
        int[] nums2 = new int[]{400};
        assertAll(
                () -> assertArrayEquals(new int[]{18, 6, 6, 6, 1, -1}, replaceElementsGreatestRightSide.replaceElements(nums1)),
                () -> assertArrayEquals(new int[]{-1}, replaceElementsGreatestRightSide.replaceElements(nums2))
        );
    }

    @Test
    void sortArrayByParityTest() {
        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        int[] nums1 = new int[]{3, 1, 2, 4};
        int[] nums2 = new int[]{0};
        assertAll(
                () -> assertArrayEquals(new int[]{4, 2, 1, 3}, sortArrayByParity.sortArrayByParity(nums1)),
                () -> assertArrayEquals(new int[]{0}, sortArrayByParity.sortArrayByParity(nums2))
        );
    }

    @Test
    void heightCheckerTest() {
        int[] nums1 = new int[]{1, 1, 4, 2, 1, 3};
        int[] nums2 = new int[]{5, 1, 2, 3, 4};
        int[] nums3 = new int[]{1, 2, 3, 4, 5};

        HeightChecker heightChecker = new HeightChecker();
        assertAll(
                () -> assertEquals(3, heightChecker.heightChecker(nums1)),
                () -> assertEquals(5, heightChecker.heightChecker(nums2)),
                () -> assertEquals(0, heightChecker.heightChecker(nums3))
        );
    }

    @Test
    void maxConsecutiveOnesIITest() {
        int[] nums1 = new int[]{1, 0, 1, 1, 0};
        int[] nums2 = new int[]{1, 0, 1, 1, 0, 1};

        MaxConsecutiveOnesII maxConsecutiveOnesII = new MaxConsecutiveOnesII();
        assertAll(
                () -> assertEquals(4, maxConsecutiveOnesII.findMaxConsecutiveOnes(nums1)),
                () -> assertEquals(4, maxConsecutiveOnesII.findMaxConsecutiveOnes(nums2))
        );
    }

    @Test
    void thirdMaximumNumberTest() {
        int[] nums1 = new int[]{3, 2, 1};
        int[] nums2 = new int[]{1, 2};
        int[] nums3 = new int[]{2, 2, 3, 1};

        ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();
        assertAll(
                () -> assertEquals(1, thirdMaximumNumber.thirdMax(nums1)),
                () -> assertEquals(2, thirdMaximumNumber.thirdMax(nums2)),
                () -> assertEquals(1, thirdMaximumNumber.thirdMax(nums3))
        );
    }
}