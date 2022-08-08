package com.algorithm.array;

/**
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public class Leetcode_977 {
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1;
        int[] res = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[i] = nums[left] * nums[left];
                left++;
            } else {
                res[i] =  nums[right] * nums[right];
                right--;
            }
            
        }
        return res;
    }
}

/**
 * use two pointer
 * pay attention to whether the requirement is increasing or decreasing
 */