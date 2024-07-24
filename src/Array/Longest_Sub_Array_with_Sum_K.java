package Array;
/*
    Longest Sub-Array with Sum K: https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=longest-sub-array-with-sum-k

    Given an array arr containing n integers and an integer k.
    Your task is to find the length of the longest Sub-Array with the sum of the elements equal to the given value k.

    Example:
    Input : arr[] = {-1, 2, 3}, k = 6
    Output : 0
    Explanation: There is no such sub-array with sum 6.
 */

import java.util.HashMap;

public class Longest_Sub_Array_with_Sum_K {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int maxlen = lenOfLongSubarr(arr,k);
        System.out.println("Output : "+maxlen);
    }

    public static int lenOfLongSubarr(int[] num,int k){
        int n = num.length;

        HashMap <Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxlen = 0;

        for(int i=0;i<n;i++){
            sum+=num[i];
            if(sum == k){
                maxlen = i+1;
            }
            if (map.containsKey(sum-k)){
                maxlen = Math.max(maxlen,i- map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxlen;
    }
}
