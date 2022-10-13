package com.dscfgos.leet_code_problems.algorithm.missing_number;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int expectedSum = (nums.length + 1) * nums.length / 2;
        return expectedSum - sum;
    }

    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        System.out.println(missingNumber.missingNumber(new int[]{3, 0, 1}));
    }
}
