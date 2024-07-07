package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    static void displayArray(int[] arr){
        System.out.print("SORTED ARRAY: ");
        System.out.println(Arrays.toString(arr));
    }

    // This version includes an optimization to stop the algorithm if the array becomes sorted before all passes are complete:
    static void bubbleSort2(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            int swapcount = 0;
            for(int j=0;j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapcount = 1;
                }
            }
            if(swapcount == 0){
                break;
            }
        }
    }

    // This is the standard implementation of bubble sort:
    static void bubbleSort1(int[] arr){
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("ENTER THE SIZE OF ARRAY : ");
        size=sc.nextInt();
        int[] arr = new int[size];
        System.out.println("ENTER ELEMENTS TO THE ARRAY : ");
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        bubbleSort1(arr);
        displayArray(arr);
    }
}
