package Sorting.Questions;

// 41. First Missing Positive
// URL=https://leetcode.com/problems/first-missing-positive/
/*  Example 1:
        Input: nums = [1,2,0]
        Output: 3
        Explanation: The numbers in the range [1,2] are all in the array.
    Example 2:
        Input: nums = [3,4,-1,1]
        Output: 2
        Explanation: 1 is in the array but 2 is missing.
 */
public class First_Missing_Number {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        int missing = firstMissingPositive(arr);
        System.out.println(missing);
    }

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length-1;

        // implementing Cyclic-Sort Algorithm
        int i = 0;
        while(i<=n){
            int correctIndex = nums[i]-1;
            if( nums[i] > 0 && nums[i]<=nums.length && nums[i] != nums[correctIndex] ){
                swap(nums,i,correctIndex);
            } else {
                i++;
            }
        }

        // finding the first missing number
        for(int j=0;j<=n;j++){
            if(nums[j] != j+1)
                return j+1;
        }
        return n+2;
    }

    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
