package com.dscfgos.leet_code_problems.algorithm.reverse_words_string_III;

/**
 * (344) - Reverse String
 * <p>
 * Write a function that reverses a string.
 * The input string is given as an array of characters s.
 * <p>
 * You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class ReverseWordsStringIII {
    public String reverseWords(String s) {
        if (s != null && s.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String[] words = s.split(" ");
            for (String word : words) {
                sb.append(new StringBuilder(word).reverse() + " ");
            }

            s = sb.toString().trim();
        }
        return s;
    }


}
