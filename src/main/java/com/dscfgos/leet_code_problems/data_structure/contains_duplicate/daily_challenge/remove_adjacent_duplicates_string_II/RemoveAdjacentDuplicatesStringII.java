package com.dscfgos.leet_code_problems.data_structure.contains_duplicate.daily_challenge.remove_adjacent_duplicates_string_II;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * (1209) - Remove All Adjacent Duplicates in String II
 * <p>
 * You are given a string s and an integer k, a k duplicate removal consists of choosing k
 * adjacent and equal letters from s and removing them, causing the left and the right side
 * of the deleted substring to concatenate together.
 * <p>
 * We repeatedly make k duplicate removals on s until we no longer can.
 * <p>
 * Return the final string after all such duplicate removals have been made.
 * It is guaranteed that the answer is unique.
 */
public class RemoveAdjacentDuplicatesStringII {

    public String removeDuplicates(String s, int k) {
        if (s != null && s.length() >= k) {
            StringBuilder sb = new StringBuilder(s);
            Stack<Integer> counter = new Stack<>();
            for (int i = 0; i < sb.length(); ++i) {
                if (i == 0 || sb.charAt(i) != sb.charAt(i - 1)) {
                    counter.push(1);
                } else {
                    int value = counter.pop() + 1;
                    if (value == k) {
                        sb.delete(i - k + 1, i + 1);
                        i = i - k;
                    } else {
                        counter.push(value);
                    }
                }
            }

            return sb.toString();
        }

        return s;
    }
}
