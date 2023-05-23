package com.dscfgos.leet_code_problems.data_structures_and_algorithms.arrays_strings;

/**
 * (1456) Maximum Number of Vowels in a Substring of Given Length
 * Given a string s and an integer k.
 * Return the maximum number of vowel letters in any substring of s with length k.
 * <p>
 * Vowel letters in English are (a, e, i, o, u).
 * <p>
 */
public class MaximumVowelsSubstringGivenLength {

    public static void main(String[] args) {

        var maximumVowelsSubstringGivenLength = new MaximumVowelsSubstringGivenLength();
        System.out.println(maximumVowelsSubstringGivenLength.maxVowels("leetcode", 3));

    }

    public int maxVowels(String s, int k) {
        int max = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                max++;
            }
        }

        if (s.length() > k) {
            int lastWindow = max;
            for (int i = k; i < s.length(); i++) {
                int vowelDiff = (isVowel(s.charAt(i)) ? 1 : 0) - (isVowel(s.charAt(i - k)) ? 1 : 0);
                lastWindow = lastWindow + vowelDiff;
                max = Math.max(max, lastWindow);
            }
        }


        return max;
    }

    private boolean isVowel(char letter) {
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
                letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U';
    }
}
