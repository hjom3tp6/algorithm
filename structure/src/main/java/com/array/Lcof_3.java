package com.array;

/**
 * https://github.com/doocs/leetcode/blob/v0.1.8/lcof/%E9%9D%A2%E8%AF%95%E9%A2%9803.%20%E6%95%B0%E7%BB%84%E4%B8%AD%E9%87%8D%E5%A4%8D%E7%9A%84%E6%95%B0%E5%AD%97/README.md
 */
public class Lcof_3 {

    public int findRepeatNumber(int[] nums) {
        for (int i  = 0; i < nums.length ; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) return nums[i];
                int temp = nums[i];
                nums[i] = nums[nums[i]];
                nums[nums[i]] = temp;
            }
        }
        return -1;
    }
    
}
