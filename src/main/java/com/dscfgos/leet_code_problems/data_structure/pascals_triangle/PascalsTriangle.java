package com.dscfgos.leet_code_problems.data_structure.pascals_triangle;

import java.util.LinkedList;
import java.util.List;

/**
 * (118) - Pascal's Triangle
 * <p>
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 */
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new LinkedList<>();
        if (numRows > 0) {
            int counter = 1;
            for (int i = 0; i < numRows; i++) {
                List<Integer> row = new LinkedList<>();
                for (int j = 0; j < counter; j++) {
                    if (i >= 2 && j >= 1 && j < counter-1) {
                        row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                    } else {
                        row.add(1);
                    }
                }
                result.add(row);
                counter++;
            }
        }
        return result;
    }
}
