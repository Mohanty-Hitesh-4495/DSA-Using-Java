package Array;

// 27. Remove Element
// URL=https://leetcode.com/problems/remove-element/
/* Example 2:
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/

import java.util.Arrays;

public class Remove_Element {
    public static void main(String[] args) {
        int [] arr = {0,1,2,2,3,0,4,2};
        int val = 2;
        int size=removeElement(arr,val);
        System.out.println("Remaining elements : "+size);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
