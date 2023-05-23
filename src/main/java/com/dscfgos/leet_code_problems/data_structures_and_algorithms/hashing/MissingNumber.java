package com.dscfgos.leet_code_problems.data_structures_and_algorithms.hashing;

/**
 * (268) - Missing Number
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 */
public class MissingNumber {

    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        System.out.println(missingNumber.missingNumberUpdate(new int[]{3, 0, 1}));
        System.out.println(missingNumber.missingNumberUpdate(new int[]{0, 1}));
        System.out.println(missingNumber.missingNumberUpdate(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }

    public int missingNumber(int[] nums) {
        int sum = 0;
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            total += i+1;
        }

        return total - sum;
    }

    public int missingNumberUpdate(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int expected = (nums.length+1)*nums.length/2;
        return expected - sum;
    }
}
