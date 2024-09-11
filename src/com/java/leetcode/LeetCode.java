package com.java.leetcode;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode {
    public static void main(String[] args) {

    }

    /* You are given a string number representing a positive integer and a character digit.
        Return the resulting string after removing exactly one occurrence of digit from number
        such that the value of the resulting string in decimal form is maximized.
     */
    public static String removeDigit(String number, char digit) {
        List<Integer> indices = getIndex(number, digit);
        List<String> stringsList = getAllPossibleStrings(indices , number);
        BigInteger max = new BigInteger(stringsList.get(0));
        for (int i=1;i<indices.size();i++){
            BigInteger value = new BigInteger(stringsList.get(i));
            if(value.compareTo(max)>0){
                max = value;
            }
        }
        return max+"";
    }

    private static List<String> getAllPossibleStrings(List<Integer> indices, String number) {
        List<String> stringsList = new LinkedList<>();
        for (Integer index : indices) {
            stringsList.add(number.substring(0, index) + number.substring(index + 1));
        }
        return stringsList;
    }

    public static List<Integer> getIndex(String number, char digit) {
        List<Integer> indices = new LinkedList<>();
        for (int i=0;i<number.length();i++){
            if(number.charAt(i)==digit){
                indices.add(i);
            }
        }
        return indices;
    }


    public static String removeDigitSol(String number, char digit) {
        //This variable stores the length of the string number.
        int n=number.length();
        //This variable will record the index of the digit that meets the criteria for removal.
        int index=0;
        for(int i=0;i<n;i++){
            //Checks if the current character matches the digit to be removed.
            if(number.charAt(i)==digit){
                //Updates index to the current position of the digit.
                index=i;
                //Checks if the current digit is followed by another digit in the string and if the next digit is
                // greater than the current digit. This condition is used to determine if removing this digit would
                // increase the value of the resulting number. If so, it breaks the loop, as this is the digit we want
                // to remove.
                if(i<n-1 && digit<number.charAt(i+1))
                    break;
            }
        }
        return number.substring(0,index)+number.substring(index+1);
    }
}
