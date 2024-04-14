package Array;
/*
https://www.naukri.com/code360/problems/largest-element-in-the-array-largest-element-in-the-array_5026279?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems&leftPanelTabValue=PROBLEM&customSource=studio_nav
Problem statement:
    Given an array ‘arr’ of size ‘n’ find the largest element in the array.
Example:
    Input: 'n' = 5, 'arr' = [1, 2, 3, 4, 5]
    Output: 5
    Explanation: From the array {1, 2, 3, 4, 5}, the largest element is 5.
*/
public class Largest_Element {
    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int largest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(largestElement(arr,arr.length));
    }
}
