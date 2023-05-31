package com.dscfgos.leet_code_problems.data_structures_and_algorithms.hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * (1426) - Counting Elements
 * Given an integer array arr, count element x such that x + 1 is also in arr.
 * <p>
 * If there're duplicates in arr, count them seperately.
 * <p>
 */
public class CountingElements {

    public static void main(String[] args) {
        CountingElements countingElements = new CountingElements();
        System.out.println(countingElements.countElements(new int[]{1, 2, 3})); // 2
        System.out.println(countingElements.countElements(new int[]{1, 1, 3, 3, 5, 5, 7, 7})); // 0
        System.out.println(countingElements.countElements(new int[]{1, 3, 2, 3, 5, 0})); // 3
        System.out.println(countingElements.countElements(new int[]{1, 1, 2, 2})); // 2
    }

    public int countElements(int[] arr) {
        Set<Integer> elements = new HashSet<>();
        int result = 0;
        for (int num : arr) {
            elements.add(num);
        }
        for (int num : arr) {
            if (elements.contains(num + 1)) {
                result++;
            }
        }
        return result;
    }

}
