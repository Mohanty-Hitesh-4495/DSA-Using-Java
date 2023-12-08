package Sorting;
// 4. Median of Two Sorted Arrays
// URL=https://leetcode.com/problems/median-of-two-sorted-arrays/
/*
Example:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
 */
public class Divide_and_Conquer {
    public static void main(String[] args) {
        int [] arr = {1,5,9,12,16,17};
        int [] arr2 = {2,3,4,10,11,15};
        System.out.println("Median = "+findMedianSortedArrays(arr,arr2));
    }
    static public double findMedianSortedArrays(int[] arr, int[] arr2) {
        return merge(arr,arr2);
    }
    static double merge (int[] arr,int[] arr2){
        int L1=arr.length;
        int L2=arr2.length;
        int[] M=new int[(L1+L2)];
        int i = 0, j = 0;
        int k = 0;
        while (i < L1 && j < L2) {
            if (arr[i] <= arr2[j]) {
                M[k] = arr[i];
                i++;
            }
            else {
                M[k] = arr2[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements of L[] if any
        while (i < L1) {
            M[k] = arr[i];
            i++;
            k++;
        }
        // Copy remaining elements of R[] if any
        while (j < L2) {
            M[k] = arr2[j];
            j++;
            k++;
        }
        if((L1+L2)%2==1)
            return M[(L1+L2)/2];
        return ((M[(L1+L2)/2-1]+M[(L1+L2)/2])/2.0);
    }

}
