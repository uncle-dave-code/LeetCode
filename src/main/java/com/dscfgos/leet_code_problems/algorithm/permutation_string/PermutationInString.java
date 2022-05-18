package com.dscfgos.leet_code_problems.algorithm.permutation_string;

import java.util.HashMap;
import java.util.Map;

/**
 * (567) - Permutation in String
 * <p>
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 * <p>
 * In other words, return true if one of s1's permutations is the substring of s2.
 */
public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1 != null && s2 != null && s1.length() <= s2.length()) {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s1.length(); i++) {
                map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
            }

            for (int i = 0; i < s2.length()-s1.length()+1; i++) {
                Map<Character, Integer> tmpmap = new HashMap<>();
                if(map.containsKey(s2.charAt(i))){
                    boolean valid = true;
                    for (int j = i; j < i+s1.length(); j++) {
                        tmpmap.put(s2.charAt(j), tmpmap.getOrDefault(s2.charAt(j), 0) + 1);
                    }
                    if(validFrecuencies(map,tmpmap)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean validFrecuencies(Map<Character,Integer> map1, Map<Character,Integer> map2){
        if(map1.size() != map2.size()){
            return false;
        }

        for (var code: map1.keySet()) {
            if(!map2.containsKey(code) || !map2.get(code).equals(map1.get(code))){
                return false;
            }
        }

        return true;
    }
}
