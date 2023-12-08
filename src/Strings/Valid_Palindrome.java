package Strings;
// 125. Valid Palindrome
// URL=https://leetcode.com/problems/valid-palindrome/
/*
Example 1:
    Input: s = "A man, a plan, a canal: Panama"
    Output: true
    Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:
    Input: s = "race a car"
    Output: false
    Explanation: "raceacar" is not a palindrome.
 */
public class Valid_Palindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String s) {
        int start=0,end=s.length()-1;
        while(start<=end){
            if(!Character.isLetterOrDigit(s.charAt(start)))
                start++;
            else if(!Character.isLetterOrDigit(s.charAt(end)))
                end--;
            else {
                if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
                    return false;
                start++;
                end--;
            }
        }
        return true;
    }
}
