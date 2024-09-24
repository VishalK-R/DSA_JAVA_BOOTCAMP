package com.java.Arrays.Medium;

public class HouseRobber {
    public static void main(String[] args) {
        int [] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
        System.out.println(robBottomUp(nums));
    }
    /*You are a professional robber planning to rob houses along a street. Each house
    has a certain amount of money stashed, the only constraint stopping you from
    robbing each of them is that adjacent houses have security systems connected and
    it will automatically contact the police if two adjacent houses were broken into
    on the same night.

    Given an integer array nums representing the amount of money of each house, return
    the maximum amount of money you can rob tonight without alerting the police
     */

    public static int rob(int[] nums) {
        int max = 0;
        int i = nums.length-1;
        int [] memoizationAr = new int[nums.length];
        while(i>=0){
            int maxRob = findMaxRob(nums, i, memoizationAr);
            if(max<maxRob){
                max = maxRob;
            }
            i--;
        }

        return max;
    }

    private static int findMaxRob(int[] nums, int i, int[] memoizationAr) {
        if(i>=0&&memoizationAr[i]!=0){
            return memoizationAr[i];
        }
        int result = 0;
        if(i==0||i==1){
            result = nums[i];
            memoizationAr[i] = result;
        }else if(i>1){
            result = Math.max(nums[i]+findMaxRob(nums, i-2, memoizationAr),
                    nums[i]+findMaxRob(nums,i-3, memoizationAr));
            memoizationAr[i] = result;
        }
        return result;
    }

    public static int robBottomUp(int[] nums) {
        int max = 0;
        int [] maxRobAr = new int[nums.length];


        int i = 0;
        while(i< nums.length){
            if(i==0||i==1){
                maxRobAr[i] = nums[i];
            } else if (i==2) {
                maxRobAr[i] = nums[0]+nums[2];
            } else {
                maxRobAr[i] = Math.max(nums[i]+maxRobAr[i-2],nums[i]+maxRobAr[i-3]);
            }
            if(max<maxRobAr[i]){
                max = maxRobAr[i];
            }
            i++;
        }
        return max;
    }
}
