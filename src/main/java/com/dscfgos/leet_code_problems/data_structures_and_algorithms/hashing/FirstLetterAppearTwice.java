package com.dscfgos.leet_code_problems.data_structures_and_algorithms.hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * (2351) - First Letter to Appear Twice
 * Given a string s consisting of lowercase English letters,
 * return the first letter to appear twice.
 */
public class FirstLetterAppearTwice {

    public static void main(String[] args) {
        FirstLetterAppearTwice firstLetterAppearTwice = new FirstLetterAppearTwice();
        System.out.println(firstLetterAppearTwice.repeatedCharacter("abccbaacz"));
    }

    public char repeatedCharacter(String s) {
        Set<Character> characters = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (characters.contains(character)) {
                return character;
            }
            characters.add(character);
        }

        return Character.MIN_VALUE;
    }
}
