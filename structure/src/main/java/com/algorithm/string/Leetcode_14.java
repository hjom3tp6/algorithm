package com.algorithm.string;

/**
 * https://leetcode.com/problems/longest-common-prefix/
 * 1. find longest common prefix in java use indexOf() + substring()
 */
public class Leetcode_14 {

  /**
   * (1) Horizontal scanning
   * Time complexity = O(S), S = sum of all characters in all strings
   */
  public String longestCommonPrefix_1(String[] strs) {
    String pre = strs[0];
    for (int i = 0; i < strs.length; i++) {
      while (strs[i].indexOf(pre) != 0) {
        pre = pre.substring(0, pre.length() - 1);
      }
    }
    return pre;
  }

  /**
   * (2) Vertical scanning
   * Time complexity = O(S)
   */
  public String longestCommonPrefix_2(String[] strs) {
    for (int i = 0; i < strs[0].length(); i++) {
      char c = strs[0].charAt(i);
      for (int j = 1; j < strs.length; j++) {
        if (i == strs[j].length() || strs[j].charAt(i) != c) {
          return strs[0].substring(0, i);
        }
      }
    }
    return strs[0];
  }
}
