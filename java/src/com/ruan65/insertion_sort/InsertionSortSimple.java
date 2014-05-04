package com.ruan65.insertion_sort;

public class InsertionSortSimple {

    public static void sort(int[] arr) {

        for (int curr = 1; curr < arr.length; curr++) {

            int prev = curr - 1;
            while (prev >= 0 && arr[prev + 1] < arr[prev]) {
                swap(arr, prev + 1, prev);
                prev--;
            }
        }
    }

    private static void swap(int[] arr, int curr, int prev) {

        int tmp = arr[prev];
        arr[prev] = arr[curr];
        arr[curr] = tmp;
    }
}








