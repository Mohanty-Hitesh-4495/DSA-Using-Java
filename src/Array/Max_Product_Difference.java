package Array;
import java.util.*;

// 1913. Maximum Product Difference Between Two Pairs
// URL=https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
/*  Example :
        Input: nums = [5,6,2,7,4]
        Output: 34
        Explanation: We can choose indices 1 and 3 for the first pair (6, 7) and indices 2 and 4 for the second pair (2, 4).
        The product difference is (6 * 7) - (2 * 4) = 34.
 */

public class Max_Product_Difference {

    public static void main(String[] args) {
        int[] arr = {5,6,2,7,4};
        System.out.println(maxProductDifference(arr));
    }

    public static int maxProductDifference(int[] nums) {
         // First Approach - Moye moye :(

         /*     int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
                for(int i=0;i<nums.length;i++){
                    for(int j=0;j<nums.length;j++){
                        int a=nums[i]*nums[j];
                        if(i!=j && a>max){
                            max=a;
                        }
                        if(i!=j && a<min){
                            min=a;
                        }
                    }
                }
                return max-min;
          */

        // Second Approach - :)

        Arrays.sort(nums);
        return (nums[nums.length-1]*nums[nums.length-2] - nums[0]*nums[1]);
    }
}
