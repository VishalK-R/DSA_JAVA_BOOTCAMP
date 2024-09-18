package com.java.Arrays.Medium;

import java.util.LinkedList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
    /*Given an m x n matrix, return all elements of the matrix in spiral order.
     */
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralElementsList = new LinkedList<>();
        int row = 0;
        int col = 0;
        int rowDirection = 0;
        int colDirection = 1;
        int numOfRows = matrix.length;
        int numOfColumn = matrix[0].length;
        for (int i = 0; i < numOfRows*numOfColumn; i++) {
            spiralElementsList.add(matrix[row][col]);
            matrix[row][col] = -101;
            if ((0>row+rowDirection || row+rowDirection==numOfRows) || (0>col+
                    colDirection || col+colDirection==numOfColumn) ||
                    (matrix[row+rowDirection][col+colDirection] == -101)){
                int temp = colDirection;
                colDirection = -rowDirection;
                rowDirection = temp;
            }

            row+=rowDirection;
            col+=colDirection;
        }

        return spiralElementsList;
    }
}
