package com.dscfgos.leet_code_problems.data_structure.longest_palindrome;

import java.util.HashMap;
import java.util.Map;

/**
 * (409) - Longest Palindrome
 * <p>
 * Given a string s which consists of lowercase or uppercase letters,
 * return the length of the longest palindrome that can be built with those letters.
 * <p>
 * Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
 */
public class LongestPalindrome {

    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = 0;
        boolean oneOcurrence = false;
        for (int v : map.values()) {
            if (v / 2 >= 1) {
                count += v / 2 * 2;
            }
            if (v % 2 != 0 && !oneOcurrence) {
                count++;
                oneOcurrence = true;
            }

        }

        return count;
    }
}
