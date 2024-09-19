package com.java.Arrays.Medium;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int [] nums = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    /*Given an integer array nums, return an array answer such that answer[i] is equal
     to the product of all the elements of nums except nums[i].

    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit
    integer.

    You must write an algorithm that runs in O(n) time and without using the division
    operation.
     */

    public static int[] productExceptSelf(int[] nums) {
        int[] preProdAr = new int[nums.length];
        int[] sufProdAr = new int[nums.length];
        preProdAr[0] = 1;
        sufProdAr[sufProdAr.length-1] = 1;
        for (int i = 1; i < preProdAr.length; i++) {
            preProdAr[i]= nums[i-1]*preProdAr[i-1];
        }

        for (int j = sufProdAr.length-2; j >= 0 ; j--) {
            sufProdAr[j]=nums[j+1]*sufProdAr[j+1];
        }
        for (int k = 0; k < nums.length; k++) {
            nums[k] = preProdAr[k]*sufProdAr[k];
        }
        return nums;
    }
}
