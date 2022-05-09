package com.array;

public class Leetcode_189 {
    /**
     * https://leetcode.com/problems/rotate-array/
     */

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

    }

    public static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public void rotate_1(int[] nums, int k) {
        int[] temp = new int[nums.length];
        int addNum = (nums.length - k % nums.length);
        for (int i = 0; i < nums.length; i++) {
            int j = (i + addNum) % nums.length;
            temp[i] = nums[j];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }

}