package Binary_Search.Questions;

public class SmallestDivisorGivenThreshold {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;

        int resultBrute = smallestDivisorBruteforce(arr, limit);
        int resultOptimal = smallestDivisorOptimal(arr, limit);

        System.out.println("Smallest Divisor (Brute-force): " + resultBrute);
        System.out.println("Smallest Divisor (Optimal): " + resultOptimal);
    }

    public static int smallestDivisorBruteforce(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for (int j : nums) {
            max = Math.max(max, j);
        }
        for (int d = 1; d <= max; d++) {
            int sum = getSum(nums, d);
            if (sum <= threshold)
                return d;
        }
        return -1;
    }

    public static int smallestDivisorOptimal(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        // applying binary search for smallest divisor
        int low = 1;
        int high = max;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // checks if mid is a valid divisor, then eliminate right part
            if (getSum(nums, mid) <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    // returns total sum after dividing each number by d and taking ceiling
    public static int getSum(int[] nums, int d) {
        int sum = 0;
        for (int num : nums) {
            sum += (int) Math.ceil((double) num / (double) d);
        }
        return sum;
    }
}
