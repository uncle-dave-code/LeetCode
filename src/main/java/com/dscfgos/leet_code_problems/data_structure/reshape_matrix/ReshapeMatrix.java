package com.dscfgos.leet_code_problems.data_structure.reshape_matrix;

import java.util.HashMap;
import java.util.Map;

/**
 * (566) - Reshape the Matrix
 * <p>
 * In MATLAB, there is a handy function called reshape which can reshape an m x n
 * matrix into a new one with a different size r x c keeping its original data.
 * <p>
 * You are given an m x n matrix mat and two integers r and c representing the
 * number of rows and the number of columns of the wanted reshaped matrix.
 * <p>
 * The reshaped matrix should be filled with all the elements of the original
 * matrix in the same row-traversing order as they were.
 * <p>
 * If the reshape operation with given parameters is possible and legal,
 * output the new reshaped matrix; Otherwise, output the original matrix.
 */
public class ReshapeMatrix {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat != null && mat.length > 0 && mat.length * mat[0].length == c * r) {
            int[][] result = new int[r][c];
            int count = 0;
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    result[count / c][count % c] = mat[i][j];
                    count++;
                }
            }
            return result;
        } else {
            return mat;
        }
    }
}
