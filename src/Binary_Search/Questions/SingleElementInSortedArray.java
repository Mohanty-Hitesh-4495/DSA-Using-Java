package Binary_Search.Questions;
/*
    540. Single Element in a Sorted Array
    URL=https://leetcode.com/problems/single-element-in-a-sorted-array/

    Example 1:
    Input: nums = [1,1,2,3,3,4,4,8,8]
    Output: 2

    Example 2:
    Input: nums = [3,3,7,7,10,11,11]
    Output: 10

    PS:Your solution must run in O(log n) time and O(1) space.
 */

public class SingleElementInSortedArray {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5, 5};  // Example input
        int unique = singleNonDuplicate(nums);
        System.out.println("Single non-duplicate element is: " + unique);
    }

    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        // Edge cases
        if (n == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n - 1] != nums[n - 2]) return nums[n - 1];

        int low = 1, high = n - 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // find the unique element
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            // Decide which half to eliminate
            // eliminate left half
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 == 1 && nums[mid] == nums[mid - 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;  // Should not reach here if input is valid
    }
}
