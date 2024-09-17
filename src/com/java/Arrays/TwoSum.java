package com.java.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int [] num = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(num, target)));
    }
    /*Given an array of integers nums and an integer target, return indices of the
    two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not
    use the same element twice.

    You can return the answer in any order.
     */
    public static int[] twoSum(int[] num, int target) {
        int[] indices = new int[2];
        HashMap<Integer,Integer> numIndexMap = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            numIndexMap.put(num[i],i);
        }
        for (int i = 0; i < num.length; i++) {
            int key = target-num[i];
            if(numIndexMap.containsKey(key)){
                int value = numIndexMap.get(key);
                if(value!=i){
                    indices[0] = i;
                    indices[1] = value;
                    break;
                }
            }
        }
        return indices;
    }
}
