package com.dscfgos.leet_code_problems.data_structure.valid_parentheses;

import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * (20) - Valid Parentheses
 * <p>
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        Set<Character> closeTags = Set.of(')', '}', ']');
        Map<Character, Character> openTags = Map.of('(', ')', '{', '}', '[', ']');

        for (int i = 0; i < s.length(); i++) {
            Character character = s.charAt(i);
            if (openTags.containsKey(character)) {
                stack.push(s.charAt(i));
            } else if (closeTags.contains(character)) {
                if (stack.isEmpty() || !openTags.get(stack.pop()).equals(character)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
