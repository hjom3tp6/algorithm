package com.algorithm.binarySearch;

import java.util.Arrays;

public class LeetCode167 {
  public static void main(String[] args) {
    int[] nums = { 5, 7, 7, 8, 8, 10 };
    int target = 8;
    int[] numsRes = search(nums, target);
    System.out.println(Arrays.toString(numsRes)); // [3,4]
  }

  private static int[] search(int[] nums, int target) {

    int l = 0;
    int r = nums.length - 1;
    while (l < r) {
      int mid = (l + r ) / 2;
      if (target <= nums[mid]) {
        r = mid;
      } else {
        l = mid + 1;
      }
    }

    int lV = 0;
    int rV = nums.length - 1;
    while (lV < rV) {
      int mid = (lV + rV + 1 ) / 2;
      if (target >= nums[mid]) {
        lV = mid;
      } else {
        rV = mid -1;
      }
    }

    return new int[] { l, lV };
  }

}
