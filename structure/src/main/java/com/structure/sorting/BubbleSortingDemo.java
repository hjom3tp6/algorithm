package com.structure.sorting;

public class BubbleSortingDemo {

    public static void sort(int[] arr) {

        int temp;
        boolean finish = false;
        for (int i = 0; i < arr.length ; i++) {
            finish = true;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    finish = false;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(finish){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 9, -1, 10, -2 };
        sort(arr);
        for(int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}