package com.dscfgos.leet_code_problems.data_structure.array_and_string.plus_one;

import java.util.LinkedList;
import java.util.List;

/**
 * (66) - Plus One
 * <p>
 * You are given a large integer represented as an integer array digits,
 * where each digits[i] is the ith digit of the integer. The digits are ordered
 * from most significant to least significant in left-to-right order.
 * The large integer does not contain any leading 0's.
 * <p>
 * Increment the large integer by one and return the resulting array of digits.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        if(digits==null){
            return null;
        }

        for (int i = digits.length-1; i >= 0 ; i--) {
            if(digits[i]==9){
                digits[i] = 0;
            }else{
                digits[i]++;
                return digits;
            }
        }

        int[] result = new int[digits.length+1];
        result[0] = 1;

        return result;
    }
}
