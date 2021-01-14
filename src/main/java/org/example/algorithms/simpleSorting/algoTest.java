package org.example.algorithms.simpleSorting;

public class algoTest {
    public static void main(String[] args) {
        int[] arr = new int[] {10,9,8,7,6,5,4,3,2,1};
        display(arr);
        System.out.println();
        SelectionSort.sortSelect(arr);
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
