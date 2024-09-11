package com.java.Arrays;

import java.util.Arrays;

public class ShuffleTheArray {

    public static void main(String[] args) {
        int [] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }

    /*Given the array nums consisting of 2n elements in the form
        [x1,x2,...,xn,y1,y2,...,yn].
      Return the array in the form [x1,y1,x2,y2,...,xn,yn].
     */
    public static int[] shuffle(int[] nums, int n) {
        int[] shuffledArray = new int[nums.length];
        for(int i =0 ; i<nums.length/2; i++){
            shuffledArray[2*i] = nums[i];
            shuffledArray[2*i+1]= nums[n+i];
        }
        return shuffledArray;
    }
}
