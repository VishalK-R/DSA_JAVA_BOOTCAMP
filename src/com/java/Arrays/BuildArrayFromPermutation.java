package com.java.Arrays;

import java.util.Arrays;

public class BuildArrayFromPermutation {

    public static void main(String[] args) {
        int []nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
        System.out.println(Arrays.toString(buildArrayBetter(nums)));
    }

    /*build an array from a zero-based permutation, capturing the mathematical
        operation where each element at index i in the new array ans is assigned the value
        from the original array at the index defined by the value at nums[i]

     */
    public static int[] buildArray(int[] nums) {
        //It creates a new integer array newNums with the same length as the input array nums.
        //This array will hold the final result.
        int[] newNums = new int[nums.length];
        for(int num : nums){
            newNums[num] = nums[nums[num]];
        }
        return newNums;
    }

    public static int[] buildArrayBetter(int[] nums) {
        int[] newNums = new int[nums.length];
        build(nums, 0, newNums);
        return newNums;
    }

    private static void build(int[] nums, int startIndex, int[] newNums) {
        if(startIndex>newNums.length-1) return;
        build(nums,startIndex+1,newNums);
        newNums[startIndex]=nums[nums[startIndex]];
    }

}
