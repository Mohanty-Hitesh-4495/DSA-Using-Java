package Binary_Search.Questions;

// 153. Find Minimum in Rotated Sorted Array
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
/*
    Example 1:
        Input: nums = [3,4,5,1,2]
        Output: 1
        Explanation: The original array was [1,2,3,4,5] rotated 3 times.
    Example 2:
        Input: nums = [4,5,6,7,0,1,2]
        Output: 0
        Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
 */
public class Min_Rotated_Array_1 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int ans = findMin(nums);
        System.out.println("Minimum element = "+ans);
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
                low=mid+1;
            } else {
                if(nums[mid]<min){
                    min=nums[mid];
                }
                high=mid-1;
            }
        }
        return min;
    }
}
