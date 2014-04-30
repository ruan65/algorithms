package com.ruan65.selection_sort;

import java.util.Arrays;

public class SelectionSort2 {  // This one is more efficient cos it has only one swap per round...

    public static void sortOneSwap(int[] arr) {

        int len = arr.length;

        for (int pos = 0; pos < len - 1; pos++) {
            int minIdx = pos;
            for (int idx = pos + 1; idx < len; idx++) {
                if (arr[minIdx] > arr[idx])
                    minIdx = idx;
            }

            if (pos != minIdx) {
                int tmp = arr[pos];
                arr[pos] = arr[minIdx];
                arr[minIdx] = tmp;
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
                {6, 8, 3, 100, 5, 4, 1, 2, 0, 9, 7, -200, -1},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " --> ");
            sortOneSwap(arr);
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