package com.java.Arrays;

import java.util.LinkedList;
import java.util.List;

public class LuckyNumbersInAMatrix {

    public static void main(String[] args) {
        int [][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(matrix));
    }
    /*Given an m x n matrix of distinct numbers, return all lucky numbers in the
    matrix in any order.

    A lucky number is an element of the matrix such that it is the minimum element
    in its row and maximum in its column.
     */
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> luckyNumsList = new LinkedList<>();
        for (int i =0; i < matrix.length;i++){
            int column = getMinColumnIndex(matrix[i]);
            boolean luckyNumberFlag = checkIfMaxInColumn(matrix, i, column);
            if (luckyNumberFlag) luckyNumsList.add(matrix[i][column]);
        }
        return luckyNumsList;
    }

    private static boolean checkIfMaxInColumn(int[][] matrix, int row, int column) {
        int max = matrix[row][column];
        for (int i = 0; i < matrix.length; i++) {
            if(i!=row && matrix[i][column]>max) return false;
        }
        return true;
    }

    private static int getMinColumnIndex(int[] nums) {
        int min = nums[0];
        int index = 0;
        for (int i = 1; i < nums.length; i++){
            if(nums[i]<min){
                min = nums[i];
                index = i;
            }
        }
        return index;
    }
}
