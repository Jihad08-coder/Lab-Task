
package com.mycompany.selectionsort;


public class Selectionsort {

   static void selection(int[] arr) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++) {
            // Find the minimum element in unsorted array
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min= j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Unsorted array:");
        printArray(arr);
        
        selection(arr);
        
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
