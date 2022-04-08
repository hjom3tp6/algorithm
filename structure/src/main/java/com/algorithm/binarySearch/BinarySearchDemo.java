package com.algorithm.binarySearch;

public class BinarySearchDemo {

  public static void main(String[] args) {
    int[] arr = { 1, 8, 10, 89, 89, 1000, 1234 };
    int target = 89;
    int i = searchFirst(arr, target);
    System.out.println(i); //
    int j = searchLast(arr, target);
    System.out.println(j);

  }

  // binary search find the first one

  public static int searchFirst(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;
    while (left < right) {
      int mid = ( left + right ) / 2;
      if (target <= arr[mid]) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }
    return left;
  }

  // binary search find the last one
  public static int searchLast(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;
    while ( left < right ) {
      int mid = ( left + right + 1) / 2;
      if ( target >= arr[mid] ) {
        left = mid;
      } else {
        right = mid - 1;
      }
    }
    return left;

  }

}
