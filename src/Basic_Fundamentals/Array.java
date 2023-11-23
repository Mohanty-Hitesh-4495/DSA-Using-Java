package Basic_Fundamentals;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
//****************** 2D-ARRAY ***********************
        int[][] arr= {
                {1,2,3},
                {5,4,6},
                {7,8,9}
        };
//        Scanner sc = new Scanner(System.in);
        System.out.println("ENTERED ARRAY: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        for(int[] i:arr){//Enhanced for loop...
            System.out.println(Arrays.toString(i));
        }
//****************** 1D-ARRAY **************************
//        int[] arr1 = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr1[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr1));//converting array into string format
//        for (int num : arr1) {//Enhanced for loop...
//            System.out.print(num+" ");
//        }
    }
}
