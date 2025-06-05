package Binary_Search.Questions;

// 81. Search in Rotated Sorted Array II
// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
/*
    Example 1:
        Input: nums = [2,5,6,0,0,1,2], target = 0
        Output: true
    Example 2:
        Input: nums = [2,5,6,0,0,1,2], target = 3
        Output: false
 */
public class Search_inRotated_Array2 {
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        boolean ans = search(arr,0);
        System.out.println(ans);
    }

    public static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){

            int mid = start + (end-start) / 2;

            if(nums[mid]==target)
                return true;
            if(nums[start]==nums[mid] && nums[mid]==nums[end]){
                start++;
                end--;
                continue;
            }
            if(nums[start]<=nums[mid]){
                if(nums[start]<=target && target<=nums[mid]){
                    end = mid-1;
                } else{
                    start = mid+1;
                }
            } else {
                if(nums[mid]<=target && target<=nums[end]){
                    start = mid+1;
                } else{
                    end = mid-1;
                }
            }
        }
        return false;
    }
}
