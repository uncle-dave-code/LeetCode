package com.dscfgos.leet_code_problems.data_structure.arrays_101.height_checker;

import java.util.Arrays;

/**
 * Height Checker
 * <p>
 * A school is trying to take an annual photo of all the students.
 * The students are asked to stand in a single file line in non-decreasing order by height.
 * Let this ordering be represented by the integer array expected where expected[i] is
 * the expected height of the ith student in line.
 * <p>
 * You are given an integer array heights representing the current order that the students are standing in.
 * Each heights[i] is the height of the ith student in line (0-indexed).
 * <p>
 * Return the number of indices where heights[i] != expected[i].
 */
public class HeightChecker {

    public int heightChecker(int[] heights) {
        int result = 0;
        if (heights != null && heights.length > 0) {
            int[] copy = Arrays.copyOf(heights, heights.length);
            Arrays.sort(copy);
            for (int i = 0; i < heights.length; i++) {
                if(heights[i] != copy[i]){
                    result++;
                }
            }
        }

        return result;
    }

}
