package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort01 {
    private static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minIndex = maxIndex(arr,i,arr.length);
            swap(arr,i,minIndex);
        }
    }
    private static void swap(int[] arr,int min,int max){
        int temp = arr[min];
        arr[min]=arr[max];
        arr[max]=temp;
    }
    private static int maxIndex(int[] arr, int firstIndex, int length) {
        int min=firstIndex;
        for(int i=firstIndex;i<length;i++){
            if(arr[i]<arr[min])
                min=i;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter values to tha array");
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Before Sorting : "+ Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After Sorting : "+Arrays.toString(arr));
    }

}
