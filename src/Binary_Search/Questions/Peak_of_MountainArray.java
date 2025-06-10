package Binary_Search.Questions;
//  162. Find Peak Element
//  URL=https://leetcode.com/problems/find-peak-element/
//  852. Peak Index in a Mountain Basic_Fundamentals.Array
//  URL=https://leetcode.com/problems/peak-index-in-a-mountain-array/
/*  Example:
    Input: arr = [0,10,5,2]
    Output: 1
 */
public class Peak_of_MountainArray {
    public static void main(String[] args) {
        int[] arr = {0,10,15,20,25,13,10,5,2};
        int peak1 = peakIndexInMountainArray(arr);
        int peak2 = peakIndexInMountainArray2(arr);
        System.out.println(peak1);
        System.out.println(peak2);
    }
    // return the index of peak element of a mountain array...
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){// you are in decreasing part of array
                // mid may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            }
            else{// you are in increasing part of array
                start = mid + 1;// because we know mid+1 > mid
            }
        }
        return start;
    }

    private static int peakIndexInMountainArray2(int[] nums) {
        int n = nums.length;
        if (n==1) return 0;
        if (nums[0] > nums[1]) return 0;
        if (nums[n-1] > nums[n-2]) return n-1;
        int low = 1, high = n-2;
        while(low<=high){
            int mid = low + (high-low) / 2;
            if (nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
            else if (nums[mid]>nums[mid-1] && nums[mid]<nums[mid+1]) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
}
