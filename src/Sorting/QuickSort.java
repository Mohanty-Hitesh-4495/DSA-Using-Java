package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
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
        quickSort(arr, 0, size-1);

        // Display the sorted array
        displayArray(arr);

        sc.close(); // Close the Scanner object
    }

    static void displayArray(int[] arr) {
        System.out.print("SORTED ARRAY: ");
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pivotIndex = partition(arr,low,high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(i<high && arr[i]<=pivot)
                i++;
            while(j>low && arr[j]>pivot)
                j--;
            if (i<j)
                swap(arr,i,j);
        }
        swap(arr,low,j);
        return j;
    }
}
