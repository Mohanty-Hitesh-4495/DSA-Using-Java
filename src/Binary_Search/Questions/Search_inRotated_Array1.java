package Binary_Search.Questions;

//  33. Search in Rotated Sorted Basic_Fundamentals.Array
//  URL=https://leetcode.com/problems/search-in-rotated-sorted-array/
/*  Example:
    Input: nums = [4,5,6,7,0,1,2], target = 0
    Output: 4
 */

public class Search_inRotated_Array1 {
    public static void main(String[] args) {
        int[] arr = {10,11,12,13,1,2,3,4,5,6,7,8,9};
        int target = 9;
        System.out.println(search(arr, target));
    }

    private static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while( low <= high){
            int mid = low+(high-low)/2;
            if(nums[mid] == target){
                return mid;
            }
            // if left half is sorted
            if (nums[mid] >= nums[low]){
                // Check if the target is in the left half
                if(nums[low] <= target && nums[mid] >= target)
                    high = mid-1;
                else
                    low = mid+1;
            }
            // if right half is sorted
            else{
                // Check if the target is in the right half
                if(nums[high] >= target && nums[mid] <= target)
                    low = mid+1;
                else
                    high = mid-1;
            }
        }
        return -1;
    }
}