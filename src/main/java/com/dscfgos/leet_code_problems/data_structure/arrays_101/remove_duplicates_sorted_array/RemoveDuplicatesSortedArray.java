package com.dscfgos.leet_code_problems.data_structure.arrays_101.remove_duplicates_sorted_array;

/**
 * (27) - Remove Element
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 * The relative order of the elements may be changed.
 * <p>
 * Since it is impossible to change the length of the array in some languages,
 * you must instead have the result be placed in the first part of the array nums.
 * More formally, if there are k elements after removing the duplicates,
 * then the first k elements of nums should hold the final result.
 * It does not matter what you leave beyond the first k elements.
 * <p>
 * Return k after placing the final result in the first k slots of nums.
 * <p>
 * Do not allocate extra space for another array.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicatesSortedArray {
    public int removeDuplicatesElement(int[] nums) {
        int position = (nums != null && nums.length > 0) ? 1 : 0;
        if (position == 1) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[position - 1]) {
                    nums[position] = nums[i];
                    position++;
                }
            }
        }
        return position;
    }

    public int removeDuplicatesElement2(int[] nums) {
        if (nums == null && nums.length <= 1) {
            return nums.length;
        }
        int position = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[position - 1]) {
                nums[position] = nums[i];
                position++;
            }
        }
        return position;
    }
}
