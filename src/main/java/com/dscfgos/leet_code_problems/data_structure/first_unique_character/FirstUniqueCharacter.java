package com.dscfgos.leet_code_problems.data_structure.first_unique_character;

import java.util.*;

/**
 * (387) - First Unique Character in a String
 * <p>
 * Given a string s, find the first non-repeating character in it and return its index.
 * If it does not exist, return -1.
 */
public class FirstUniqueCharacter {

    public int firstUniqChar(String s) {
        if (s != null && s.length() > 0) {
            Map<Character, Boolean> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                map.put(s.charAt(i), map.containsKey(s.charAt(i)) ? false : true);
            }

            for (int i = 0; i < s.length(); i++) {
                if(map.get(s.charAt(i))==true){
                    return i;
                }
            }
        }
        return -1;
    }
}
