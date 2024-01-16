package Sorting;

import java.util.ArrayList;
import java.util.List;

// 442. Find All Duplicates in an Array
// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
/* Example 1:
        Input: nums = [4,3,2,7,8,2,3,1]
        Output: [2,3]
   Example 2:
        Input: nums = [1,1,2]
        Output: [1]
 */

public class Duplicate_Numbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> Duplicates = findDuplicates(arr);
        System.out.println("Duplicate List : "+Duplicates);
    }

    public static List<Integer> findDuplicates(int[] nums) {
        cycleSort(nums);
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                ans.add(nums[i]);
            }
        }
        return ans;
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
