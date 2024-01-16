package Sorting;
import java.util.Arrays;

// 88. Merge Sorted Array
// https://leetcode.com/problems/merge-sorted-array/description/

/* Example:
        Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        Output: [1,2,2,3,5,6]
        Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
        The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 */

public class Merge_Sorted_Array {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m=3,n=3;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        int k = 0;
        int[] M = new int[m+n];
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                M[k] = nums1[i];
                i++;
            }
            else {
                M[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            M[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n) {
            M[k] = nums2[j];
            j++;
            k++;
        }
        for(i=0;i<M.length;i++){
            nums1[i]=M[i];
        }
    }
}
