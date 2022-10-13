package com.dscfgos.leet_code_problems.algorithm.number_of_islands;

/**
 * (200) - Number of Islands
 * <p>
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 * <p>
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 */
public class NumberIslands {

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    markIsland(grid, i, j);
                }
            }
        }
        return count;
    }

    private char[][] markIsland(char[][] grid, int sr, int sc) {

        if (sr < 0 || sr >= grid.length || sc < 0 || sc >= grid[sr].length || grid[sr][sc] == '0') {
            return grid;
        }
        grid[sr][sc] = '0';

        if(sc+1 < grid[sr].length) {
            grid = markIsland(grid, sr, sc + 1);
        }
        if(sc-1 >= 0) {
            grid = markIsland(grid, sr, sc - 1);
        }
        if(sr+1 < grid.length) {
            grid = markIsland(grid, sr + 1, sc);
        }
        if(sr-1 >= 0) {
            grid = markIsland(grid, sr - 1, sc);
        }

        return grid;
    }
}
