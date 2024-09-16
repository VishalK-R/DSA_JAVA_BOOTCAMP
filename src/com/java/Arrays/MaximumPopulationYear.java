package com.java.Arrays;

public class MaximumPopulationYear {

    public static void main(String[] args) {
        int [][] logs = {{2008,2026},{2004,2008},{2034,2035},{1999,2050},{2049,2050},
                {2011,2035},{1966,2033},{2044,2049}};
        System.out.println(maximumPopulation(logs));
    }
    /*You are given a 2D integer array logs where each logs[i] = [birthi, deathi]
    indicates the birth and death years of the ith person.

    The population of some year x is the number of people alive during that year.
    The ith person is counted in year x's population if x is in the inclusive range
    [birthi, deathi - 1]. Note that the person is not counted in the year that they
    die.

     Return the earliest year with the maximum population.
     */
    public static int maximumPopulation(int[][] logs) {
        int [] bucketArray = new int[101];
        for (int[] log : logs) {
            bucketArray[log[0] - 1950] += 1;
            bucketArray[log[1] - 1950] -= 1;
        }
        int max = bucketArray[0];
        for(int j = 1; j<bucketArray.length;j++) {
            int sum = bucketArray[j]+bucketArray[j-1];
            if(sum>max){
                max = sum;
            }
            bucketArray[j] = sum;
        }
        for (int k = 0; k < bucketArray.length; k++) {
            if(bucketArray[k]==max){
                return k+1950;
            }
        }
        return 0;
    }
}
