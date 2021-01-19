package org.example.algorithms.simpleSorting;

public class InsertionSort {
    public static void sortInsert(int[] arr) {
        int ind;
        int temp;

        for(int i = 1; i < arr.length; i++) {
            temp = arr[i];
            ind = i;
            while (ind > 0 && temp < arr[ind-1]) {
                arr[ind] = arr[ind-1];
                ind--;
            }
            arr[ind] = temp;
        }

//        for(int i = 1; i < arr.length; i++) {
//            temp = arr[i];
//            for(int j = i-1; j >= 0; j--) {
//                if (temp < arr[j]) {
//                    arr[j+1] = arr[j];
//                    if (j == 0)
//                        arr[j] = temp;
//                } else if (j != i-1){
//                    arr[j+1] = temp;
//                    break;
//                } else
//                    break;
//            }
//        }
    }
}
