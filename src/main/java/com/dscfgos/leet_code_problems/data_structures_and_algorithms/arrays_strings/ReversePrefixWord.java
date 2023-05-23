package com.dscfgos.leet_code_problems.data_structures_and_algorithms.arrays_strings;


/**
 * (2000) Reverse Prefix of Word
 * Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the
 * index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.
 * <p><br>
 * For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at
 * 3 (inclusive). The resulting string will be "dcbaefd".
 * Return the resulting string.
 * <p>
 */
public class ReversePrefixWord {
    public static void main(String[] args) {
        var reversePrefixWord = new ReversePrefixWord();
        System.out.println(reversePrefixWord.reversePrefix("abcdefd", 'd'));
    }

    public String reversePrefix(String word, char ch) {

        if (word == null || word.length() <= 1) {
            return word;
        }

        char[] charWord = word.toCharArray();

        //find the indexes
        int right = -1;
        for (int i = 0; i < charWord.length; i++) {
            if (charWord[i] == ch) {
                right = i;
                break;
            }
        }

        if (right != -1 && right != 0) {
            int left = 0;
            while (left < right) {
                char tmp = charWord[left];
                charWord[left++] = charWord[right];
                charWord[right--] = tmp;
            }
        }

        return new String(charWord);
    }
}
