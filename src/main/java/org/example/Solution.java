package org.example;

public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        //check if the starting color is the same as the new color
        if (color == image[sr][sc]) {
            return image;
        }
        helper(image, sr, sc, image[sr][sc], color);
        return image;
    }

    public void helper(int[][] image, int sr, int sc, int here, int color) {
        //check if the new location goes out of bounds
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || here != image[sr][sc]) {
            return;
        }
        //change the color of the current location
        image[sr][sc] = color;
        //check colors of the 4 pixels connected directionally
        helper(image, sr + 1, sc, here, color);
        helper(image, sr - 1, sc, here, color);
        helper(image, sr, sc + 1, here, color);
        helper(image, sr, sc - 1, here, color);
    }
}
