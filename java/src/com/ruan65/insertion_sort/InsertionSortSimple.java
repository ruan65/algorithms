package com.ruan65.insertion_sort;

public class InsertionSortSimple {

    public static void sort(int[] arr) {

        for (int curr = 1; curr < arr.length; curr++) {
            int newValue = arr[curr];
            int prev = curr;
            while (prev > 0 && newValue < arr[prev - 1]) {
                arr[prev] = arr[prev - 1];
                prev--;
            }
            arr[prev] = newValue;
        }
    }
}








