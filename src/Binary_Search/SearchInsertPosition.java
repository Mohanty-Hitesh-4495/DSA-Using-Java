package Binary_Search;

/*
Problem Statement: You are given a sorted array arr of distinct values and a target value x. You need to search for the index of the target value in the array.
If the value is present in the array, then return its index. Otherwise, determine the index where it would be inserted in the array while maintaining the sorted order.

Example 1:
    Input Format: arr[] = {1,2,4,7}, x = 6
    Result: 3
    Explanation: 6 is not present in the array.
    So, if we will insert 6 in the 3rd index(0-based indexing), the array will still be sorted.
    {1,2,4,6,7}.
*/

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,2,4,7};
        int n = nums.length;
        int target = 2;
        System.out.println("Insert Position: " + searchInsertPosition(nums, target, n));
    }

    private static int searchInsertPosition(int[] nums, int target, int n){
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid] >= target) {
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }

}
