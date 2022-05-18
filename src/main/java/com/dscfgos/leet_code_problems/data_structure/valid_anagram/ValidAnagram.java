package com.dscfgos.leet_code_problems.data_structure.valid_anagram;

import java.util.*;

/**
 * (242) - Valid Anagram
 * <p>
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        char[]  charS = s.toCharArray();
        char[]  charT = t.toCharArray();

        Arrays.sort(charS);
        Arrays.sort(charT);

        return Arrays.equals(charS,charT);
    }

}
