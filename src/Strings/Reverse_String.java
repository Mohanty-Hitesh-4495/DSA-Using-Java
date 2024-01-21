package Strings;

import java.util.Arrays;

// 344. Reverse String
//https://leetcode.com/problems/reverse-string/description/
/*  Example 1:
        Input: s = ["h","e","l","l","o"]
        Output: ["o","l","l","e","h"]
    Example 2:
        Input: s = ["H","a","n","n","a","h"]
        Output: ["h","a","n","n","a","H"]
 */

public class Reverse_String {
    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        String str = "Hitesh Mohanty";
        char[] arr = str.toCharArray();
        System.out.println("Before Reverse ");
        System.out.println(Arrays.toString(arr));
        reverseString(arr);
        System.out.println("After Reverse ");
        System.out.println(Arrays.toString(arr));
    }
}
