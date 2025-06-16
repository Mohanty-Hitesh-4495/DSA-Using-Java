package Binary_Search.Questions;
import java.util.Arrays;

// https://takeuforward.org/plus/dsa/problems/aggressive-cows
// Aggressive Cows Problem

public class AggressiveCows {

    public static void main(String[] args) {

        // Example 1
        int[] stalls1 = {0, 3, 4, 7, 10, 9};
        int cows1 = 4;
        int result1 = aggressiveCows(stalls1, cows1);
        System.out.println("Example 1 Output: " + result1);  // Expected: 3

        // Example 2
        int[] stalls2 = {4, 2, 1, 3, 6};
        int cows2 = 2;
        int result2 = aggressiveCows(stalls2, cows2);
        System.out.println("Example 2 Output: " + result2);  // Expected: 5
    }

    public static int aggressiveCows(int[] stalls, int k) {
        int n=stalls.length;
        //sort the stalls[]:
        Arrays.sort(stalls);

        int low = 1;
        int high = stalls[n-1]-stalls[0];

        //apply binary search:
        while(low <= high){
            int mid = low+(high-low)/2;
            if(canBePlaced(stalls, mid, k)){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return high;
    }

    public static boolean canBePlaced(int[] stalls, int distance, int cows){
        int n = stalls.length; // size of array
        int countCow = 1; // no. of cows placed
        int lastPlaced = stalls[0]; // position of last placed cow.
        for (int i=1; i<n; i++){
            if(stalls[i]-lastPlaced >= distance){
                countCow++; // place next cow.
                lastPlaced = stalls[i]; // update the last location.
            }
            if(countCow >= cows)
                return true;
        }
        return false;
    }
}

