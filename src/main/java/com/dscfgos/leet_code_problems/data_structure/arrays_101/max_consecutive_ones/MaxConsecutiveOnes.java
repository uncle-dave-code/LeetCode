package com.dscfgos.leet_code_problems.data_structure.arrays_101.max_consecutive_ones;

/**
 * Max Consecutive Ones
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 */
public class MaxConsecutiveOnes {
    public int consecutiveOnes(int[] nums) {

        int tmpResult = (nums[0] == 1) ? 1 : 0;
        int result = tmpResult;
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                if(nums[i]==1){
                    tmpResult += 1;
                }else{
                    tmpResult = 0;
                }
                if(tmpResult > result){
                    result = tmpResult;
                }
            }
        }
        return result;
    }
}
