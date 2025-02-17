package Binary_Search;

/*
Problem Statement: Given a sorted array of N integers and an integer x, write a program to find the upper bound of x.
Example 1:
    Input Format: N = 4, arr[] = {1,2,2,3}, x = 2
    Result: 3
    Explanation: Index 3 is the smallest index such that arr[3] > x.

Example 2:
    Input Format: N = 6, arr[] = {3,5,8,9,15,19}, x = 9
    Result: 4
    Explanation: Index 4 is the smallest index such that arr[4] > x.
 */

public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 9, 15, 15, 19};
        int n = 6, x = 10;
        int ind = upperBound(arr, x, n);
        System.out.println("The upper bound is the index: " + ind);
    }

    private static int upperBound(int[] nums, int target, int n){
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(nums[mid] > target){
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }
}
