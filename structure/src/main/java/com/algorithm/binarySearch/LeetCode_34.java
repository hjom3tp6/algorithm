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
    int l = 0;
    int r = nums.length - 1;
    while (l < r) {
      int mid = (l + r) / 2;
      if (target <= nums[mid]) {
        r = mid;
      } else {
        l = mid + 1;
      }
    }
    if (nums[l] != target) {
      return new int[] { -1, -1 };
    }
    int lV = l;
    int rV = nums.length - 1;
    while (lV < rV) {
      int mid = (lV + rV + 1) / 2;
      if (target >= nums[mid]) {
        lV = mid;
      } else {
        rV = mid - 1;
      }
    }

    return new int[] { l, lV };
  }

}
