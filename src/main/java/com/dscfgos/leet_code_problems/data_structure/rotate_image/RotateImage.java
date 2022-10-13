package com.dscfgos.leet_code_problems.data_structure.rotate_image;

import java.util.HashSet;
import java.util.Set;

/**
 * 48 - Rotate Image
 * <p>
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 * <p>
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 * DO NOT allocate another 2D matrix and do the rotation.
 */
public class RotateImage {
    public int[][] rotate(int[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return matrix;
        }
        int n = matrix.length;

        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < n / 2; j++) {

                int tmp = matrix[i][j];

                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = tmp;
            }
        }

        return matrix;
    }
}
