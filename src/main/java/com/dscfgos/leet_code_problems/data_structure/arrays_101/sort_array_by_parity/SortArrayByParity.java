package com.dscfgos.leet_code_problems.data_structure.arrays_101.sort_array_by_parity;

/**
 * Sort Array By Parity
 *
 * Given an integer array nums, move all the even integers at the
 * beginning of the array followed by all the odd integers.
 *
 * Return any array that satisfies this condition.
 */
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {

        if(nums != null && nums.length > 1){

            int evenPointer = 0;
            int oddPointer = nums.length-1;
            while (evenPointer < oddPointer){
                if(nums[evenPointer]%2 == 0){
                    evenPointer++;
                }else if(nums[oddPointer]%2 != 0){
                    oddPointer--;
                }else{
                    int tmp = nums[evenPointer];
                    nums[evenPointer]=nums[oddPointer];
                    nums[oddPointer]=tmp;
                }
            }
        }

        return nums;
    }
}
