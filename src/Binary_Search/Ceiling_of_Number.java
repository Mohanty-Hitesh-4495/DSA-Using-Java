package Binary_Search;
// Binary Search for finding the ceiling of number from an array...
public class Ceiling_of_Number {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 9, 45, 62, 89, 92};
        int target = 62;
        int position = ceiling(arr, target);
        if (position != -1) {
            System.out.println("CEILING = " + arr[position]);
            System.out.println("POSITION = " + position);
        }
        else {
            System.out.println("CEILING OF THE NUMBER IS NOT FOUND :(");
        }
    }

// ceiling method will return the index of the smallest number
// which is greater_or_equal(>=) to the target number...
    static int ceiling(int[] arr,int target) {
        if (target>arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while(start <= end) {
            int mid = start + (end -start)/2;
            if(arr[mid] > target) {
                end = mid-1;
            }
            else if (arr[mid] < target) {
                start = mid+1;
            }
            else {
                return mid+1;
            }
        }
        return start;
    }
}
