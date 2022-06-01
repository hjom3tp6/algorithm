package com.array;

/**
 * 
 * https://leetcode.com/problems/product-of-array-except-self/submissions/
 * 
 */

public class Leetcode_223 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left = 1;
        for(int i = 0; i < n; i++) {
            res[i] = left;
            left *= nums[i];
        }
        int right = 1;
        for(int i = n - 1; i >= 0; i--){
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
}
