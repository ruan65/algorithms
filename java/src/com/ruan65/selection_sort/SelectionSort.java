package com.ruan65.selection_sort;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] arr) {

        int len = arr.length;

        for (int i = 0; i < len; i++) {
            int index = i;
            int min = arr[i];
            for (int j = i + 1; j < len; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            if (arr[i] > min) {
                int tmp = arr[i];
                arr[i] = min;
                arr[index] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] data = {
                {},
                {1},
                {2, 1},
                {4, 6, 2},
                {0, 3, 2, 1},
                {6, 8, 3, 100, 5, 4, 1, 2, 0, 9, 7},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " --> ");
            sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}

