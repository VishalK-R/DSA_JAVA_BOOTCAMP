package com.java.Arrays.Medium;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int [] nums = {2,0,2,1,1,0};
//        bubbleSortColors(nums);
//        selectionSortColors(nums);
//        nums = mergeSortColors(nums);
//        sortColorsUsingFrequencyMethod(nums);
        sortColorsUsingPointerApproach(nums);
        System.out.println(Arrays.toString(nums));
    }
    /*Given an array nums with n objects colored red, white, or blue, sort them
    in-place so that objects of the same color are adjacent, with the colors in
    the order red, white, and blue.

    We will use the integers 0, 1, and 2 to represent the color red, white, and blue,
    respectively.

    You must solve this problem without using the library's sort function.
     */
    public static void bubbleSortColors(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-i-1 ; j++) {
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = nums[i];
            for (int j = i+1; j < nums.length ; j++) {
                if(nums[j]<min){
                    int temp = nums[j];
                    nums[j] = min;
                    min = temp;
                }
            }
            nums[i] = min;
        }
    }

    public static int[] mergeSortColors(int[] nums) {
        return sortNums(nums, 0 , nums.length-1);
    }

    private static int[] sortNums(int[] nums, int startPos, int endPos) {
        if (startPos==endPos){
            return new int[]{nums[startPos]};
        }
        int mid = (startPos+endPos)/2;
        int [] sortedAr1 = sortNums(nums, startPos, mid);
        int [] sortedAr2 = sortNums(nums, mid+1, endPos);

        int [] sortedAr = new int [sortedAr1.length+sortedAr2.length];
        int i = 0, j =0, index = 0;
        while(index<sortedAr.length){
            if(i<sortedAr1.length && j<sortedAr2.length){
                if(sortedAr1[i]<sortedAr2[j]){
                    sortedAr[index]=sortedAr1[i];
                    i++;
                }else{
                    sortedAr[index] = sortedAr2[j];
                    j++;
                }
            }else if(i>=sortedAr1.length){
                sortedAr[index] = sortedAr2[j];
                j++;
            }else {
                sortedAr[index] = sortedAr1[i];
                i++;
            }
            index++;
        }
    return sortedAr;
    }

    public static void sortColorsUsingFrequencyMethod(int[] nums) {
        int redCount = 0;
        int whiteCount = 0;
        for (int num : nums) {
            switch (num) {
                case 0:
                    redCount++;
                    break;
                case 1:
                    whiteCount++;
                    break;
                case 2: break;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(redCount!=0){
                nums[j] = 0;
                redCount--;
            } else if (whiteCount!=0) {
                nums[j] = 1;
                whiteCount--;
            } else {
                nums[j] = 2;
            }
        }
    }

    public static void sortColorsUsingPointerApproach (int [] nums) {
        int redPointer = 0, whitePointer = 0, bluePointer = nums.length-1;
        while(whitePointer<=bluePointer){
            if(nums[whitePointer]==0){
                if(nums[whitePointer]!=nums[redPointer]){
                    int temp = nums[whitePointer];
                    nums[whitePointer] = nums[redPointer];
                    nums[redPointer] = temp;
                }
                redPointer++;
                whitePointer++;
            } else if (nums[whitePointer]==1) {
                whitePointer++;
            } else {
                int temp = nums[bluePointer];
                nums[bluePointer] = nums[whitePointer];
                nums[whitePointer] = temp;
                bluePointer--;
            }
        }
    }
}
