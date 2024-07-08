package Basic_Maths;

// 7. Reverse Integer
// https://leetcode.com/problems/reverse-integer/description/
/*
    Given a signed 32-bit integer x, return x with its digits reversed.
    If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
    Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

    Example 1:
    Input: x = 123
    Output: 321

    Example 2:
    Input: x = -123
    Output: -321
 */

public class Reverse_Integer {
    public static void main(String[] args) {
        int num1 = 123;
        int num2 = -79464;
        int num3 = 97766;
        System.out.println("Original: "+num1+"\nReverse: "+reverse(num1));
        System.out.println("Original: "+num2+"\nReverse: "+reverse(num2));
        System.out.println("Original: "+num3+"\nReverse: "+reverse(num3));
    }

    public static int reverse(int x) {
        long rev = 0;
        int digit;
        while(x!=0){
            digit = x % 10;
            rev = rev*10 + digit;
            x/=10;
            if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
                return 0;
            }
        }
        return (int)rev;
    }
}
