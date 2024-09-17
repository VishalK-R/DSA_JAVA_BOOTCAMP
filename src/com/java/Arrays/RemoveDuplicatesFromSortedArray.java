package com.java.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int [] num = {1,1,2};
        System.out.println(removeDuplicates(num));
    }
    public static int removeDuplicates(int[] nums) {
        int uniqueNumCount = 0;
        int i = 1;
        while(i<nums.length){
            if(nums[i]!=nums[uniqueNumCount]){
                uniqueNumCount++;
                nums[uniqueNumCount]=nums[i];
            }
            i++;
        }
        System.out.println(Arrays.toString(nums));
        return  uniqueNumCount+1;
    }
}
