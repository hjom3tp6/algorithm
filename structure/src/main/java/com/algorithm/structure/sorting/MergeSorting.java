package com.algorithm.structure.sorting;

import java.util.Arrays;

public class MergeSorting {

  public static void main(String[] args) {
    int[] arr = { 8, 4, 5, 7, 1, 3, 6, 2 };
    int[] temps = new int[arr.length];
    sort(arr, 0, arr.length - 1, temps);
    System.out.println(Arrays.toString(arr));
  }

  public static void sort(int[] arr, int left, int right, int[] temps) {
    if (left >= right) return;
    int mid = (left + right) / 2;
    sort(arr, left, mid, temps);
    sort(arr, mid + 1, right, temps);
    merge(arr, left, mid, right, temps);
  }

  public static void merge(int[] arr, int left, int mid, int right, int[] temps) {
    int l = left;
    int r = mid + 1;
    int tempsIndex = 0;
    while (l <= mid && r <= right) {
      if (arr[l] < arr[r]) {
        temps[tempsIndex++] = arr[l++];
      } else {
        temps[tempsIndex++] = arr[r++];
      }
    }
    while (l <= mid) {
      temps[tempsIndex++] = arr[l++];
    }
    while (r <= right) {
      temps[tempsIndex++] = arr[r++]; 
    }
    tempsIndex = 0;
    l = left;
    while(l <= right) {
      arr[l++] = temps[tempsIndex++]; 
    }
  }

}
