package Sorting;

// 287. Find the Duplicate Number
// https://leetcode.com/problems/find-the-duplicate-number/description/
/* Example 1:
        Input: nums = [1,3,4,2,2]
        Output: 2
   Example 2:
        Input: nums = [3,1,3,4,2]
        Output: 3
 */
public class Duplicate_Number {

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int duplicate = findDuplicate(arr);
        System.out.println("duplicate number = "+duplicate);
    }

    public static int findDuplicate(int[] nums) {
        cycleSort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1)
                return nums[i];
        }
        return nums.length;
    }

    public static void cycleSort(int[] nums){
        int n = nums.length-1;
        int i = 0;
        while(i<=n){
            int correctIndex = nums[i]-1;
            if(nums[i] == nums[correctIndex]){
                i++;
            } else {
                swap(nums,i,nums[i]-1);
            }
        }
    }

    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
