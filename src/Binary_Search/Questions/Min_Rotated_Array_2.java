package Binary_Search.Questions;

// 154. Find Minimum in Rotated Sorted Array II
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/
/*
    Example 1:
        Input: nums = [1,3,5]
        Output: 1
    Example 2:
        Input: nums = [2,2,2,0,1]
        Output: 0
 */

public class Min_Rotated_Array_2 {
    public static void main(String[] args) {
        int[] nums = {2,2,2,0,1};
        int result = findMin(nums);
        System.out.println("minimum element = "+result);
    }

    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int min = Integer.MAX_VALUE;

        while(low<=high){
            int mid = low + (high - low) / 2;

            if(nums[low]<=nums[mid]){
                if(nums[low]<min){
                    min=nums[low];
                }
                low++;
            } else {
                if(nums[mid]<min){
                    min=nums[mid];
                }
                high--;
            }
        }
        return min;
    }
}
