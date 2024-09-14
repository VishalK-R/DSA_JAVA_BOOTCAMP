package com.java.Arrays;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(matrix));
    }
    /*  Given a square matrix mat, return the sum of the matrix diagonals.
        Only include the sum of all the elements on the primary diagonal and all the
        elements on the secondary diagonal that are not part of the primary diagonal.
     */
    public static int diagonalSum(int[][] mat) {
        int sum =0;
        int i = 0;
        int j = mat.length-1;
        while(i<mat.length && j>=0){
            if(i==j) {
                sum += mat[i][j];
            }else {
                sum += mat[i][i] + mat[i][j];
            }
            i++;
            j--;
        }
        return sum;
    }
}
