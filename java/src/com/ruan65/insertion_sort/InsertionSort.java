package com.ruan65.insertion_sort;

import java.util.Arrays;

public class InsertionSort {

    public static void sort(int[] input) {
        for (int idx = 1; idx < input.length; idx++) {

            int pos = idx - 1, val = input[idx];

            if (input[idx] >= input[pos])
                continue;
            while (input[idx] < input[pos]) {
                if (pos == 0 || input[pos - 1] <= input[idx]) break;
                pos--;
            }
            shift(input, pos, idx);
            input[pos] = val;
        }
    }

    private static void shift(int[] arr, int start, int end) {
        for (int next = end; next > start; next--) {
            arr[next] = arr[next - 1];
        }
    }

    public static void main(String[] args) {

        int[][] data = {
                {},
                {1},
                {2, 1},
                {4, 6, 2},
                {0, 3, 2, 1},
                {6, 8, 3, 100, 5, 4, 1, 2, 0, -5, 0, -1, 9, 7},
        };

        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " --> ");
            sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}
