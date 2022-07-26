package com.string;

public class LeetCode_5 {
  public static String longestPalindrome(String s) {
    if (s == null || s.length() == 0) return "";
    int start = 0, end = 0;
    for (int i = 0; i < s.length(); i++) {
      int len1 = getPalindromeLength(s, i, i);
      int len2 = getPalindromeLength(s, i, i + 1);
      int len = Math.max(len1, len2);
      if (len > end - start + 1) {
        start = i - (len - 1) / 2;
        end = i + len / 2;
      }
    }
    return s.substring(start, end + 1);
  }
  private static int getPalindromeLength(String s, int left, int right) {
    int l = left;
    int r = right;
    int length = 0;
    while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
      length = r - l + 1;
      l--;
      r++;
    }
    return length;
  }

  public static void main(String[] args) {
    String s = longestPalindrome("ababb");
    System.out.println(s);
  }
}