package com.algorithm.binarySearch;

/**
 * https://leetcode.com/problems/binary-search/
 */
public class Leetcode_704 {
  public int search(int[] nums, int target) {
    int left = 0, right = nums.length - 1, mid;
    while (left < right) {
      mid = (left + right) / 2;
      if (target <= nums[mid]) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }
    return nums[left] == target ? left : -1;
  }

  public int searchLast(int[]nums, int target) {
    int left = 0, right = nums.length - 1, mid;
    while (left < right) {
      mid = (left + right + 1) / 2;
      if (target >= nums[mid]) {
        left = mid;
      } else {
        right = mid - 1;
      }
    }
    return nums[left] == target ? left : -1;
  }
}
