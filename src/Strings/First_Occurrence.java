package Strings;

// 28. Find the Index of the First Occurrence in a String
// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
/*
    Example 1:
        Input: haystack = "sadbutsad", needle = "sad"
        Output: 0
        Explanation: "sad" occurs at index 0 and 6.
        The first occurrence is at index 0, so we return 0.
    Example 2:
        Input: haystack = "leetcode", needle = "leeto"
        Output: -1
        Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */
public class First_Occurrence {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println("First Occurrence index = "+strStr(haystack,needle));
    }

    public static int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length())
            return -1;
        int n=needle.length();
        for(int i=0;i<haystack.length()-n+1;i++){
            if(haystack.substring(i,i+n).equals(needle))
                return i;
        }
        return -1;
    }
}
