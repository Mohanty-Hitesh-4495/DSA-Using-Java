package Binary_Search;

public class Rotation_Count {
    public static void main(String[] args) {
        int[] arr = {11,11,11,11,12,13,13,13,14,15,16,17,1,2,3,4,5,6,7,8,9,10,11};// rotated array
        int ans= findRotation(arr);
        System.out.println(ans);
    }
//  return number of rotation in array...
    static int findRotation(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[start]>arr[start+1]){// check if first element is peak element then
                return start+1;//return 1 number of rotation
            }
            if(start < end && arr[mid]>arr[mid+1]){
                return mid+1;
            }
            if (start < end && arr[mid]<arr[mid-1]){
                return mid;
            }
            if(arr[start] < arr[mid]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return 0;
    }
}
