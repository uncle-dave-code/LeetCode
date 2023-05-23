package com.dscfgos.leet_code_problems.data_structures_and_algorithms.arrays_strings;

/**
 * (917) Reverse Only Letters
 * Given a string s, reverse the string according to the following rules:
 * <p> - All the characters that are not English letters remain in the same position.
 * <p> - All the English letters (lowercase or uppercase) should be reversed.
 * <p>
 * Return s after reversing it.
 */
public class ReverseOnlyLetters {
    public static void main(String[] args) {
        var reverseOnlyLetters = new ReverseOnlyLetters();
        System.out.println(reverseOnlyLetters.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    public String reverseOnlyLetters(String s) {
        char[] letters = s.toCharArray();
        int left = 0, right = letters.length - 1;

        while (left < right) {
            if (!isLetter(letters[left])) {
                left++;
                continue;
            }
            if (!isLetter(letters[right])) {
                right--;
                continue;
            }

            char tmp = letters[left];
            letters[left++] = letters[right];
            letters[right--] = tmp;
        }

        return new String(letters);
    }

    private boolean isLetter(char character) {
        return (character >= 65 && character <= 90) || (character >= 97 && character <= 122);
    }
}
