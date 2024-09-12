package com.java.Arrays;

import java.util.Arrays;

public class SmallerThanTheCurrentNumber {

    public static void main(String[] args) {
        int [] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
        System.out.println(Arrays.toString(bucketArrayApproach(nums)));
    }


    /*Given the array nums, for each nums[i] find out how many numbers in the array are
        smaller than it. That is, for each nums[i] you have to count the number of valid
        j's such that j != i and nums[j] < nums[i].
        Return the answer in an array.
     */
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] countSmallerNumbers = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for (int num : nums) {
                if (nums[i] > num) {
                    count++;
                }
            }
            countSmallerNumbers[i]=count;
        }
        return countSmallerNumbers;
    }

    public static int[] bucketArrayApproach(int[] nums) {
        int[] countOfAllNumbers = new int[101];
        //count the instance of all numbers
        for (int num : nums) {
            countOfAllNumbers[num]++;
        }

        //get the cumulative count (previous count + present count)
        for (int i = 1; i < countOfAllNumbers.length; i++) {
            countOfAllNumbers[i]+=countOfAllNumbers[i-1];
        }

        //construct the array
        for (int j = 0; j < nums.length; j++) {
            int a=nums[j];
            nums[j] = countOfAllNumbers[a-1];
        }
        return nums;
    }
}
