package com.java.Arrays;

import java.util.Arrays;

public class TransposeMatrix {

    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(transpose(matrix)));
    }
    /*Given a 2D integer array matrix, return the transpose of matrix.

        The transpose of a matrix is the matrix flipped over its main diagonal, switching
        the matrix's row and column indices.
     */
    public static int[][] transpose(int[][] matrix) {
        // get the number of rows and column for the given input;
        int row_size = matrix.length;
        int column_size = matrix[0].length;

        // create new transpose matrix with row size = column_size of input
        // and column size =  row_size of input
        int [][] transpose = new int[column_size][row_size];
        //input row elements of input matrix into column elements for transpose
        for (int i = 0; i < row_size; i++) {
            for (int j = 0; j < column_size; j++) {
                transpose[j][i] = matrix [i][j];
            }

        }

        return transpose;
    }
}
