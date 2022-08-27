package com.algorithm.binarySearch;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 * // notice "while (left <= right)" & if (target == nums[mid])
 */

public class Leetcode_33 {
  public int search(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    while (left <= right) {    
      int mid = (left + right) >> 1;
      if (target == nums[mid]) {
        return mid;
      }
      if (nums[mid] < nums[left]) {
        if (target <= nums[right] && target > nums[mid]) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      } else {
        if (target >= nums[left] && target < nums[mid]) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      }
    }
    return -1;
  }
}
