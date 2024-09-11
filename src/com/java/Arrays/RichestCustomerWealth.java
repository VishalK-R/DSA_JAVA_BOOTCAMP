package com.java.Arrays;

public class RichestCustomerWealth {

    public static void main(String[] args) {
        int [][] accounts ={{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }

    /*You are given an m x n integer grid accounts where accounts[i][j] is the amount
        of money the ith customer has in the jth bank. Return the wealth that the richest
        customer has.
       A customer's wealth is the amount of money they have in all their bank accounts.
        The richest customer is the customer that has the maximum wealth.
     */
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        maxWealth = calculateMaxWealth(maxWealth, accounts , accounts.length-1);
        return maxWealth;
    }

    private static int calculateMaxWealth(int maxWealth, int[][] accounts, int lastIndex) {
        if(lastIndex<0) return maxWealth;
        int [] wealthArray = accounts[lastIndex];
        int wealth = 0;
        for (int wealthValue : wealthArray){
            wealth+=wealthValue;
        }
        if(wealth>maxWealth){
            maxWealth = wealth;
        }
        return calculateMaxWealth(maxWealth, accounts, lastIndex-1);
    }

}
