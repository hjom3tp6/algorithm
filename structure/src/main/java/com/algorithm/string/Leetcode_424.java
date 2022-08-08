package com.algorithm.string;

/**
 * https://leetcode.com/problems/longest-repeating-character-replacement/
 * Notes:
 * 1. use sliding window, if lettersToReplace= k, move left pointer
 * 2. lettersToReplace = (end - start + 1) - mostFreqLetter;
 */
public class Leetcode_424 {
  public int characterReplacement(String s, int k) {
    int[] freq = new int[26];
    int mostFreqLetter = 0;
    int left = 0;
    int max = 0;
    for (int i = 0; i < s.length(); i++) {
      freq[s.charAt(i) - 'A']++;
      mostFreqLetter = Math.max(mostFreqLetter, freq[s.charAt(i) - 'A']);
      int lettersToReplace = (i - left + 1) - mostFreqLetter;
      if (lettersToReplace > k) {
        freq[s.charAt(left) - 'A']--;
        left++;
      }
      max = Math.max(max, i - left + 1);
    }
    return max;
  }

}
