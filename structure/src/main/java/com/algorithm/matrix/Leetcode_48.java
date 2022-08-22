package com.algorithm.matrix;

/*
 * https://leetcode.com/problems/rotate-image/
 */
public class Leetcode_48 {
  // Approach 1: Rotate Groups of Four Cells
  public void rotate(int[][] matrix) {
    int n = matrix.length;
    for (int i = 0; i < (n + 1) / 2; i++)  {
      for (int j = 0; j < n / 2; j++) {
        int temp = matrix[n - 1 - j][i];
        matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
        matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
        matrix[j][n - 1 -i] = matrix[i][j];
        matrix[i][j] = temp;
      }
    }       
  }

  // Approach 2: Reverse on Diagonal and then Reverse Left to Right
  public void rotate_reverse(int[][] matrix) {
    transpose(matrix);
    reverse(matrix);
  }

  static void transpose(int[][] matrix) {
    int n = matrix.length;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
  }

  static void reverse(int[][] matrix) {
    int n = matrix.length;
    for(int i = 0; i < n; i++) {
      for (int j = 0; j < n / 2; j++) {
        int temp = matrix[i][j];
      matrix[i][j] = matrix[i][n - 1 - j];
      matrix[i][n - 1 - j] = temp;
      }
    }
  }
}
