package Binary_Search.Questions;

/*
    1011. Capacity To Ship Packages Within D Days
    https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
 */

public class ShipCapacityInDays {

    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;

        ShipCapacityInDays obj = new ShipCapacityInDays();
        int result = obj.shipWithinDays(weights, days);

        System.out.println("Minimum ship capacity to deliver within " + days + " days: " + result);
    }

    // finds minimum capacity to ship all weights within given days
    public int shipWithinDays(int[] weights, int days) {
        int maxwt = Integer.MIN_VALUE;
        int sumwt = 0;
        for (int weight : weights) {
            maxwt = Math.max(maxwt, weight);
            sumwt += weight;
        }
        // applying binary search to get the least load capacity.
        int low = maxwt, high = sumwt;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (loadCapacity(weights, mid) <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    // Helper function to compute how many days are needed for a given ship capacity
    public int loadCapacity(int[] weights, int capacity) {
        int load = 0, day = 1;
        for (int weight : weights) {
            if (load + weight > capacity) {
                load = weight;
                day++;
            } else {
                load += weight;
            }
        }
        return day;
    }
}
