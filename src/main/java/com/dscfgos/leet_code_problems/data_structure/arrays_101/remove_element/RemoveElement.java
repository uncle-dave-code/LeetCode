package com.dscfgos.leet_code_problems.data_structure.arrays_101.remove_element;

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
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int position = 0;
        if (nums != null && nums.length > 0) {
            for (int item: nums) {
                if(item != val){
                    nums[position] = item;
                    position++;
                }
            }
        }
        return position;
    }
}
