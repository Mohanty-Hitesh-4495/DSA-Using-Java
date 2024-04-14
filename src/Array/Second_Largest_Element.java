package Array;
import java.util.Arrays;

/*
https://www.naukri.com/code360/problems/ninja-and-the-second-order-elements_6581960?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
Problem statement
    You have been given an array ‘a’ of ‘n’ unique non-negative integers.
    Find the second largest and second smallest element from the array.
    Return the two elements (second largest and second smallest) as another array of size 2.
Example :
    Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
    Output: [4, 2]
    The second-largest element after 5 is 4, and the second smallest element after 1 is 2.
 */

public class Second_Largest_Element {
    public static int[] getSecondOrderElements(int n, int[] a) {
        // Write your code here.
        int max = a[0];
        int min = a[0];
        int slargest = Integer.MIN_VALUE;
        int ssmallest = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                slargest = max;
                max = a[i];
            } else if (a[i] < max && a[i] > slargest)
                slargest = a[i];
        }
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                ssmallest = min;
                min = a[i];
            } else if (a[i] != min && a[i] < ssmallest)
                ssmallest = a[i];
        }
        return new int[]{slargest, ssmallest};
    }

    public static void main(String[] args) {
        int[] arr = {4,91,3,15,7,1,6,12,48,10};
        int[] ans = getSecondOrderElements(arr.length,arr);
        System.out.println("[Second-Largest,Second-Smallest] : "+Arrays.toString(ans));
    }
}