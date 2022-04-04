package com.algorithm.binarySearch;

public class BinarySearchDemo {

  public static void main(String[] args) {
    int[] arr = { 1, 8, 10, 89, 1000, 1234 };
    int fidVal = 89;
    int i = search(arr, fidVal);
    System.out.println(i); //

  }

  public static int search(int[] arr, int findVal) {

    int l = 0;
    int r = arr.length -1;
    while (l < r) {
      int mid = (l + r) >> 1;
      if (findVal <= arr[mid]) {
        r = mid;
      } else {
        l = mid + 1;
      }
    }
    return arr[l] == findVal ? l : -1;
  }
}
