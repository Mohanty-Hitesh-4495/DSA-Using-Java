package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Recursive_BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        int size;

        // Prompt the user to enter the size of the array
        System.out.print("ENTER THE SIZE OF ARRAY : ");
        size = sc.nextInt();

        int[] arr = new int[size]; // Create an array to hold the input elements

        // Prompt the user to enter elements into the array
        System.out.println("ENTER ELEMENTS TO THE ARRAY : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // Perform merge sort on the array
        bubbleSort(arr, size);

        // Display the sorted array
        displayArray(arr);

        sc.close(); // Close the Scanner object
    }

    // Method to display the array
    static void displayArray(int[] arr) {
        System.out.print("SORTED ARRAY: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr, int n){
        if(n==1) return;
        // Perform one pass of bubble sort, moving the largest element to the end
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        // Recursive call to bubbleSort to sort the first n-1 elements
        bubbleSort(arr,n-1);
    }
}
