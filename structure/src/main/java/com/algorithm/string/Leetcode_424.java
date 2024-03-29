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
    // it's a bit tricky that save the maximum number of frequency but not the
    // character
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

  // save character
  public int characterReplacement_mostFreqCh(String s, int k) {
    int max = 0;
    char mostFreqCh = s.charAt(0);
    int left = 0;
    int[] count = new int[26]; // as a map, key = character, value = frequency
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      count[ch - 'A']++;
      if (count[mostFreqCh - 'A'] <= count[ch - 'A']) {
        mostFreqCh = ch;
      }
      int num = (i - left + 1) - count[mostFreqCh - 'A'];
      if (num > k) {
        count[s.charAt(left) - 'A']--;
        left++;
      }
      max = Math.max(max, i - left + 1);
    }

    return max;
  }

}
