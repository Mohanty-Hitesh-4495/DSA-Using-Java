package Array;
/*
493. Reverse Pairs
https://leetcode.com/problems/reverse-pairs/description/
 */
import java.util.ArrayList;
import java.util.Arrays;

public class ReversePairs {

    public static void main(String[] args) {
        int[] nums = {40, 25, 19, 12, 9, 6, 2};
        System.out.println("Original Array: "+Arrays.toString(nums));
        System.out.println("Count of reverse pairs: " + reversePairs(nums));
    }

    public static void merge(int[] nums, int low, int mid, int high){
        int left = low, right = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();

        while(left<=mid && right<=high){
            if(nums[left] <= nums[right]){
                temp.add(nums[left]);
                left++;
            } else {
                temp.add(nums[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(nums[left]);
            left++;
        }
        while(right<=high){
            temp.add(nums[right]);
            right++;
        }
        for(int i=low; i<=high; i++){
            nums[i] = temp.get(i-low);
        }
    }

    public static int countPairs(int[] nums, int low, int mid, int high){
        int right = mid+1;
        int count = 0;
        for(int i=low; i<=mid; i++){
            while( right <= high && (long)nums[i] > (long)2*nums[right]) right++;
            count += (right-(mid+1));
        }
        return count;
    }

    public static int mergeSort(int[] nums, int low, int high){
        int count = 0;
        if (low >= high) return count;
        int mid = low + (high - low) / 2;
        count += mergeSort(nums, low, mid);
        count += mergeSort(nums, mid+1, high);
        count += countPairs(nums, low, mid, high);
        merge(nums, low, mid, high);
        return count;
    }

    public static int reversePairs(int[] nums) {
        int low = 0;
        int high = nums.length;
        return mergeSort(nums, low, high-1);
    }
}
