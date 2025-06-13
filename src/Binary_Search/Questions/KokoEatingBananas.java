package Binary_Search.Questions;

/*
875. Koko Eating Bananas
https://leetcode.com/problems/koko-eating-bananas/description/
Example 1:
Input: piles = [3,6,7,11], h = 8
Output: 4

Example 2:
Input: piles = [30,11,23,4,20], h = 5
Output: 30
 */

public class KokoEatingBananas {
    public static void main(String[] args) {
        // Sample input: piles of bananas and total hours h
        int[] piles = {3, 6, 7, 11};
        int h = 8;

        int result = minEatingSpeed(piles, h);
        System.out.println("Minimum eating speed Koko needs: " + result);
    }

    public static int minEatingSpeed(int[] piles, int h) {
        // Search space: minimum possible speed is 1, maximum is the largest pile
        int low = 1, high = findmax(piles);

        // Binary search to find the minimum valid eating speed
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int totalHours = calculateTotalHours(piles, mid);

            if (totalHours <= h)
                high = mid - 1; // try lower speed
            else
                low = mid + 1; // increase speed
        }
        return low;
    }

    // Helper function to find the maximum pile value
    private static int findmax(int[] piles) {
        int max = Integer.MIN_VALUE;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }

    public static int calculateTotalHours(int[] piles, int k) {
        int totalHours = 0;
        for (int pile : piles) {
            // Koko eats 'k' bananas per hour, so use ceiling to round up partial hours
            totalHours += (int) Math.ceil((double) pile / k);
        }
        return totalHours;
    }
}

