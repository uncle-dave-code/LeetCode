package com.dscfgos.leet_code_problems.algorithm.is_subsequence;

/**
 * (392) - Is Subsequence
 * <p>
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * <p>
 * A subsequence of a string is a new string that is formed from the original string by deleting some
 * (can be none) of the characters without disturbing the relative positions of the remaining characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {

        if (s == null || t == null || s.length() > t.length()) {
            return false;
        }

        int pointer = 0;

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            boolean found = false;
            for (; pointer < t.length(); pointer++) {
                if(letter == t.charAt(pointer)){
                    pointer++;
                    found = true;
                    break;
                }
            }

            if(!found){
                return false;
            }
        }
        return true;
    }
}
