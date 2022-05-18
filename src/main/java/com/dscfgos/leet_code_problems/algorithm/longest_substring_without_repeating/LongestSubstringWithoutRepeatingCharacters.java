package com.dscfgos.leet_code_problems.algorithm.longest_substring_without_repeating;

import java.util.HashMap;
import java.util.Map;

/**
 * (3) - Longest Substring Without Repeating Characters
 * <p>
 * Given a string s, find the length of the longest substring without repeating characters.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        if (s != null && s.length() > 0) {
            int result = 0;
            int count = 0;
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if (map.containsKey(s.charAt(i))) {
                    if (count > result) {
                        result = count;
                    }
                    i = map.get(s.charAt(i))+1;
                    map.clear();
                    count = 0;
                }

                map.put(s.charAt(i), i);
                count++;
            }

            if (count > result) {
                result = count;
            }

            return result;
        }
        return 0;
    }

}
