package com.structure.sorting;

import java.util.Arrays;

public class SelectSortingDemo {

  public static void sort(int[] arr) {

    for (int j = 0; j < arr.length -1; j++) {

      int min = arr[j];
      int minIndex = j;
      for (int i = j + 1; i < arr.length; i++) {
        if (min > arr[i]) {
          min = arr[i];
          minIndex = i;
        }
      }
      arr[minIndex] = arr[j];
      arr[j] = min;
    }
  }

  public static void main(String[] args) {
    int[] arr = { 101, 34, 119, 1 };
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
