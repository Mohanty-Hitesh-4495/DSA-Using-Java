package Binary_Search.Questions;
//  Find position of an element in a sorted array of infinite numbers
//  https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class Infinite_Array {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 150, 155, 160, 170,564,654,980,999,1000,12659,41654684};
        int target = 155;
        System.out.println("INDEX OF TARGET ELEMENT = "+Answer(arr,target));
    }

//    Answer method check find the range of array where target element can be found
//    then call binarySearch method to get the position of that target element...
    static int Answer(int[] arr,int target){
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;
        // condition for the target to lie in the range
        while (target > arr[end]) {
            int temp = end + 1; // this is my new start
            // double the box value
            // end = previous end + size of box * 2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

//    return index of target element...
    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // answer found
                return mid;
            }
        }
        return -1;
    }
}
