package Binary_Search;
//      Order Agnostic Binary Search Code...
public class Order_AgnosticBinarySearch {
        public static void main(String[] args) {
                int[] arr = {555,55,5,0,-5,-55,-555,-5555};
                int target = 55;
                int pos = binarySearch(arr,target);
                System.out.println(pos);
        }

//      binarySearch will check whether the array is sorted in Ascending or descending oder...
//      And then find the position of target number and return it or else return -1.
        static int binarySearch(int [] arr,int target){
                int start = 0;
                int end = arr.length-1;
                boolean IsAscending = arr[start] < arr[end];//
                while (start <= end){
                        int mid = start + (end - start)/2;
                        if(arr[mid] == target){
                                return mid;
                        }
                        if(IsAscending){
                                if(target < arr[mid])
                                        end = mid - 1;
                                else
                                        start = mid + 1;
                        }
                        else {
                                if(target < arr[mid])
                                        start = mid + 1;
                                else
                                        end = mid - 1;
                        }
                }
                return -1;
        }
}
