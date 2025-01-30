package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class CountInversions {

    private static int merge(int[] arr, int low, int mid, int high){
        int left = low;
        int right = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();
        int count = 0;

        while(left<=mid && right<=high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                count += (mid-left+1);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }
        // Copy sorted elements back to original array
        for(int i=low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }
        return count;
    }

    private static int mergesort(int[]arr, int low, int high){
        int count = 0;
        if( low >= high) return count;
        int mid = low + (high-low) / 2;
        count += mergesort(arr, low, mid);
        count += mergesort(arr, mid+1, high);
        count += merge(arr, low, mid, high);
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,1};
        int low = 0;
        int high = arr.length;
        int count = mergesort(arr,low,high-1);
        System.out.println("Number inversion pairs exist in "+ Arrays.toString(arr) +": "+count);
    }
}
