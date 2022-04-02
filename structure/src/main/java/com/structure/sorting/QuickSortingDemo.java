package com.structure.sorting;

import java.util.Arrays;

public class QuickSortingDemo {
  public static void main(String[] args) {
    int[] arr = { 9, 78, 0, 23, -567, 70 };
    sort(arr, 0, arr.length - 1);
    // quickSort(arr, 0, arr.length -1);
    System.out.println(Arrays.toString(arr));
  }

  public static void sort(int[] arr, int left, int right) {
    int pivot = arr[(right + left) / 2];
    int l = left;
    int r = right;
    while (l < r) {
      while (arr[l] < pivot) {
        l++;
      }
      while (arr[r] > pivot) {
        r--;
      }
      if (l >= r) {
        break;
      }
      int temp = arr[r];
      arr[r] = arr[l];
      arr[l] = temp;

      l++;
      r--;
    }

    if (l == r) {
      l++;
    }

    if (left < r) {
      sort(arr, left, r);
    }
    if (l < right) {
      sort(arr, l, right);
    }
  }

}
