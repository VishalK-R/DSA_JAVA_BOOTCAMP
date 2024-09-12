package com.java.Arrays;

public class FindTheHighestAltitude {

    public static void main(String[] args) {
        int [] gains =  {-5,1,5,0,-7};
        System.out.println(largestAltitude(gains));
    }
    /*  There is a biker going on a road trip. The road trip consists of n + 1 points
        at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

        You are given an integer array gain of length n where gain[i] is the net gain in
        altitude between points i and i + 1 for all (0 <= i < n). Return the highest
        altitude of a point.
     */

    public static int largestAltitude(int[] gains) {
        int actualGain = 0;
        int maxAltitude = 0;
        for(int gain : gains){
            actualGain += gain;
            if(actualGain>maxAltitude){
                maxAltitude = actualGain;
            }
        }
        return maxAltitude;
    }
}
