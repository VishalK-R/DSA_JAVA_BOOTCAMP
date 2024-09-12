package com.java.Arrays;

import java.util.HashMap;

public class NumberOfGoodPairs {

    public static void main(String[] args) {
        int [] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }

    /*  Given an array of integers nums, return the number of good pairs.
        A pair (i, j) is called good if nums[i] == nums[j] and i < j.
     */

    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> numsCount = new HashMap<>();
        for (int key : nums) {
            int value = numsCount.getOrDefault(key, 0);
            numsCount.put(key, value + 1);
        }

        int sum = 0;
        for (int num : nums){
            int n = numsCount.get(num);
            if(n>1){
                sum+=((n*(n-1))/2);
                numsCount.put(num , 1);
            }
        }
        return sum;
    }
}
