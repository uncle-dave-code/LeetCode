package com.dscfgos.leet_code_problems.data_structure.array_and_string.diagonal_traverse;

/**
 * (498) - Diagonal Traverse
 * <p>
 * Given an m x n matrix mat, return an array of all
 * the elements of the array in a diagonal order.
 */
public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[0];
        }

        int rows = mat.length;
        int columns = mat[0].length;

        int currentRow = 0;
        int currentColumn = 0;

        boolean climbing = true;

        int[] result = new int[columns * rows];
        int counter = 0;

        while (currentRow < rows && currentColumn < columns) {
            result[counter] = mat[currentRow][currentColumn];
            counter++;

            //Moving cell
            int newRow = currentRow + ((climbing) ? -1 : 1);
            int newColumn = currentColumn + ((climbing) ? 1 : -1);

            //Check borders
            if (newRow < 0 || newRow == rows || newColumn < 0 || newColumn == columns) {
                if (climbing) {
                    currentRow += (currentColumn == columns - 1 ? 1 : 0);
                    currentColumn += (currentColumn < columns - 1 ? 1 : 0);
                } else {
                    currentColumn += (currentRow == rows - 1 ? 1 : 0);
                    currentRow += (currentRow < rows - 1 ? 1 : 0);
                }

                climbing = !climbing;
            } else {
                currentRow = newRow;
                currentColumn = newColumn;
            }
        }

        return result;
    }
}
