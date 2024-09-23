package com.java.Arrays.Medium;

import java.util.Arrays;

public class FindFirstAndLastPositionOfAnElementInAnArray {

    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10};
        int target = 6;
        System.out.println(Arrays.toString(searchRange(nums,target)));
        System.out.println(Arrays.toString(searchRangeBetterApproach(nums,target)));
    }
    /*Given an array of integers nums sorted in non-decreasing order, find the starting
    and ending position of a given target value.

    If target is not found in the array, return [-1, -1].

    You must write an algorithm with O(log n) runtime complexity.
     */
    public static int[] searchRange(int[] nums, int target) {
        int[] indices = new int[2];
        indices[0]=-1;
        indices[1]=-1;
        boolean firstElementFound = false;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target&&!firstElementFound){
                indices[0]=i;
                firstElementFound = true;
            }else if (nums[i]==target&&i!= nums.length-1&&nums[i+1]!=target){
                indices[1]=i;
                break;
            }else if (nums[i]==target&&i== nums.length-1){
                indices[1]=i;
            }
        }

        if (firstElementFound&&indices[1]==-1) indices[1]=indices[0];

        return indices;
    }

    public static int[] searchRangeBetterApproach(int[] nums, int target) {
        int[] indices = new int[2];
        int mid = 0, start = 0, end = nums.length-1;
        while(start<=end){
            mid = (start+end)/2;
            if(nums[mid]==target){
                indices[0] = getStartIndex(nums, target, start, mid);
                indices[1] = getLastIndex(nums, target,mid , nums.length-1);
                return indices;
            }else if(nums[mid]<target){
                start = mid+1;
            }else if(nums[mid]>target){
                end = mid-1;
            }
        }

        indices[0]=-1;
        indices[1]=-1;
        return indices;
    }

    private static int getLastIndex(int[] nums, int target, int startPos, int endPos) {
        int mid = 0;
        while(startPos<=endPos){
            mid = ((startPos+endPos)/2);
            if((startPos+endPos)%2==1) mid++;
            if(nums[mid]==target){
                if(startPos==endPos){
                    return mid;
                }
                startPos = mid;
            }else if (nums[mid]>target) {
                endPos = mid-1;
            }
        }
        return mid;

    }

    private static int getStartIndex(int[] nums, int target, int startPos, int endPos) {
        int mid = 0;
        while(startPos<=endPos){
            mid = (startPos+endPos)/2;
            if(nums[mid]==target){
                if(startPos==endPos){
                    return mid;
                }
                endPos = mid;
            }else if(nums[mid]<target){
                startPos = mid+1;
            }
        }
        return mid;
    }
}
