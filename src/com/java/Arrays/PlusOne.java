package com.java.Arrays;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;

public class PlusOne {

    public static void main(String[] args) {
        int [] digits = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(digits)));
        System.out.println(Arrays.toString(plusOneBigInteger(digits)));
        System.out.println(Arrays.toString(plusOneBetter(digits)));
    }
    /*You are given a large integer represented as an integer array digits, where
    each digits[i] is the ith digit of the integer. The digits are ordered from most
    significant to least significant in left-to-right order. The large integer does
    not contain any leading 0's.

    Increment the large integer by one and return the resulting array of digits.
     */
    public static int[] plusOne(int[] digits) {
        String collectedNum = Arrays.stream(digits)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(""));

        long newNum = Long.parseLong(collectedNum) + 1;
        digits = Long.toString(newNum)
                .chars()  // Stream of int representing each char
                .map(c -> c - '0')  // Convert char to int
                .toArray();

        return digits;
    }

    public static int[] plusOneBigInteger(int[] digits) {
        String collectedNum = Arrays.stream(digits)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(""));
        BigInteger num = new BigInteger(collectedNum).add(BigInteger.valueOf(1));
        digits = num.toString()
                .chars()  // Stream of int representing each char
                .map(c -> c - '0')  // Convert char to int
                .toArray();
        return digits;
    }

    public static int[] plusOneBetter(int[] digits) {
        int flag = 1;
        for(int digit:digits){
            if (digit!=9){
                flag = 0;
                break;
            }
        }

        int [] plusOneArray = new int[digits.length+flag];
        int index = plusOneArray.length - 1 ;
        int carry = 1;
        while (index >= 0){
            int digit = 0;
            if(index != 0 || flag != 1  ){
                digit = digits[index - flag];
            }
            if(digit==9&&carry==1){
                plusOneArray[index] = 0;
            }else {
                plusOneArray[index] = digit+carry;
                carry = 0;
            }
            index--;
        }
        return plusOneArray;
    }
}
