package Strings;

// 389. Find the Difference
// https://leetcode.com/problems/find-the-difference/description/
/*
Example 1:
    Input: s = "abcd", t = "abcde"
    Output: "e"
    Explanation: 'e' is the letter that was added.
Example 2:
    Input: s = "", t = "y"
    Output: "y"
 */
public class Find_The_Difference {
    public static void main(String[] args) {
        System.out.println(findTheDifference("hitesh","htezhis"));
    }
    public static char findTheDifference(String s, String t) {
        int[] arrs = new int [26];
        int[] arrt = new int [26];
        for(char ch : s.toCharArray()){
            arrs[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            arrt[ch-'a']++;
        }
        char ch='a';
        for(int i=0;i<26;i++){
            if(arrs[i]!=arrt[i]){
                return (char)(i+'a');
            }
        }
        return 'a';
    }
}
