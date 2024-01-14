package Sorting;

import java.util.Arrays;

public class InsertionSort1 {

    public static void main(String[] args) {
        int [] arr = {4,7,2,0,12,-446,23,28,18,-12};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int [] arr){
        for (int i=0;i<arr.length;i++){
            for(int j=i;j>0;j--) {
                if(arr[j]<arr[j-1] ) {
                    swap(arr, j,j-1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int [] arr,int min,int max){
        int temp = arr[min];
        arr[min]=arr[max];
        arr[max]=temp;
    }
}
