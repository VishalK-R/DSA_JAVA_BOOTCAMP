package com.java.Arrays;

import java.util.Arrays;

public class RunningSumOf1DArray {

    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }


    /* Given an array nums. We define a running sum of an array as runningSum[i] =
        sum(nums[0]…nums[i]).
        Return the running sum of nums.
     */
    public static int[] runningSum(int[] nums) {
        int[] runningSumAr = new int[nums.length];
        int runningSum = 0;
        updateRunningSumArray(runningSumAr,0,nums, runningSum);

        return runningSumAr;
    }

    private static void updateRunningSumArray(int[] runningSumAr, int startIndex, int[] nums, int runningSum) {
        if(startIndex>nums.length-1) return;
        runningSum += nums[startIndex];
        updateRunningSumArray(runningSumAr,startIndex+1,nums, runningSum);
        runningSumAr[startIndex] = runningSum;

    }


}
