package com.dscfgos.leet_code_problems.algorithm.max_area_of_island;

/**
 * (695) - Max Area of Island
 * <p>
 * You are given an m x n binary matrix grid. An island is a group of 1's (representing land)
 * connected 4-directionally (horizontal or vertical.)
 * You may assume all four edges of the grid are surrounded by water.
 * <p>
 * The area of an island is the number of cells with a value 1 in the island.
 * <p>
 * Return the maximum area of an island in grid. If there is no island, return 0.
 */
public class MaxAreaIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j]==1){
                    int area = this.updateIsland(grid, i,j);
                    result = Math.max(result,area);
                }
            }
        }

        return result;
    }

    private int updateIsland(int[][] grid, int i, int j) {
        grid[i][j] = -1;
        int result = 1;
        //Update Rows
        if (i > 0) {
            if (grid[i - 1][j] == 1) {
                result += updateIsland(grid,i-1,j);
            }
        }
        if (i < grid.length - 1) {
            if (grid[i + 1][j] == 1) {
                result += updateIsland(grid,i+1,j);
            }
        }

        if (j > 0) {
            if (grid[i][j - 1] == 1) {
                result += updateIsland(grid,i,j-1);
            }
        }
        if (j < grid[i].length - 1) {
            if (grid[i][j + 1] == 1) {
                result += updateIsland(grid,i,j+1);
            }
        }

        return result;
    }
}
