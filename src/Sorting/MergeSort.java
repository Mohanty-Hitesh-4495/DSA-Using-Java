package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
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
        mergeSort(arr, 0, size - 1);

        // Display the sorted array
        displayArray(arr);

        sc.close(); // Close the Scanner object
    }

    // Method to display the array
    static void displayArray(int[] arr) {
        System.out.print("SORTED ARRAY: ");
        System.out.println(Arrays.toString(arr));
    }

    // Recursive merge sort function
    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2; // Find the middle point
            // Recursively sort the first half
            mergeSort(arr, low, mid);
            // Recursively sort the second half
            mergeSort(arr, mid + 1, high);
            // Merge the two halves
            merge(arr, low, mid, high);
        }
    }

    // Function to merge two halves of the array
    public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> sorted = new ArrayList<>(); // Temporary list to hold sorted elements
        int left = low; // Starting index for the left subarray
        int right = mid + 1; // Starting index for the right subarray

        // Merge the left and right subarrays
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                sorted.add(arr[left]);
                left++;
            } else {
                sorted.add(arr[right]);
                right++;
            }
        }

        // Copy remaining elements of the left subarray, if any
        while (left <= mid) {
            sorted.add(arr[left]);
            left++;
        }

        // Copy remaining elements of the right subarray, if any
        while (right <= high) {
            sorted.add(arr[right]);
            right++;
        }

        // Copy sorted elements back into the original array
        for (int i = low; i <= high; i++) {
            arr[i] = sorted.get(i - low);
        }
    }
}
