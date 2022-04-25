package com.algorithm.binarySearch;

import java.util.Arrays;

public class LeetCode_34 {

  /**
   * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
   * 
   * @param args
   */
  public static void main(String[] args) {
    int[] nums = { 5, 7, 7, 8, 8, 10 };
    int target = 6;
    int[] numsRes = searchRange(nums, target);
    System.out.println(Arrays.toString(numsRes)); // [3,4]
  }

  private static int[] searchRange(int[] nums, int target) {
    if (nums.length == 0) {
      return new int[] { -1, -1 };
    }
    int left = 0, right = nums.length - 1;
    while (left < right) {
      int mid = (left + right) / 2;
      if (target <= nums[mid]) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }

    if (target != nums[left]) {
      return new int[] { -1, -1 };
    }

    int l = left;
    right = nums.length - 1;
    while (left < right) {
      int mid = (left + right + 1) / 2;
      if (target >= nums[mid]) {
        left = mid;
      } else {
        right = mid - 1;
      }
    }

    return new int[] { l, left };
  }

}
