package Sorting;

import java.util.Arrays;

public class InsertionSort3 {
    public static void main(String[] args) {
        int [] arr = {4,7,2,0,12,-446,23,28,18,-12};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion(int[] arr){
        for(int i=0;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}
