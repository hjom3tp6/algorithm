package com.string;

import java.util.HashMap;
import java.util.Map;

/*
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/
 */
public class Leetcode_3 {
  public int lengthOfLongestSubstring(String s) {
    Map<Character, Integer> map = new HashMap<>();
    int start = 0, len = 0;
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (map.containsKey(c) && map.get(c) >= start ) { // ex. "abba" the len will be 3
            start = map.get(c) + 1;
        }
        len = Math.max(len, i - start + 1);
        map.put(c, i);
    }
    return len;
  }
}
