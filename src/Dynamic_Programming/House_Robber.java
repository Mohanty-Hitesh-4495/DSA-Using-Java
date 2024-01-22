package Dynamic_Programming;

// 198. House Robber
// https://leetcode.com/problems/house-robber/description/
/*
    Example 1:
        Input: nums = [1,2,3,1]
        Output: 4
        Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
        Total amount you can rob = 1 + 3 = 4.
 */
public class House_Robber {
    public static void main(String[] args) {
        int[] house = {1,2,3,1};
        int totalMoney = rob(house);
        System.out.println(totalMoney);
    }

    public static int rob(int[] nums) {
        int n = nums.length;

        // Base Cases
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        // Dynamic Programming Initialization
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        // Dynamic Programming Loop
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }

        // Return Result
        return dp[n - 1];
    }
}
