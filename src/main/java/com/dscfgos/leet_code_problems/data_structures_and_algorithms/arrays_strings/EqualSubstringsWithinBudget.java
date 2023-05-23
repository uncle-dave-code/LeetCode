package com.dscfgos.leet_code_problems.data_structures_and_algorithms.arrays_strings;

/**
 * (1208) Equal Substrings Within Budget
 * You are given two strings s and t of the same length. You want to change s to t.
 * Changing the i-th character of s to i-th character of t costs |s[i] - t[i]| that is,
 * the absolute difference between the ASCII values of the characters.
 * <p>
 * You are also given an integer maxCost.
 * <p>
 * Return the maximum length of a substring of s that can be changed to be the same as the corresponding substring of t with a cost less than or equal to maxCost.
 * <p>
 * If there is no substring from s that can be changed to its corresponding substring from t, return 0.
 * <p>
 */
public class EqualSubstringsWithinBudget {
    public static void main(String[] args) {

        var equalSubstringsWithinBudget = new EqualSubstringsWithinBudget();
        System.out.println(equalSubstringsWithinBudget.equalSubstring("abcd", "bcdf", 3));
    }

    public int equalSubstring(String s, String t, int maxCost) {
        int result = 0;
        int start = 0;
        int currentCost = 0;
        for (int end = 0; end < s.length(); end++) {
            currentCost += Math.abs(s.charAt(end) - t.charAt(end));
            while (currentCost > maxCost) {
                currentCost -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }
            result = Math.max(result, end - start + 1);
        }

        return result;
    }
}
