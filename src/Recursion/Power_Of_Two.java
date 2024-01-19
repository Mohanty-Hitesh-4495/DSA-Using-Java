package Recursion;
// 231. Power of Two
// https://leetcode.com/problems/power-of-two/description/
/*  Example 1:
        Input: n = 1
        Output: true
        Explanation: 20 = 1
    Example 2:
        Input: n = 16
        Output: true
        Explanation: 24 = 16
    Example 3:
        Input: n = 3
        Output: false
 */
public class Power_Of_Two {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(5));
        System.out.println(isPowerOfTwo(91));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(1));
    }

    public static boolean isPowerOfTwo(int n) {
        if(n==0)
            return false;
        if(n==1)
            return true;
        if(n%2 != 0)
            return false;
        return isPowerOfTwo(n/2);
    }
}
