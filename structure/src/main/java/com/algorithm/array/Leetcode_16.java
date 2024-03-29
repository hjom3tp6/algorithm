package com.algorithm.array;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/3sum-closest/
 */
public class Leetcode_16 {
    public int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length && diff != 0; i++) { // diff != 0
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - sum) < Math.abs(diff)) {
                    diff = target - sum;
                }
                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return target - diff;
    }
}

/*
 * diff = target - sum
 * target - diff = sum
 */
