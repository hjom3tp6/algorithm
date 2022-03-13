package com.structure.sorting;

import java.util.Arrays;

public class InsertSortingDemo {

  public static void sort(int[] arr) {

    for (int i = 1; i < arr.length; i++) {

      int currentInsertValue = arr[i];
      int insertIndex = i - 1;
      while (insertIndex >= 0 && currentInsertValue < arr[insertIndex]) {

        arr[insertIndex + 1] = arr[insertIndex];
        insertIndex--;
      }
      arr[insertIndex + 1] = currentInsertValue;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 101, 34, 119, 1 };
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }
}