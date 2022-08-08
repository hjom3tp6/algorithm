package com.algorithm.array;

public class Leetcode_80 {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            if (j < 2 || nums[i] != nums[j -2]) {
                nums[j++] = nums[i];
            }
            i++;
        }
        return j;
    }
}
