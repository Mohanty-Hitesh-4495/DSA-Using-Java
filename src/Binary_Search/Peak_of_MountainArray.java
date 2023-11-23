package Binary_Search;
//  852. Peak Index in a Mountain Basic_Fundamentals.Array
//  URL=https://leetcode.com/problems/peak-index-in-a-mountain-array/
/*  Example:
    Input: arr = [0,10,5,2]
    Output: 1
 */
//  162. Find Peak Element
//  URL=https://leetcode.com/problems/find-peak-element/
public class Peak_of_MountainArray {
    public static void main(String[] args) {
        int[] arr = {0,10,15,20,25,13,10,5,2};
        int peak = peakIndexInMountainArray(arr);
        System.out.println(peak);
    }
//return the index of peak element of a mountain array...
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
}
