package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void floodFillTest() {
        Solution solution = new Solution();
        int[][] inputOne = new int[][] {
                {1,1,1},
                {1,1,0},
                {1,0,1}
        };
        int[][] outputOne = new int[][] {
                {2,2,2},
                {2,2,0},
                {2,0,1}
        };
        int[][] compareOne = solution.floodFill(inputOne, 1, 1, 2);
        assertArrayEquals(compareOne, outputOne);
        int[][] inputTwo = new int[][] {
                {0,0,0},
                {0,0,0}
        };
        int[][] outputTwo = new int[][] {
                {0,0,0},
                {0,0,0}
        };
        int[][] compareTwo = solution.floodFill(inputTwo, 0, 0, 0);
        assertArrayEquals(compareTwo, outputTwo);

    }

}