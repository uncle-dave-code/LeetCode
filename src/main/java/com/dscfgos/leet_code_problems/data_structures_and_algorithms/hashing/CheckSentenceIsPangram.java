package com.dscfgos.leet_code_problems.data_structures_and_algorithms.hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * (1832) - Check if the Sentence Is Pangram
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 * Given a string sentence containing only lowercase English letters,
 * return true if sentence is a pangram, or false otherwise.
 */
public class CheckSentenceIsPangram {

    public static void main(String[] args) {
        CheckSentenceIsPangram checkSentenceIsPangram = new CheckSentenceIsPangram();
        System.out.println(checkSentenceIsPangram.checkIfPangramUpdated("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(checkSentenceIsPangram.checkIfPangramUpdated("leetcode"));
    }

    public boolean checkIfPangram(String sentence) {
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            characters.add(sentence.charAt(i));
        }

        for (int i = 97; i <= 122; i++) {
            if (!characters.contains((char)i)) {
                return false;
            }
        }

        return true;
    }

    public boolean checkIfPangramUpdated(String sentence) {
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            characters.add(sentence.charAt(i));
        }

        return characters.size()==26;
    }
}
