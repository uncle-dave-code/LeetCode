package com.dscfgos.leet_code_problems.data_structures_and_algorithms.arrays_strings;

/**
 * (557) - Reverse Words in a String III
 * <p>
 * Given a string s, reverse the order of characters in each word within a
 * sentence while still preserving whitespace and initial word order.
 * <p>
 */
public class ReverseWordsStringIII {

    public static void main(String[] args) {
        var reverseString = new ReverseWordsStringIII();
        System.out.println(reverseString.reverseWords("God Ding"));
    }

    public String reverseWords(String s) {
        int left = 0, right = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i <= chars.length; i++) {
            if (i == chars.length || chars[i] == ' ') {
                while (left < right-1) {
                    char tmp = chars[left];
                    chars[left++] = chars[--right];
                    chars[right] = tmp;
                }

                right = left = i+1;
            } else {
                right++;
            }
        }

        return new String(chars);
    }
}
