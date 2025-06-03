package Binary_Search;
import java.util.*;

public class FloorAndCeilOfNumber {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        int[] ans = new int[2];
        ans[0] = findFloor(a,n,x);
        ans[1] = findCeil(a,n,x);
        return ans;
    }

    public static int findCeil(int[] a,int n, int x) {
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] >= x) {
                ans = a[mid];
                high = mid - 1;   // look for smaller index on the left
            } else {
                low = mid + 1;  // look on the right
            }
        }
        return ans;
    }

    public static int findFloor(int[] a,int n, int x) {
        int low = 0;
        int high = n-1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] <= x) {
                ans = a[mid];
                low = mid + 1;   // look for smaller index on the left
            } else {
                high = mid - 1;  // look on the right
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 10, 15, 20};
        int x = 12;
        int[] result = getFloorAndCeil(arr, arr.length, x);
        System.out.println("Floor: " + result[0] + ", Ceil: " + result[1]);
    }
}
