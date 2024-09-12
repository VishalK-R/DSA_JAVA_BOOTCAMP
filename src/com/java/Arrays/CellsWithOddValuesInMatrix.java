package com.java.Arrays;

public class CellsWithOddValuesInMatrix {

    /*There is an m x n matrix that is initialized to all 0's. There is also a 2D array
    indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform
    some increment operations on the matrix.

    For each location indices[i], do both of the following:
        Increment all the cells on row ri.
        Increment all the cells on column ci.

    Given m, n, and indices, return the number of odd-valued cells in the matrix after
    applying the increment to all locations in indices.
     */
    public int oddCells(int m, int n, int[][] indices) {
        int [][] newMatrix = new int[m][n];
        for(int [] indice : indices){
            int row = indice[0];
            int column = indice[1];
            updateRowOfNewMatrix(newMatrix, row);
            updateColumnOfNewMatrix(newMatrix, column);
        }
        int odd = 0;
        for (int[] countArray : newMatrix) {
            for (int count : countArray) {
                if (count % 2 == 1) {
                    odd++;
                }
            }
        }
        return odd;
    }

    private void updateColumnOfNewMatrix(int[][] newMatrix, int column) {
        for(int [] matrix : newMatrix){
            matrix[column]++;
        }
    }

    private static void updateRowOfNewMatrix(int[][] newMatrix, int row) {
        int [] rowArray = newMatrix[row];
        for (int i = 0; i < rowArray.length; i++) {
            rowArray[i]++;
        }

    }
}
