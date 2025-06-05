package Binary_Search.Questions;
import java.util.ArrayList;
import java.util.Arrays;
/*  Find out how many times the array is rotated
    Input : nums = [4, 5, 6, 7, 0, 1, 2, 3]
    Output: 4
    Explanation: The original array should be [0, 1, 2, 3, 4, 5, 6, 7].
    So, we can notice that the array has been rotated 4 times.
 */

public class FindNumberOfRotation {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 0, 1, 2, 3));
        int rotation = findKRotation(arr);
        System.out.println("No. of Rotation: " + rotation);
    }
    public static int findKRotation(ArrayList<Integer> nums) {
        int low = 0;
        int high = nums.size() - 1;
        int ans = Integer.MAX_VALUE;
        int index = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            // If left part is sorted
            if (nums.get(low) <= nums.get(mid)) {
                if (nums.get(low) < ans) {
                    ans = nums.get(low);
                    index = low;
                }
                low = mid + 1;
            } // else right part is sorted
            else {
                if (nums.get(mid) < ans) {
                    ans = nums.get(mid);
                    index = mid;
                }
                high = mid - 1;
            }
        }
        return index; // number of rotation of sorted array.
    }
}
