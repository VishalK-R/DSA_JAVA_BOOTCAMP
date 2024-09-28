package com.java.Arrays.Hard;

public class FirstMissingPositive {


    public static void main(String[] args) {
        int [] nums = {1};
        System.out.println(firstMissingPositive(nums));
    }
    /*Given an unsorted integer array nums. Return the smallest positive integer that
    is not present in nums.

    You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary
    space.
     */
    public static int firstMissingPositive(int[] nums) {

        int index = 0;
        int arLength = nums.length;

        while(index<arLength){
            int correctPosi= nums[index]-1;

            if(nums[index] >0 && nums[index]<= arLength && nums[index] !=
                    nums[correctPosi]){
                int temp= nums[index];     //swap
                nums[index]= nums[correctPosi];
                nums[correctPosi]= temp;
            }else {
                index++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i+1){
                return i+1;
            }
        }

        return arLength+1;
    }
}
