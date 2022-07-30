package com.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/group-anagrams/
 * key point: convert anagram as hashmap key
 * The method of conversion can be can be int[] or char[]
 */
public class Leetcode_49 {
  public List<List<String>> groupAnagrams(String[] strs) {
    if (strs.length == 0) {
      return new ArrayList<>();
    }
    Map<String, List<String>> map = new HashMap<>();
    for (String s : strs) {
      // convert anagram as a hashmap key
      char[] chars = new char[26];
      for (char c : s.toCharArray()) {
        chars[c - 'a']++;
      }
      String keyStr = String.valueOf(chars);
      if (!map.containsKey(keyStr)) {
        map.put(keyStr, new ArrayList<>());
      }
      map.get(keyStr).add(s);
    }
    return new ArrayList<>(map.values());
  }
}
