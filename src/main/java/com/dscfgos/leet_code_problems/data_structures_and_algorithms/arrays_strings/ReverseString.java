package com.dscfgos.leet_code_problems.data_structures_and_algorithms.arrays_strings;

import java.util.Arrays;

/**
 * (344) - Reverse String
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * <p>
 * You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class ReverseString {

    public static void main(String[] args) {
        char[] str1 = {'h', 'e', 'l', 'l', 'o'};
        char[] str2 = {'H', 'a', 'n', 'n', 'a', 'h'};

        var reverseString = new ReverseString();

        System.out.println(Arrays.toString(str1) + " - " + Arrays.toString(reverseString.reverseString(str1)));
        System.out.println(Arrays.toString(str2) + " - " + Arrays.toString(reverseString.reverseString(str2)));

    }

    private char[] reverseString(char[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char tmp = arr[left];

            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }

        return arr;
    }
}
