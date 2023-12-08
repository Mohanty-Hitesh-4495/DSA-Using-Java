package Array;
import java.util.Arrays;
//  26. Remove Duplicates from Sorted Basic_Fundamentals.Array
//  URL=https://leetcode.com/problems/remove-duplicates-from-sorted-array/
/*  Example 2:
    Input: nums = [0,0,1,1,1,2,2,3,3,4]
    Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
    Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
    It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class Remove_Duplicate {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,1,1,1,2,2,3,3,3,3,3,3,3,4,4,4,5,5,5,5,6,6,6,6,7,7,7};
        System.out.println("INPUT = "+ Arrays.toString(nums));
        int k=removeDuplicates(nums);
        System.out.print("OUTPUT = [");
        for (int i = 0; i< k; i++){
            System.out.print(nums[i]);
            if (i< k -1)
                System.out.print(",");
        }
        System.out.print("]");
    }
    public static int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[j]!=nums[i]){
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1;
    }
}
