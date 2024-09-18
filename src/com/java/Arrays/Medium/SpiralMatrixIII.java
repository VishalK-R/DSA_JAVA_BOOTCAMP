package com.java.Arrays.Medium;

import java.util.Arrays;

public class SpiralMatrixIII {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(spiralMatrixIII(5,6,1,4)));
    }
    /*ou start at the cell (rStart, cStart) of an rows x cols grid facing east. The
    northwest corner is at the first row and column in the grid, and the southeast
    corner is at the last row and column.

    You will walk in a clockwise spiral shape to visit every position in this grid.
    Whenever you move outside the grid's boundary, we continue our walk outside the
    grid (but may return to the grid boundary later.). Eventually, we reach all rows
    * cols spaces of the grid.

    Return an array of coordinates representing the positions of the grid in the order
    you visited them.
     */
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int [][] spiralMatrix = new int[rows*cols][2];
        int horizontal = 1, vertical = 1, hctr = 1, vctr = 1,i=0;
        add(spiralMatrix, i++, rStart, cStart);
        while(i<rows*cols){
            for (int k = 0; k < vctr; k++) {
                cStart+=vertical;
                if(rStart>=0 && rStart<rows && cStart>=0 && cStart < cols)
                    add(spiralMatrix, i++, rStart, cStart);
            }
            //reverse the direction
            vertical*=-1;
            vctr++;
            for (int j = 0; j < hctr; j++) {
                rStart+=horizontal;
                if(rStart>=0 && rStart<rows && cStart>=0 && cStart < cols)
                    add(spiralMatrix, i++, rStart, cStart);
            }
            //reverse the direction
            horizontal*=-1;
            hctr++;

        }
        return spiralMatrix;
    }

    private static void add(int[][] spiralMatrix, int i, int rStart, int cStart) {
        spiralMatrix[i][0] = rStart;
        spiralMatrix[i][1] = cStart;
    }
}
