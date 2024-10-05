package Array;
// Brute Force Solution...
public class Longest_Consequtive_Sequence {
    public static boolean ls(int[] nums, int target){
        for (int num : nums) {
            if (num == target)
                return true;
        }
        return false;
    }
    public static int longestConsecutive(int[] nums) {
        int longest = 0;
        for (int num : nums) {
            int x = num;
            int count = 1;
            while (ls(nums, x + 1)) {
                x += 1;
                count += 1;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}
