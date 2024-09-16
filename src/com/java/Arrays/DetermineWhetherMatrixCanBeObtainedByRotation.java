package com.java.Arrays;

import java.util.Arrays;

public class DetermineWhetherMatrixCanBeObtainedByRotation {

    public static void main(String[] args) {
        int[][] mat = {{1,1},{0,1}};
        int[][] target = {{1,1},{1,0}};
        //  1 0 1      1 1 0
        //  1 1 1      0 1 1
        //  1 0 0      0 0 0
        System.out.println(findRotation(mat, target));
    }
    /*Given two n x n binary matrices mat and target, return true if it is possible
    to make mat equal to target by rotating mat in 90-degree increments, or false
    otherwise.
     */
    public static boolean findRotation(int[][] mat, int[][] target) {
        if((mat.length!=target.length)||(mat[0].length!=target[0].length))
            return false;
        int size = mat.length;
        if(size==1){
            return mat[0][0] == target[0][0];
        }
        int rotations = 1;
        while(rotations<=4){
            mat = returnRotatedArray(mat, size);
            if(Arrays.deepEquals(mat, target)) return true;
            rotations++;
        }

        return false;

    }

    public static int[][] returnRotatedArray (int [][] mat, int size){
        int[][] rotatedArray = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rotatedArray[j][size-1-i] = mat[i][j];
            }
        }
        return rotatedArray;
    }

}
