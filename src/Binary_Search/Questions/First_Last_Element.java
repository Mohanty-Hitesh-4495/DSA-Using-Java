package Binary_Search.Questions;
import java.util.Arrays;

//  34. Find First and Last Position of Element in Sorted Basic_Fundamentals.Array
//  URL=https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class First_Last_Element {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,3,3,4,5,6,6,7,7,7,7,8,9};
        int target = 2;
        int[] ans = searchRange(arr,target);
        System.out.println(Arrays.toString(ans));
    }

//    return the first and last occurance index of target number from the array...
    public static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int start=binarySearch(nums,target,true);
        int end=binarySearch(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }

//    return the index of target number...if the number is present...else return -1.
    static int binarySearch (int[] arr,int target,boolean FirstIndex) {
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid-1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else{
                ans = mid;
                if(FirstIndex) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
