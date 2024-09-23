package com.java.Arrays.Medium;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        rotate(nums,3);
        rotateBetterApproach(nums,3);
    }

    /*Given an integer array nums, rotate the array to the right by k steps, where
    k is non-negative.
     */
    public static void rotate(int[] nums, int k) {
        int [] rotatedNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int newIndex = ((i+k)% nums.length);
            rotatedNums[newIndex] = nums[i];
        }
        nums = rotatedNums;
        System.out.println(Arrays.toString(nums));
    }

    public static void rotateBetterApproach(int[] nums, int k) {
        k %= nums.length;
        rotateHelper(nums,0, nums.length-1);
        System.out.println(Arrays.toString(nums));
        rotateHelper(nums,0,k-1);
        System.out.println(Arrays.toString(nums));
        rotateHelper(nums,k,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotateHelper(int[]nums, int startPos, int endPos){
        while(startPos<endPos){
            int temp = nums[startPos];
            nums[startPos] = nums[endPos];
            nums[endPos] = temp;
            startPos++;
            endPos--;
        }
    }
}
