package Binary_Search.Questions;

/*
1482. Minimum Number of Days to Make m Bouquets
https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/
https://takeuforward.org/arrays/minimum-days-to-make-m-bouquets/
Example 1:
Input: bloomDay = [1,10,3,10,2], m = 3, k = 1
Output: 3
 */

public class MinimumNumberOfDaysToMakeMBouquets {
    public static void main(String[] args) {
        // Example test case
        int[] bloomDay = {7,7,7,7,12,7,7};
        int m = 2;
        int k = 3;

        int result = minDays(bloomDay, m, k);
        System.out.println("Minimum number of days to make " + m + " bouquets: " + result);
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;

        // not enough flowers to make m bouquets
        if ((long) m * k > n) return -1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            min = Math.min(min, day);
            max = Math.max(max, day);
        }

        int low = min, high = max;
        int result = -1;

        // Try each day from min to max to see when we can make required bouquets
//        for (int day = min; day <= max; day++) {
//            if (mBouquetPossible(bloomDay, day, m, k)) {
//                return day; // First day when it's possible
//            }
//        }
//
//        return -1; // No such day found

        // binary search on days
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mBouquetPossible(bloomDay, mid, m, k)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public static boolean mBouquetPossible(int[] bloomDay, int days, int m, int k) {
        int count = 0, bouquets = 0;

        for (int day : bloomDay) {
            if (day <= days) {
                count++;
                if (count == k) {
                    bouquets++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }
        return bouquets >= m;
    }

}

