package com.dscfgos.leet_code_problems.data_structure.array_and_string.pascal_triangle_II;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * (119) - Pascal's Triangle II
 * <p>
 * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 */
public class PascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>(rowIndex + 1);

        long value = 1;

        for (int i = 0; i <= rowIndex; i++) {
            result.add((int)value);
            value = value * (rowIndex - i) / (i + 1);
        }

        return result;
    }

}
