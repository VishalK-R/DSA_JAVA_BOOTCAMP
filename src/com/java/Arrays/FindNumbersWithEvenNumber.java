package com.java.Arrays;

public class FindNumbersWithEvenNumber {
    public static void main(String[] args) {
        int [] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }

    /*  Given an array nums of integers, return how many of them contain an even
        number of digits.
     */
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if((num+"").trim().length()%2==0){
                count++;
            }
        }
        return count;
    }


    public static int findNumbersBetter(int[] nums) {
        int count = 0;

        for (int num : nums) {
            //The expression Math.log10(num) computes the base-10 logarithm of num, which effectively
            // gives us one less than the number of digits in num.
            if ((int) Math.log10(num) % 2 == 1) {
                count++;
            }
        }
        return count;
    }
}
