package Basic_Fundamentals;

// 9. Palindrome Number
// URL=https://leetcode.com/problems/palindrome-number/
// Given an integer x, return true if x is a palindrome and false otherwise.
/* Example 1:
    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.
*/

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int result=0,num=x,c=10;
        if(x<0)
            return false;
        while(x!=0){
            result=result*c+(x%10);
            x/=10;
        }
        return num==result;
    }
    public static void main(String[] args) {
        int num=-15951;
        System.out.println(isPalindrome(num));
    }
}
