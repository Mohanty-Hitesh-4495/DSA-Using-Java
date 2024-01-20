package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,5,9,12,16,18,19,22,29,35,55};
        int srt = 0;
        int end = arr.length-1;
        System.out.println("Index of Target : "+binarySearch(arr,srt,end,18));
    }

    public static int binarySearch(int[] arr, int srt,int end,int target){
        int mid = srt+(end-srt)/2;
        if(srt>end)
            return -1;
        if(arr[mid]>target)
            return binarySearch(arr,srt,mid-1,target);
        else if(arr[mid]<target)
            return binarySearch(arr,mid+1,end,target);
        else
            return mid;
    }

}
