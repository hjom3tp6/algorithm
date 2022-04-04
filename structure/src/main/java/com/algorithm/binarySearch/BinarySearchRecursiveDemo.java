package com.algorithm.binarySearch;

public class BinarySearchRecursiveDemo {

  public static void main(String[] args) {
    int[] arr = { 1, 8, 10, 89, 1000, 1234 };
    int fidVal = 90;
    int i = search(arr, 0, arr.length - 1, fidVal);
    System.out.println(i);
  }

  public static int search(int[] arr, int left, int right, int findVal) {
    if (left > right) {
      return -1;
    }
    int mid = left + right >>> 1;
    int midVal = arr[mid];
    if (midVal == findVal) {
      return mid;
    }

    if (findVal > midVal) {
      return search(arr, mid + 1, right, findVal);
    }
    return search(arr, left, mid - 1, findVal);
  }
}
