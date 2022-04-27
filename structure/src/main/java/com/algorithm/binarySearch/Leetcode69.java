package com.algorithm.binarySearch;

/**
 * https://leetcode.com/problems/sqrtx/
 */
public class Leetcode69 {

  public static void main(String[] args) {
    // 0 <= x <= 2^31 - 1
    int sqrt4 = sqrt(4); // 2
    System.out.println(sqrt4);
    int sqrt8 = sqrt(8); // 2
    System.out.println(sqrt8);
  }

  public static int sqrt(int num) {

    // x * x <= num
    int left = 0;
    int right = num;
    while (left < right) {
      int mid = (left + right + 1) >> 1;
      if ( mid  <=  num / mid) {
        left = mid;
      } else {
        right = mid - 1;
      }
    }
    return right;
  }
}
