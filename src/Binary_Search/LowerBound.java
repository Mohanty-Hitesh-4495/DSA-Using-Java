package Binary_Search;

/*
Problem Statement: Given a sorted array of N integers and an integer x, write a program to find the lower bound of x.
Example 1:
    Input Format: N = 4, arr[] = {1,2,2,3}, x = 2
    Result: 1
    Explanation: Index 1 is the smallest index such that arr[1] >= x.

Example 2:
    Input Format: N = 5, arr[] = {3,5,8,15,19}, x = 9
    Result: 3
    Explanation: Index 3 is the smallest index such that arr[3] >= x.
 */

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int n = 5, x = 9;
        int ind = lowerBound(arr, n, x);
        System.out.println("The lower bound is the index: " + ind);
    }

    private static int lowerBound(int[] nums, int n, int target){
        int low = 0, high = n-1;
        int ans = n;

        while(low <= high){
            int mid = low+(high-low)/2;
            if(nums[mid] >= target){
                ans = mid;    // maybe an answer
                high = mid-1; // look for smaller index in left
            } else {
                low = mid+1;  // look on right
            }
        }
        return ans;
    }
}
