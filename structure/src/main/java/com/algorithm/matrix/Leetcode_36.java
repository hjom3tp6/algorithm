package com.algorithm.matrix;

import java.util.HashSet;
/*
 * https://leetcode.com/problems/valid-sudoku/
 */
public class Leetcode_36 {
  public boolean isValidSudoku(char[][] board) {
    int n = 9;
    HashSet<Character>[] rows = new HashSet[n];
    HashSet<Character>[] cols = new HashSet[n];
    HashSet<Character>[] boxes = new HashSet[n];
    for (int r = 0; r < n; r++) {
      rows[r] = new HashSet<Character>();
      cols[r] = new HashSet<Character>();
      boxes[r] = new HashSet<Character>();
    }
    for (int r = 0; r < n; r++) {
      for (int c = 0; c < n; c++) {
        char ch = board[r][c];
        if (ch == '.') {
          continue;
        }
        if (rows[r].contains(ch)) {
          return false;
        }
        rows[r].add(ch);
        if (cols[c].contains(ch)) {
          return false;
        }
        cols[c].add(ch);
        int boxIdx = (r / 3 * 3) + (c / 3);
        if (boxes[boxIdx].contains(ch)) {
          return false;
        }
        boxes[boxIdx].add(ch);
      }
    }
    return true;
  }
}
