package Sorting.Questions;

// 645. Set Mismatch
// URL=https://leetcode.com/problems/set-mismatch/
/* Example 1:
        Input: nums = [1,2,2,4]
        Output: [2,3]
   Example 2:
        Input: nums = [1,1]
        Output: [1,2]
 */

import java.util.Arrays;

public class Set_Mismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] result = findErrorNums(arr);
        System.out.println("[repeated number,missing number] : "+ Arrays.toString(result));
    }

    public static int[] findErrorNums(int[] nums) {
        int n = nums.length-1;

        // Cycle Sort Algorithm
        int i = 0;
        while(i<=n){
            int correctIndex = nums[i]-1;
            if(nums[i] == nums[correctIndex]){
                i++;
            } else {
                swap(nums,i,nums[i]-1);
            }
        }

        // finding the repeated and missing number
        int[] ans = new int[2];
        for(int j=0;j<=n;j++){
            if(nums[j] != j+1){
                ans[0] = nums[j];
                ans[1] = j+1;
            }
        }
        return ans;
    }

    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
