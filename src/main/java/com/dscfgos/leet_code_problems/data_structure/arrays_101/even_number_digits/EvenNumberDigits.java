package com.dscfgos.leet_code_problems.data_structure.arrays_101.even_number_digits;

/**
 * Find Numbers with Even Number of Digits
 * Given an array nums of integers, return how many of them contain an even number of digits.
 */
public class EvenNumberDigits {
    public int evenNumbersString(int[] nums) {
        int result = 0;
        for (int number : nums) {
            if(String.valueOf(number).length() % 2 == 0){
                result++;
            }
        }
        return result;
    }

    public int evenNumbers(int[] nums) {
        int result = 0;
        for (int number : nums) {
            int temp = 0;
            while (number > 0){
                temp++;
                number = number / 10;
            }
            if(temp % 2 == 0){
                result++;
            }

        }
        return result;
    }
}
