package com.dscfgos.leet_code_problems.data_structures_and_algorithms.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * (1941) - Check if All Characters Have Equal Number of Occurrences
 * Given a string s, return true if s is a good string, or false otherwise.
 * A string s is good if all the characters that appear in s have the same number of occurrences
 * (i.e., the same frequency).
 */
public class CheckCharactersEqualNumberOccurrences {

    public static void main(String[] args) {
        CheckCharactersEqualNumberOccurrences checkCharactersEqualNumberOccurrences = new CheckCharactersEqualNumberOccurrences();
        System.out.println(checkCharactersEqualNumberOccurrences.areOccurrencesEqual("abacbc")); // true
        System.out.println(checkCharactersEqualNumberOccurrences.areOccurrencesEqual("aaabb")); // false
    }

    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> frequency = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        int count = frequency.get(s.charAt(0));

        for (int value: frequency.values()) {
            if(value != count){
                return false;
            }
        }

        return true;
    }
}
