package com.ruan65.buble_sort;

public class BubleSort {

    public static void sort(int[] arr) {

        for (int bound = 0; bound < arr.length; bound++) {
            popUp(arr, bound);
        }
    }

    private static void popUp(int[] arr, int bound) {
        for (int index = 1; index < arr.length - bound; index++) {
            if (arr[index - 1] > arr[index])
                swap(arr, index - 1, index);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
