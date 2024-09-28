package com.java.Arrays.Hard;

import java.util.Deque;
import java.util.LinkedList;

public class MaxValueOfEquation {
    public static void main(String[] args) {
        int [][] points = {{-19,-12},{-13,-18},{-12,18},{-11,-8},{-8,2},{-7,12},{-5,16},{-3,9},{1,-7},{5,-4},{6,-20},{10,4},{16,4},{19,-9},{20,19}};
        int k = 6;
        System.out.println(findMaxValueOfEquation(points,k));
    }
    /*You are given an array points containing the coordinates of points on a 2D plane,
     sorted by the x-values, where points[i] = [xi, yi] such that xi < xj for all
     1 <= i < j <= points.length. You are also given an integer k.

    Return the maximum value of the equation yi + yj + |xi - xj| where |xi - xj| <= k
    and 1 <= i < j <= points.length.

    It is guaranteed that there exists at least one pair of points that satisfy the
    constraint |xi - xj| <= k.
     */
    public static int findMaxValueOfEquation(int[][] points, int k) {
        // Using a Deque to store points as [y - x, x]
        Deque<int[]> deque = new LinkedList<>();
        int maxVal = Integer.MIN_VALUE;
        for (int[] point : points) {
            int x = point[0];
            int y = point[1];

            // Remove points from the deque that are out of the valid range
            while (!deque.isEmpty() && x - deque.peekFirst()[1] > k) {
                deque.pollFirst();
            }

            // If the deque is not empty, calculate the maximum value
            if (!deque.isEmpty()) {
                maxVal = Math.max(maxVal, y + x + deque.peekFirst()[0]);
            }

            // Add the current point to the deque
            // We store (y - x) and x in the deque
            while (!deque.isEmpty() && deque.peekLast()[0] <= y - x) {
                deque.pollLast();
            }
            deque.offerLast(new int[]{y - x, x});
        }
        return maxVal; // Return the final result
    }
}
