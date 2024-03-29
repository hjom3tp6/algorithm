package com.algorithm.string;

import java.util.Arrays;

public class Leetcode_242 {

  // use Arrays.equals()
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length())
      return false;
    int[] sArray = new int[128];
    int[] tArray = new int[128];
    for (int i = 0; i < s.length(); i++) {
      sArray[s.charAt(i)]++;
      tArray[t.charAt(i)]++;
    }
    System.out.println(Arrays.toString(sArray));
    System.out.println(Arrays.toString(tArray));
    return Arrays.equals(sArray, tArray);
  }

  // only one array needed
  public boolean isAnagram_2(String s, String t) {
    if (s.length() != t.length())
      return false;
    int[] count = new int[128];
    for (int i = 0; i < s.length(); i++) {
      count[s.charAt(i)]++;
      count[t.charAt(i)]--;
    }
    for (int i : count) {
      if (i != 0) {
        return false;
      }
    }
    return true;
  }

}
