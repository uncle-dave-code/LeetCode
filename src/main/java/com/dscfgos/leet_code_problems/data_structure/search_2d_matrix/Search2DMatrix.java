package com.dscfgos.leet_code_problems.data_structure.search_2d_matrix;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * (74) - Search a 2D Matrix
 * <p>
 * Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix.
 * This matrix has the following properties:
 * <p>
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 */
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix == null){
            return false;
        }

        for(int i=0;i< matrix.length;i++){
            if(isInMatrixRange(matrix[i],target)){
                return binarySearch(matrix[i], target, 0,matrix[i].length-1);
            }
        }

        return false;

    }

    private boolean isInMatrixRange(int[] arr, int target){
        if(arr!= null && arr.length>0){
            if(target >= arr[0] && target <= arr[arr.length-1]){
                return true;
            }
        }

        return false;
    }


    private boolean binarySearch(int[] arr, int target, int lowIndex, int highIndex){
        if(highIndex >= lowIndex){
            int mid = lowIndex + (highIndex - lowIndex) / 2;

            if(arr[mid]==target){
                return true;
            }else if(arr[mid]>target){
                return binarySearch(arr, target, lowIndex, mid-1);
            } else {
                return binarySearch(arr, target, mid+1, highIndex);
            }
        }

        return false;
    }
}
