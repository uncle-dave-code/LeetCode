package com.dscfgos.leet_code_problems.algorithm.reverse_string;

/**
 * (344) - Reverse String
 * <p>
 * Write a function that reverses a string.
 * The input string is given as an array of characters s.
 * <p>
 * You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class ReverseString {
    public char[] reverse(char[] s) {
        if (s != null && s.length > 1) {
            for (int i = 0, j = s.length - 1; i < j; i++, j--) {
                char tmp = s[i];
                s[i] = s[j];
                s[j] = tmp;
            }
        }
        return s;
    }
}
