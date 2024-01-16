package Array;

// 268. Missing Number
// URL=https://leetcode.com/problems/missing-number/
/* Example 1:
    Input: nums = [3,0,1]
    Output: 2
    Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
    2 is the missing number in the range since it does not appear in nums.
 */
public class Missing_Number {

    public static void main(String[] args) {
        int [] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<=nums.length;i++){
            sum+=i;
        }
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }

}
