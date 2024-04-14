package Array;
/*
https://www.naukri.com/code360/problems/remove-duplicates-from-sorted-array_1102307?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems&leftPanelTabValue=PROBLEM
Problem statement:
    You are given a sorted integer array 'arr' of size 'n'.
    You need to remove the duplicates from the array such that each element appears only once.
    Return the length of this new array.
For example:
    'n' = 5, 'arr' = [1 2 2 2 3].
    The new array will be [1 2 3].
    So our answer is 3.
 */
public class Remove_Duplicates {
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        int j=0;
        for (int i=1;i<n;i++){
            if (arr[i]!=arr[j]){
                arr[j+1]=arr[i];
                j+=1;
            }
        }
        return j+1;
    }
}
