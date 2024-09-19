package com.java.Arrays.Medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SetMatrixZeros {
    public static void main(String[] args) {
        int [][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
    }
    /*Given an m x n integer matrix matrix, if an element is 0, set its entire row and
    column to 0's.

    You must do it in place.
     */
    public static void setZeroes(int[][] matrix) {
        List<int[]> zerosVertices = new LinkedList<>();
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;
        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                if(matrix[i][j]==0){
                    int [] verticesArray = {i,j};
                    zerosVertices.add(verticesArray);
                }
            }
        }

        for (int [] vertices : zerosVertices){
            int row = vertices[0];
            int col = vertices[1];
            for (int k = 0; k < totalCols; k++) {
                matrix[row][k] = 0;
            }
            for (int l = 0; l < totalRows; l++) {
                matrix[l][col] = 0;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
