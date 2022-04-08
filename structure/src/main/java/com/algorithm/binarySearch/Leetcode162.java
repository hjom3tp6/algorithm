package com.algorithm.binarySearch;

public class Leetcode162 {
  public static void main(String[] args) {
    int[] nums1 = { 1, 2, 3, 1 };
    System.out.println(binarySearch(nums1)); // 2
    int[] nums2 = { 1, 2, 1, 3, 5, 6 };
    System.out.println(binarySearch(nums2)); // 5
  }

  public static int linearSearch(int[] nums) {
    for(int i = 0 ; i < nums.length - 1; i++) {
      if(nums[i] > nums[i + 1]) {
        return i;
      }
    }
    return nums.length - 1;
  }

  public static int binarySearch(int[] nums) {
    int left = 0;
    int right = nums.length - 1;
    while (left < right) {
      int mid = left + right >>> 1;
      if (nums[mid] > nums[mid + 1]){
        right = mid;
      } else {
        left = mid + 1;
      }
    }
    return left;
  }

}
