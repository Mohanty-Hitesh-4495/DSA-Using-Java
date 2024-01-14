package Sorting;
import java.util.Arrays;

public class InsertionSort2 {

    public static void main(String[] args) {
        int [] arr = {4,7,2,0,12,-446,23,28,18,-12};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int [] arr){
        for (int i=1;i<arr.length;i++){
           int current=arr[i];
           int j=i-1;
           while(j>=0 && arr[j]>current){
               arr[j+1]=arr[j];
               j--;
           }
           arr[j+1]=current;
        }
    }


}
