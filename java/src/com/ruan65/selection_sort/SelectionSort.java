package com.ruan65.selection_sort;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] arr) {

        int len = arr.length;

        for (int pos = 0; pos < len - 1; pos++) {

            for (int indx = pos + 1; indx < len; indx++) {

                if (arr[pos] > arr[indx]) {
                    int tmp = arr[pos];
                    arr[pos] = arr[indx];
                    arr[indx] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {  // Let's check it out
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

/* Output:
[] --> []
[1] --> [1]
[2, 1] --> [1, 2]
[4, 6, 2] --> [2, 4, 6]
[0, 3, 2, 1] --> [0, 1, 2, 3]
[6, 8, 3, 100, 5, 4, 1, 2, 0, 9, 7] --> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 100]
*/

