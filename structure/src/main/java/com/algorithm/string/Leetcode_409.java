package com.algorithm.string;

/**
 * https://leetcode.com/problems/longest-palindrome/
 */
public class Leetcode_409 {

    public int longestPalindrome(String s) {
        int res = 0;
        int[] count = new int[128]; 
        for (char ch: s.toCharArray()) {
            count[ch]++;
        }
        for (int i : count) {
            res += (i / 2 * 2);
            if (res % 2 == 0 && i % 2 == 1) {
                res++;
            }
        }
        return res;
    }
}
