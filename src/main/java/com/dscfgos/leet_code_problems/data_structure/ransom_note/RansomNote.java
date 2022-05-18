package com.dscfgos.leet_code_problems.data_structure.ransom_note;

import java.util.HashMap;
import java.util.Map;

/**
 * (383) - Ransom Note
 * <p>
 * Given two strings ransomNote and magazine, return true if ransomNote
 * can be constructed from magazine and false otherwise.
 * <p>
 * Each letter in magazine can only be used once in ransomNote.
 */
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote != null && magazine != null && magazine.length() > 0) {
            Map<Character, Integer> mapMag = new HashMap<>();
            for (int i = 0; i < magazine.length(); i++) {
                mapMag.put(magazine.charAt(i), mapMag.getOrDefault(magazine.charAt(i), 0) + 1);
            }

            for (int i = 0; i < ransomNote.length(); i++) {
                char letter = ransomNote.charAt(i);
                if(mapMag.containsKey(letter) && mapMag.get(letter)>0){
                    mapMag.put(letter, mapMag.get(letter)-1);
                }
                else{
                    return false;
                }
            }

            return true;
        }
        return false;
    }
}
