package Binary_Search;

// 35. Search Insert Position
// URL=https://leetcode.com/problems/search-insert-position/
/*
Example 1:
    Input: nums = [1,3,5,6], target = 5
    Output: 2
Example 2:
    Input: nums = [1,3,5,6], target = 2
    Output: 1
 */

public class Search_Insert_Position {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6} ;
        int target = 5;
        int index = searchInsert(arr,target);
        System.out.println("target index ="+index);
    }
    public static int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else
                return mid;
        }
        return start;
    }
}
