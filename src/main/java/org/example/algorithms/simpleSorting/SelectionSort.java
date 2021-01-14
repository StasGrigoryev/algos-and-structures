package org.example.algorithms.simpleSorting;

public class SelectionSort {

    public static void sortSelect(int[] arr) {
        int temp;
        int minInd;
        for (int i = 0; i < arr.length-1; i++) {
            minInd = i; // don't forget this
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minInd]) minInd = j;
            }
            temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
        }
    }
}
