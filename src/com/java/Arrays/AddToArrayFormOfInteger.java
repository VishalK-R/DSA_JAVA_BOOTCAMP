package com.java.Arrays;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AddToArrayFormOfInteger {

    public static void main(String[] args) {
        int [] num = {1,2,0,0};
        int k = 34;
        System.out.println(addToArrayForm(num,k));
        System.out.println(addToArrayFormBetterForm(num,k));
    }
    /*The array-form of an integer num is an array representing its digits in left
    to right order.

    For example, for num = 1321, the array form is [1,3,2,1].
    Given num, the array-form of an integer, and an integer k, return the array-form
    of the integer num + k.
     */
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int sum = 0;
        char [] numArray = (k+"").toCharArray();
        int i = num.length-1;
        int j = numArray.length-1;
        int index = 0 , size = Math.max(num.length, numArray.length);
        List<Integer> arrayFormList = new ArrayList<>();
        // sum and add last digit to list
        while(index<size){
            if (i >= 0) {
                sum+=num[i];
                i--;
            }
            if (j >= 0) {
                sum += Character.getNumericValue(numArray[j]);
                j--;
            }
            arrayFormList.add(sum%10);
            sum/=10;
            index++;
        }
        // add carry over if present
        if (sum > 0) arrayFormList.add(sum);
        //reverse the collection
        Collections.reverse(arrayFormList);
        return  arrayFormList;
    }

    public static List<Integer> addToArrayFormBetterForm(int[] num, int k) {
        int i = num.length-1;
        int carry = 0;
        List<Integer> arrayFormList = new ArrayList<>();
        while(i>=0 || k>0 || carry!=0){
            int sum = carry;
            if(i>=0){
                sum+=num[i--];
            }
            if(k>0){
                sum+=(k%10);
                k/=10;
            }
            carry = sum/10;
            arrayFormList.add(sum%10);
        }
        Collections.reverse(arrayFormList);
        return arrayFormList;
    }
}
