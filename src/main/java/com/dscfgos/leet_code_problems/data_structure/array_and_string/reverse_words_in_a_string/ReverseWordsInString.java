package com.dscfgos.leet_code_problems.data_structure.array_and_string.reverse_words_in_a_string;

import java.util.Stack;

/**
 * (151) - Reverse Words in a String
 * <p>
 * Given an input string s, reverse the order of the words.
 * <p>
 * A word is defined as a sequence of non-space characters.
 * The words in s will be separated by at least one space.
 * <p>
 * Return a string of the words in reverse order concatenated by a single space.
 * <p>
 * Note that s may contain leading or trailing spaces or multiple spaces between two words.
 * The returned string should only have a single space separating the words.
 * Do not include any extra spaces.
 */
public class ReverseWordsInString {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        if (s != null && s.length() > 0) {
            int pointer = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != ' ') {
                    sb.append(s.charAt(i));
                } else {
                    if (sb.length() > 0) {
                        stack.push(sb.toString());
                        sb = new StringBuilder();
                    }
                }
            }
            if (sb.length() > 0) {
                stack.push(sb.toString());
            }
        }

        sb = new StringBuilder();

        if (!stack.isEmpty()) {
            int size = stack.size();
            for (int i = 0; i < size - 1; i++) {
                sb.append(stack.pop() + " ");
            }
            sb.append(stack.pop());
        }

        return sb.toString();
    }

    public String reverseWordsIII(String s) {
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
