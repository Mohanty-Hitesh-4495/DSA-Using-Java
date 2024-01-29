package Binary_Search.Questions;

//  33. Search in Rotated Sorted Basic_Fundamentals.Array
//  URL=https://leetcode.com/problems/search-in-rotated-sorted-array/
/*  Example:
    Input: nums = [4,5,6,7,0,1,2], target = 0
    Output: 4
 */

public class Search_inRotated_Array1 {
    public static void main(String[] args) {

    }

//  return the index of target element...
    public int search(int[] nums, int target) {
//      int pivot = findPivot(nums);//calling findPivot() method
        int pivot = findPivotWithDuplicates(nums);
        if (pivot == -1) {//if pivot element is not found
            return binarySearch(nums, target, 0, nums.length - 1);//then use normal binary search...
        }
        if (nums[pivot] == target) {//if pivot element is equals to target value then
            return pivot;// return pivot index as answer...
        }
        if (target >= nums[0]) {// if target value is greater than first element
            return binarySearch(nums, target, 0, pivot - 1);//search range will be (0 - pivot-1)
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);//else search space becomes (pivot+1 - end)
    }

//  return index of target element to search method...using basic binary search code...
    public int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

//  findPivot method will search for index of pivot element and return it to search method...
//  this will not work on duplicate elements...
    public int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    //  this method will return pivot element even if there are duplicate elements are present idn array...
    public int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // if elements at middle, start, end are equal
            // then just skip the duplicates
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                if (start < end && arr[start] > arr[start]) {
                    return start;
                }
                start++;
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
