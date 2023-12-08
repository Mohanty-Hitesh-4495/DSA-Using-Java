package Binary_Search;
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
/*
    1095. Find in Mountain Basic_Fundamentals.Array
    https://leetcode.com/problems/find-in-mountain-array/
*/

public class Search_in_MountainArray{
    public static void main(String[] args) {
        int[] arr={1,2,3,7,5,4,0};
        int ans=findInMountainArray(1,arr);
        System.out.println(ans);
    }
//
    public static int findInMountainArray(int target, int[] arr) {
        int peak = peakIndexInMountainArray(arr);
        int ans = binarySearch(arr,target,0,peak);
        if(ans == -1) {
            ans = binarySearch(arr,target,peak,arr.length-1);
        }
        return ans;
    }

    public static int binarySearch(int[] arr,int target,int start,int end){
        boolean IsAscending = (arr[start] < arr[end]);
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(IsAscending){
                if(target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else {
                if(target < arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                // you are in decreasing part of array
                // mid may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            }
            else{
                // you are in increasing part of array
                // because we know mid+1 > mid
                start = mid + 1;
            }
        }
        return start;
    }
}