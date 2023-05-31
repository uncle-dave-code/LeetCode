package com.dscfgos.leet_code_problems.data_structures_and_algorithms.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * (1189) - Maximum Number of Balloons
 * <p>
 * Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
 * You can use each character in text at most once. Return the maximum number of instances that can be formed.
 */
public class MaximumNumberBalloons {

    public static void main(String[] args) {
        MaximumNumberBalloons maximumNumberBalloons = new MaximumNumberBalloons();
        String text = "nlaebolko";
        int maxNumberOfBalloons = maximumNumberBalloons.maxNumberOfBalloons(text);
        System.out.println(maxNumberOfBalloons); // 1

        text = "loonbalxballpoon";
        maxNumberOfBalloons = maximumNumberBalloons.maxNumberOfBalloons(text);
        System.out.println(maxNumberOfBalloons); // 2

    }

    public int maxNumberOfBalloons(String text) {

        Map<Character, Integer> balloonMap = Map.of('b', 1, 'a', 1, 'l', 2, 'o', 2, 'n', 1);
        Map<Character, Integer> textMap = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            textMap.put(character, textMap.getOrDefault(character, 0) + 1);
        }

        int result = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : balloonMap.entrySet()) {
            char character = entry.getKey();
            if (textMap.containsKey(character)) {
                int count = textMap.get(character) / entry.getValue();
                if(count>0){
                    result = (Math.min(result, textMap.get(character) / entry.getValue()));
                }else{
                    return 0;
                }
            } else {
                return 0;
            }
        }

        return result;
    }
}
