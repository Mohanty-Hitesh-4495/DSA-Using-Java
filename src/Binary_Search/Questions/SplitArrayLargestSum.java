package Binary_Search.Questions;

// https://leetcode.com/problems/split-array-largest-sum/description/
// 410. Split Array Largest Sum

public class SplitArrayLargestSum {

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {7, 2, 5, 10, 8};
        int k1 = 2;
        int result1 = SplitArrayLargestSum.splitArray(nums1, k1);
        System.out.println("Example 1 Output: " + result1);  // Expected: 18

        // Example 2
        int[] nums2 = {1, 2, 3, 4, 5};
        int k2 = 2;
        int result2 = SplitArrayLargestSum.splitArray(nums2, k2);
        System.out.println("Example 2 Output: " + result2);  // Expected: 9
    }

    public static int splitArray(int[] nums, int k) {
        int n = nums.length;
        int low = Integer.MIN_VALUE;
        int high = 0;

        for(int i=0; i<n; i++){
            low = Math.max(low,nums[i]);
            high += nums[i];
        }

        while(low <= high){
            int mid = low+(high-low)/2;
            if(subarrayCount(nums, mid) > k){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return low;
    }

    public static int subarrayCount(int[] nums, int maxSize){
        int n = nums.length;
        int countSubarray = 1;
        int subarraySize = 0;

        for (int i=0; i<n; i++){
            if(subarraySize + nums[i] <= maxSize){
                subarraySize += nums[i];
            } else {
                countSubarray++;
                subarraySize = nums[i];
            }
        }
        return countSubarray;
    }
}
