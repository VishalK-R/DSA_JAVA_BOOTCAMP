package com.java.Arrays.Medium;

public class JumpGameII {
    public static void main(String[] args) {
        int [] nums = {2,3,1,1,4};
        System.out.println(jump(nums));
    }
    /*You are given a 0-indexed array of integers nums of length n. You are initially
    positioned at nums[0].

    Each element nums[i] represents the maximum length of a forward jump from index i.
    In other words, if you are at nums[i], you can jump to any nums[i + j] where:

    0 <= j <= nums[i] and
    i + j < n
    Return the minimum number of jumps to reach nums[n - 1]. The test cases are
    generated such that you can reach nums[n - 1].
     */

    public static int jump(int[] nums) {
        int jumps = 0, currentEnd = 0, farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }
}
