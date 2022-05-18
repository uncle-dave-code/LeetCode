package com.dscfgos.leet_code_problems.algorithm.flood_fill;

/**
 * (733) - Flood Fill
 * <p>
 * An image is represented by an m x n integer grid image where image[i][j]
 * represents the pixel value of the image.
 * <p>
 * You are also given three integers sr, sc, and newColor.
 * You should perform a flood fill on the image starting from the pixel image[sr][sc].
 * <p>
 * To perform a flood fill, consider the starting pixel, plus any pixels connected
 * 4-directionally to the starting pixel of the same color as the starting pixel,
 * plus any pixels connected 4-directionally to those pixels (also with the same color),
 * and so on. Replace the color of all of the aforementioned pixels with newColor.
 * <p>
 * Return the modified image after performing the flood fill.
 */
public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        return paint(image, sr, sc, newColor, image[sr][sc]);
    }

    private int[][] paint(int[][] image, int sr, int sc, int newColor, int baseColor) {

        if (image[sr][sc] != newColor) {

            image[sr][sc] = newColor;

            if (sr > 0) {
                if (image[sr - 1][sc] == baseColor) {
                    image = paint(image, sr - 1, sc, newColor, baseColor);
                }
            }
            if (sr < image.length - 1) {
                if (image[sr + 1][sc] == baseColor) {
                    image = paint(image, sr + 1, sc, newColor, baseColor);
                }
            }

            if (sc > 0) {
                if (image[sr][sc - 1] == baseColor) {
                    image = paint(image, sr, sc - 1, newColor, baseColor);
                }
            }
            if (sc < image[sr].length - 1) {
                if (image[sr][sc + 1] == baseColor) {
                    image = paint(image, sr, sc + 1, newColor, baseColor);
                }
            }
        }


        return image;
    }
}
