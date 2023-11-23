package Array;
import java.util.Arrays;

//  1920. Build Basic_Fundamentals.Array from Permutation
//  URL=https://leetcode.com/problems/build-array-from-permutation/
/*  Input: nums = [0,2,1,5,3,4]
    Output: [0,1,2,4,5,3]
    Explanation: The array answer is built as follows:
    ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
        = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
        = [0,1,2,4,5,3]
 */

public class Array_Permutation {
    public static void main(String[] args) {
        int[] arr={0,2,1,5,3,4};
        arr=buildArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}
