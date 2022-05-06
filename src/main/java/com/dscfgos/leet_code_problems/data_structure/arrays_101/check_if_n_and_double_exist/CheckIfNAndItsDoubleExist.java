package com.dscfgos.leet_code_problems.data_structure.arrays_101.check_if_n_and_double_exist;

import java.util.HashMap;
import java.util.Map;

/**
 * Check If N and Its Double Exist
 * <p>
 * Given an array arr of integers, check if there exists two integers N and M such that N
 * is the double of M ( i.e. N = 2 * M).
 */
public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExistDouble(int[] arr) {

        boolean result = false;
        if (arr != null && arr.length > 0) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                map.put(arr[i], i);
            }

            for (int i = 0; i < arr.length; i++) {
                int number = 2 * arr[i];
                if (map.containsKey(number) && map.get(number) != i) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public boolean checkIfExist(int[] arr) {

        boolean result = false;
        if (arr != null && arr.length > 0) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < arr.length; i++) {
                int mult = arr[i] * 2;

                if (map.containsKey(mult) || (arr[i] % 2 == 0 && map.containsKey(arr[i] / 2))) {
                    result = true;
                    break;
                } else {
                    map.put(arr[i], i);
                }
            }
        }
        return result;
    }
}
