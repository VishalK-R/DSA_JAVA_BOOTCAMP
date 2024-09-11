package com.java.Arrays;

import java.util.Arrays;

public class ConcatenationOfArray {

    public static void main(String[] args) {
        int [] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
        System.out.println(Arrays.toString(getConcatenationBetterCode(nums)));
    }
    /* Given an integer array nums of length n, you want to create an array ans of
        length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n
        (0-indexed).
        Specifically, ans is the concatenation of two nums arrays.
        Return the array ans.
     */
    public static int[] getConcatenation(int[] nums) {
        int[] newNums = new int[nums.length*2];
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            newNums[i] = nums[i];
            newNums[i+size]=nums[i];
        }
        return newNums;
    }

    public static int[] getConcatenationBetterCode(int[] nums) {
        int[] newNums = new int[nums.length*2];
        int size = nums.length;
        System.arraycopy(nums,0,newNums,0,size);
        System.arraycopy(nums,0,newNums,size,size);
        return newNums;
    }
}
