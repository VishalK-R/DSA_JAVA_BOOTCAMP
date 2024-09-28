package com.java.Arrays.Hard;

public class GoodArray {
    public static void main(String[] args) {
        int [] nums = {5};
        System.out.println(isGoodArray(nums));
    }
    /*Given an array nums of positive integers. Your task is to select some subset
    of nums, multiply each element by an integer and add all these numbers. The array
    is said to be good if you can obtain a sum of 1 from the array by any possible
    subset and multiplicand.

    Return True if the array is good otherwise return False.
     */

    public static boolean isGoodArray(int[] nums) {
        int gcd = nums[0];
        for(int num : nums){
            gcd = getGCD(gcd, num);
            if (gcd == 1) return true;
        }
        return false;
    }

    private static int getGCD(int gcd, int num) {
        while(num!=0){
            int temp = num;
            num = gcd%num;
            gcd = temp;
        }
        return gcd;
    }


}
