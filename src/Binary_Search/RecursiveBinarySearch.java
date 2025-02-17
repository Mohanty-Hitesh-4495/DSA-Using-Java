package Binary_Search;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] nums= {1,20,35,47,51,63,76,88,94};
        int low = 0;
        int high = nums.length-1;
        System.out.println("Recursive Binary Search Algorithm");
        System.out.println("Index of 56: " + binarySearch(nums,56, low, high));
        System.out.println("Index of 63: " + binarySearch(nums,63, low, high));
        System.out.println("Index of 20: " + binarySearch(nums,20, low, high));
        System.out.println("Index of 52: " + binarySearch(nums,52, low, high));
        System.out.println("Index of 88: " + binarySearch(nums,88, low, high));
        System.out.println("Index of 94: " + binarySearch(nums,94, low, high));
    }

    private static int binarySearch(int[] nums, int target, int low, int high){
        if (low > high) return -1;
        int mid = low+(high-low)/2;
        if(nums[mid] > target) return binarySearch(nums,target,low,mid-1);
        else if(nums[mid] < target) return binarySearch(nums,target,mid+1,high);
        else return mid;
    }

}
