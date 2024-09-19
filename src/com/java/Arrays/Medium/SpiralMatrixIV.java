package com.java.Arrays.Medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SpiralMatrixIV {
    public static void main(String[] args) {
        int m = 3, n = 5;
        int [] head = {3,0,2,6,8,1,7,9,4,2,5,5,0};
        System.out.println(Arrays.deepToString(spiralMatrix(m,n,head)));
        LinkedList<Integer> headList= new LinkedList<>();
        for(int num: head){
            headList.add(num);
        }
        System.out.println(Arrays.deepToString(spiralMatrixBetter(m,n,headList)));
    }
    /*You are given two integers m and n, which represent the dimensions of a matrix.

    You are also given the head of a linked list of integers.

    Generate an m x n matrix that contains the integers in the linked list presented
    in spiral order (clockwise), starting from the top-left of the matrix. If there
    are remaining empty spaces, fill them with -1.

    Return the generated matrix.
     */
    public static int[][] spiralMatrix(int m, int n, int[] head) {
        int [][] spiralMat = new int[m][n];
        int rowCtr = 0,colCtr = 0,rowDirection = 0, colDirection = 1, i = 0;
        for (int[] mat : spiralMat) {
            Arrays.fill(mat, -1);
        }
        while(i<m*n){
            if(i<head.length){
                spiralMat[rowCtr][colCtr] = head[i];
            }else{
                spiralMat[rowCtr][colCtr] = -1;
            }
            //changeDirection
            if (rowCtr+rowDirection<0||rowCtr+rowDirection==m||
                    colCtr+colDirection<0||colCtr+colDirection==n||
                    spiralMat[rowCtr+rowDirection][colCtr+colDirection]!=-1){
                int temp = rowDirection;
                rowDirection = colDirection;
                colDirection = -temp;
            }
            i++;
            rowCtr+=rowDirection;
            colCtr+=colDirection;
        }


        return spiralMat;
    }

    public static int[][] spiralMatrixBetter(int m, int n, LinkedList<Integer> head) {
        int[][] spiralMatrix = new int[m][n];
        for(int [] mat: spiralMatrix){
            Arrays.fill(mat,-1);
        }

        int topRow = 0, bottomRow = m-1, leftCol = 0, rightCol = n-1, i =0;
        while(i<head.size()){
            for (int col = leftCol; col <= rightCol && i<head.size(); col++) {
                spiralMatrix[topRow][col] = head.get(i);
                i++;
            }
            topRow++;
            for (int row = topRow; row <= bottomRow && i<head.size(); row++ ){
                spiralMatrix[row][rightCol] = head.get(i);
                i++;
            }
            rightCol--;

            for (int col = rightCol; col >= leftCol && i<head.size(); col--) {
                spiralMatrix[bottomRow][col] = head.get(i);
                i++;
            }
            bottomRow--;

            for (int row = bottomRow; row >= topRow && i<head.size(); row--) {
                spiralMatrix[row][leftCol] = head.get(i);
                i++;
            }
            leftCol++;
        }

        return spiralMatrix;
    }

}
