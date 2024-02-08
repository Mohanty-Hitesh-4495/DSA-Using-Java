package Strings;

// 389. Find the Difference
// https://leetcode.com/problems/first-unique-character-in-a-string/
/*
Example 1:
    Input: s = "abcd", t = "abcde"
    Output: "e"
    Explanation: 'e' is the letter that was added.
Example 2:
    Input: s = "", t = "y"
    Output: "y"
 */
public class First_Unique_Character {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("gandhiinstitutefortechnology"));
    }
    public static int firstUniqChar(String s) {
        int[] count = new int[26];
        for(char ch:s.toCharArray()){
            count[ch-'a']++;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(count[ch-'a']==1)
                return i;
        }
        return -1;
    }

}
