package com.algorithm.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-anagrams-in-a-string
 * use "Arrays.equals()"
 * #SlidingWindow
 */
public class Leetcode_438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new LinkedList<>();
        int sLen = s.length(), pLen = p.length();
        if (sLen < pLen) {
            return new ArrayList<>();
        }
        int[] pCount = new int[26];
        int[] sCount = new int[26];
        for (char ch : p.toCharArray()) {
            pCount[ch - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            if (i >= pLen) {
                sCount[s.charAt(i - pLen) - 'a']--; // use window's length find left pointer
            }
            if (Arrays.equals(pCount, sCount)) {
                list.add(i - pLen + 1);
            }
        }
        return list;
    }
}
