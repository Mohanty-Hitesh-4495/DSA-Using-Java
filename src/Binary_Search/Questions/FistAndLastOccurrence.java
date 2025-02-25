package Binary_Search.Questions;
import java.util.Arrays;

public class FistAndLastOccurrence {

    public static void main(String[] args) {
        int[] nums = {3,4,13,13,13,20,40};
        int target = 13;
        System.out.println("Occurrence Range of "+target+" in Array: "+ Arrays.toString(searchRange(nums, target)));
    }

    private static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = findFirstIndex(nums, target);
        ans[1] = findLastIndex(nums, target);
        return ans;
    }

    private static int findLastIndex(int[] nums,int target){
        int low = 0;
        int high = nums.length-1;
        int last = -1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(nums[mid] == target){
                last = mid;
                low = mid+1;
            } else if (target < nums[mid]){
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return last;
    }

    private static int findFirstIndex(int[] nums,int target){
        int low = 0;
        int high = nums.length-1;
        int first = -1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(nums[mid] == target){
                first = mid;
                high = mid-1;
            } else if (nums[mid] < target){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return first;
    }
}
