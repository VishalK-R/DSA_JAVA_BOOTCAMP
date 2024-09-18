package com.java.Arrays.Medium;

import java.util.Arrays;
import java.util.HashSet;

public class SpiralMatrixII {

    public static void main(String[] args) {
        int n = 1;
        System.out.println(Arrays.deepToString(generateMatrix(n)));
    }
    /*Given a positive integer n, generate an n x n matrix filled with elements from
    1 to n2 in spiral order.
     */
    public static int[][] generateMatrix(int n) {
        int [][] generatedMatrix = new int[n][n];
        int row = 0;
        int col = 0;
        int rowDirection = 0;
        int colDirection = 1;
        for (int i = 1; i <= n*n; i++) {
            generatedMatrix[row][col] = i;

            if((row+rowDirection<0 || row+rowDirection>=n) ||
                    (col+colDirection<0 || col+colDirection>=n) ||
                    (generatedMatrix[row+rowDirection][col+colDirection]!=0)){
                int temp = colDirection;
                colDirection = -rowDirection;
                rowDirection = temp;
            }
            row+=rowDirection;
            col+=colDirection;
        }
       return generatedMatrix;
    }
}
