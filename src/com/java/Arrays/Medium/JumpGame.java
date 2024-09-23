package com.java.Arrays.Medium;

public class JumpGame {
    public static void main(String[] args) {
        int [] nums = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }
    /*You are given an integer array nums. You are initially positioned at the array's
    first index, and each element in the array represents your maximum jump length at
    that position.

    Return true if you can reach the last index, or false otherwise.
     */
    public static boolean canJump(int[] nums) {
        int goal = nums.length-1;
        if(goal==0) return true;
        int i = 0;
        int max= nums[0];
        for(int num : nums){
            if(i>max) return false;
            if(i+num>=goal) return true;
            if(max<num+i){
                max = num+i;
            }
            i++;
        }
        return false;
    }
}
