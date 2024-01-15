package Sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {3,8,4,6,2,1,7,9,5};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int [] nums){
        int i=0;
        while(i < nums.length-1){
            if(nums[i]==i+1){ // if value of index i is equals to i+1, then no need to swap
                i++;
            } else { // if not then swap
                swap(nums,i,nums[i]-1);
            }
        }
    }

    static void swap(int [] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}