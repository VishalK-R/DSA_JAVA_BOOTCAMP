package com.java.Arrays;

import java.util.Arrays;

public class ReshapeTheMatrix {

    public static void main(String[] args) {
        int [][] mat = {{1,2},{3,4}};
        int r = 4;
        int c = 1;
        System.out.println(Arrays.deepToString(matrixReshape(mat, r, c)));
        System.out.println(Arrays.deepToString(matrixReshapeBetter(mat, r, c)));
    }
    /*In MATLAB, there is a handy function called reshape which can reshape an
    m x n matrix into a new one with a different size r x c keeping its original data.

    You are given an m x n matrix mat and two integers r and c representing the number
    of rows and the number of columns of the wanted reshaped matrix.

    The reshaped matrix should be filled with all the elements of the original matrix
    in the same row-traversing order as they were.

    If the reshape operation with given parameters is possible and legal, output the
    new reshaped matrix; Otherwise, output the original matrix.
     */

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length!=r*c) return mat;
        int [][] reshapedMatrix = new int[r][c];
        int outRow = 0;
        int outCol = 0;
        for (int[] numAr : mat) {
            for (int num : numAr) {
                reshapedMatrix[outRow][outCol] = num;
                outCol++;
                if (outCol == c) {
                    outRow++;
                    outCol = 0;
                }
            }
        }
        return reshapedMatrix;
    }

    public static int[][] matrixReshapeBetter(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length!=r*c) return mat;
        int [][] reshapedMatrix = new int[r][c];
        int cols = mat[0].length;
        for(int i = 0; i<r*c ; i++){
            reshapedMatrix[i/c][i%c] = mat[i/cols][i%cols];
        }
        return reshapedMatrix;
    }
}
