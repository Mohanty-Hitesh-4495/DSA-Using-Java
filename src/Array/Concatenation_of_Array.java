package Array;
import java.util.Arrays;

//  1929. Concatenation of Basic_Fundamentals.Array
//  URL=https://leetcode.com/problems/concatenation-of-array/
/*  Example:
    Input: nums = [1,3,2,1]
    Output: [1,3,2,1,1,3,2,1]
    Explanation: The array answer is formed as follows:
    - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
    - ans = [1,3,2,1,1,3,2,1]
 */
public class Concatenation_of_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        arr=getConcatenation(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] getConcatenation(int[] nums) {
        int[] ans=new int [2*nums.length];
        int j=0;
        for(int i=0;i<ans.length;i++){
            if (j==nums.length){
                j=0;
            }
            ans[i]=nums[j];
            j++;
        }
        return ans;
    }
}
