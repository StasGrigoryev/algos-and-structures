package org.example.algorithms.simpleSorting;

public class algoTest {
    public static void main(String[] args) {
        int[] arr = new int[] {5,9,2,7,8,10,6,3,4,1};
        display(arr);
        System.out.println();
        InsertionSort.sortInsert(arr);
        display(arr);
        System.out.println();
    }

        public static void display(int[] arr) {
            String output = "";
            for(int i = 0; i < arr.length; i++) {
                output = (i == arr.length-1) ? arr[i] + "" : arr[i] + " ";
                System.out.print(output);
            }
        }
}
