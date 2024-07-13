package org.example;

public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) {
            return image;
        }
        helper(image, sr, sc, image[sr][sc], color);
        return image;
    }

    public void helper(int[][] image, int sr, int sc, int here, int color) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != here) {
            return;
        }
        image[sr][sc] = color;
        helper(image, sr + 1, sc, here, color);
        helper(image, sr - 1, sc, here, color);
        helper(image, sr, sc + 1, here, color);
        helper(image, sr, sc - 1, here, color);
    }
}
