package Array;
import java.util.Arrays;
//  1480. Running Sum of 1d Basic_Fundamentals.Array
//  URL=https://leetcode.com/problems/running-sum-of-1d-array/
/*  Example:
    Input: nums = [1,2,3,4]
    Output: [1,3,6,10]
    Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */
public class Sum_of_1DArray {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,88};
        System.out.println("INPUT = "+Arrays.toString(arr));
        int[] ans = runningSum(arr);
        System.out.println("OUTPUT = "+Arrays.toString(arr));

    }
    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0)
                ans[i]=nums[i];
            else
                ans[i]=ans[i-1]+nums[i];
        }
        return ans;
    }
}
