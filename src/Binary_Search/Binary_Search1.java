package Binary_Search;
// Binary Search For a Sorted Basic_Fundamentals.Array in Ascending order....
public class Binary_Search1 {
    public static void main(String[] args) {
        int[] arr = {-149,-52,-44,-12,0,5,78,965,1598,4563};
        int target = 965;
        int position = binarySearch(arr,target);
        if(position != -1)
            System.out.println("INDEX OF TARGET = "+position);
        else
            System.out.println("NUMBER NOT FOUND!!!");
    }

    // return index of target element.
    // else return -1.
    static int binarySearch (int[] arr,int target) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
                int mid = start + (end - start) / 2;
                if (target < arr[mid]){
                    end = mid-1;
                }
                else if (target > arr[mid]){
                    start = mid + 1;
                }
                else{
                    return mid;
                }
        }
        return -1;
    }
}
