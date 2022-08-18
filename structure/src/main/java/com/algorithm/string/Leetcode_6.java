package com.algorithm.string;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/submissions/
 * use Manacher's algorithm can get O(n) solution, but it's diffcult
 */
public class Leetcode_6 {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1)
            return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start + 1) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    // Hint: return int
    private int expandAroundCenter(String s, int left, int right) {
        int l = left, r = right;
        while (left >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        // (r - 1) -  (l + 1) + 1 = r - l - 1
        return r - l - 1;
    }

}
