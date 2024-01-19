package Sorting.Questions;

import java.util.ArrayList;
import java.util.List;

// 448. Find All Numbers Disappeared in an Array
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
/* Example 1:
        Input: nums = [4,3,2,7,8,2,3,1]
        Output: [5,6]
   Example 2:
        Input: nums = [1,1]
        Output: [2]
 */

public class Disappeared_Numbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> result = findDisappearedNumbers(arr);
        System.out.println("Disappeared numbers : "+ result);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        cycleSort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1)
                ans.add(i+1);
        }
        return ans;
    }

    static void cycleSort(int [] nums){
        int i = 0;
        while(i<nums.length){
            int crtindex = nums[i]-1;
            if(nums[i]==nums[crtindex]){
                i++;
            } else {
                swap(nums,i,crtindex);
            }
        }
    }

    static void swap(int [] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
