package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort2 {

    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int lastIndex = arr.length-i-1;
            int maxIndex =getMaxIndex(arr,lastIndex);
            swap(arr,maxIndex,lastIndex);
        }
    }
    static void swap(int[] arr, int maxIndex, int lastIndex) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }
    static int getMaxIndex(int[] arr, int last) {
        int max= 0;
        for(int i = 0; i<=last; i++){
            if(arr[max]<arr[i])
                max=i;
        }
        return max;
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
        sc.close();
    }
}
