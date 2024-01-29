package Array;
import java.util.Arrays;

// 189. Rotate Array
// https://leetcode.com/problems/rotate-array/description/
/*
    Example 1:
        Input: nums = [1,2,3,4,5,6,7], k = 3
        Output: [5,6,7,1,2,3,4]
        Explanation:
            rotate 1 steps to the right: [7,1,2,3,4,5,6]
            rotate 2 steps to the right: [6,7,1,2,3,4,5]
            rotate 3 steps to the right: [5,6,7,1,2,3,4]
    Example 2:
        Input: nums = [-1,-100,3,99], k = 2
        Output: [3,99,-1,-100]
        Explanation:
            rotate 1 steps to the right: [99,-1,-100,3]
            rotate 2 steps to the right: [3,99,-1,-100]
 */
public class Rotate_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        rotate(arr,3);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] nums, int i,int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(k < 0){
            k += nums.length;
        }
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-k-1);
        reverse(nums,0,nums.length-1);

    }
    public void rotate1(int[] nums, int k) {
        int n = nums.length;
        while(k!=0){
            int temp = nums[n];
            for(int i=n-1;i>=0;i--){
                nums[i+1]=nums[i];
            }
            nums[0]=temp;
            k--;
        }
    }
}
