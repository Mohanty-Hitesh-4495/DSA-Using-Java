import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    static void displayArray(int[] arr){
        System.out.print("SORTED ARRAY: ");
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
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
        bubbleSort(arr);
        displayArray(arr);
    }
}
