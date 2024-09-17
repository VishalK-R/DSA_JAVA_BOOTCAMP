package com.java.Arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int [] nums = {8,-19,5,-4,20};
        System.out.println(maxSubArray(nums));
        System.out.println(maxSubArrayBetter(nums));
    }
    /*Given an integer array nums, find the subarray with the largest sum, and
    return its sum.
     */
    public static int maxSubArray(int[] nums) {
        int consecutiveSum = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(i==1){
                if (consecutiveSum>0){
                    consecutiveSum+=nums[i];
                }else {
                    consecutiveSum = nums[i];
                }
            }else if((consecutiveSum<0) && (nums[i]>consecutiveSum)){
                consecutiveSum = nums[i];
            }else {
                consecutiveSum+=nums[i];
            }
            if(consecutiveSum>max){
                max = consecutiveSum;
            }
        }
        return max;
    }

    public static int maxSubArrayBetter(int[] nums) {
        int currentSum = 0;
        int max = nums[0];
        for (int num : nums) {
            currentSum += num;
            if (currentSum > max) {
                max = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return max;
    }
}
