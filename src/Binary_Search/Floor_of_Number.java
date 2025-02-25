package Binary_Search;
// Binary Search to find the floor of a number from the array...
public class Floor_of_Number {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,9,45,62,89,92};
        int target = 63;
        int position = findFloor(arr, arr.length, target);
        if(position != -1){
            System.out.println("FLOOR = "+arr[position]);
            System.out.println("POSITION = "+position);
        }
        else{
            System.out.println("FLOOR OF THE NUMBER IS NOT FOUND :(");
        }
    }

//  floor method will return index of a number which is less_or_equal(<=) to the target number...
    static int floor(int[] arr, int n,int target) {
        if (target<arr[0]){
            return -1;
        }
        int start=0;
        int end=n-1;
        while(start <= end) {
            int mid = start + (end -start)/2;
            if(arr[mid] > target) {
                end = mid-1;
            }
            else if (arr[mid] < target) {
                start = mid+1;
            }
            else {
                return mid-1;
            }
        }
        return end;
    }

    public static int findFloor(int[] a,int n, int x) {
        int low = 0;
        int high = n - 1;
        int ans = -1;

        if (x < a[low])
            return ans;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] <= x) {
                ans = mid;
                low = mid + 1;   // look for smaller index on the left
            } else {
                high = mid - 1;  // look on the right
            }
        }
        return ans;
    }
}
