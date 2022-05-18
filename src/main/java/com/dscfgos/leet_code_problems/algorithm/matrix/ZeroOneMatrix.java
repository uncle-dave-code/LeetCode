package com.dscfgos.leet_code_problems.algorithm.matrix;

/**
 * (542) - 01 Matrix
 * <p>
 * Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.
 *
 * The distance between two adjacent cells is 1.
 */
public class ZeroOneMatrix {
    public int[][] updateMatrix(int[][] mat) {

        if(mat != null){
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    if(mat[i][j]==1){
                        mat[i][j] = this.calculateDistanceFrom(mat, i,j);
                    }
                }
            }
        }

        return mat;
    }

    private int calculateDistanceFrom(int[][] mat, int i, int j) {
        int result = -1;

        if(j>0){
            if(mat[i][j-1]==0){
                return 1;
            }else{
                int minCol1 = calculateDistanceFrom(mat, i,j-1)+1;
                result = (result!=-1)?Math.min(result,minCol1):minCol1;
            }
        }
        if(j<mat[i].length-1){
            if(mat[i][j+1]==0){
                return 1;
            }else{
                int minCol2 = calculateDistanceFrom(mat, i,j+1)+1;
                result = (result!=-1)?Math.min(result,minCol2):minCol2;
            }
        }

        if(i>0){
            if(mat[i-1][j]==0){
                return 1;
            }else{
                result = calculateDistanceFrom(mat, i-1,j)+1;
            }
        }
        if(i<mat.length-1){
            if(mat[i+1][j]==0){
                return 1;
            }else{
                int minRow2 = calculateDistanceFrom(mat, i+1,j)+1;
                result = (result!=-1)?Math.min(result,minRow2):minRow2;
            }
        }


        return result;
    }
}
