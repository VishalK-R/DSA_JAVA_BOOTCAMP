package com.java.Arrays;

import java.util.Arrays;

public class FindNUniqueIntegersSumUpToZero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(9)));
    }
    /*Given an integer n, return any array containing n unique integers such that they
    add up to 0.
     */
    public static int[] sumZero(int n) {
        int[] uniqueNumArray = new int[n];
        int num = -(n/2);
        for (int i = 0; i < uniqueNumArray.length; i++) {
            if ((i==(n/2))&&(n%2==0)){
                num++;
            }
            uniqueNumArray[i]=num;
            num++;
        }

        return uniqueNumArray;
    }
}
