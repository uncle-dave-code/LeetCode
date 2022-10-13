package com.dscfgos.leet_code_problems.data_structure.array_and_string.spiral_matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * (54) - Spiral Matrix
 * <p>
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();
        if (matrix != null && matrix.length > 0) {

            int rows = matrix.length;
            int columns = matrix[0].length;

            int top = 0;
            int left = 0;
            int righ = columns - 1;
            int bottom = rows - 1;


            while (result.size() < rows * columns) {
                //Go Left -> Right
                for (int col = left; col <= righ; col++) {
                    result.add(matrix[top][col]);
                }

                //Go Top -> Bottom
                for (int row = top+1; row <= bottom; row++) {
                    result.add(matrix[row][righ]);
                }

                //Go Right -> Left
                if(top != bottom){
                    for (int col = righ-1; col >= left; col--) {
                        result.add(matrix[bottom][col]);
                    }
                }

                //Go Bottom -> Top
                if(left != righ){
                    for (int row = bottom-1; row > top; row--) {
                        result.add(matrix[row][left]);
                    }
                }

                top++;
                left++;
                righ--;
                bottom--;


            }
        }

        return result;
    }

    public static void main(String... args) {
        int[][] nums1 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        spiralMatrix.spiralOrder(nums1);
    }
}
