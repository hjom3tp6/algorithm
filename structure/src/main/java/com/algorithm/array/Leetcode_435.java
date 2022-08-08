package com.algorithm.array;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/non-overlapping-intervals/ 
 * 1. sort by interval's end (quicker)
 * 2. use Two Pointer (faster & slower)
 */
public class Leetcode_435 {
  public int eraseOverlapIntervals(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> (a[1] - b[1]));
    int count = 0;
    int left = 0;
    for (int i = 0; i < intervals.length; i++) {
      if (i > 0 && intervals[i][0] <= intervals[left][1]) {
        count++;
      } else {
        left = i;
      }
    }
    return count;
  }
}
