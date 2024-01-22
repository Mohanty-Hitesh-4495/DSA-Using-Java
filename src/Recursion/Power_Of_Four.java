package Recursion;

// 342. Power of Four
// https://leetcode.com/problems/power-of-four/description/
/*
    Example 1:
        Input: n = 16
        Output: true
    Example 2:
        Input: n = 5
        Output: false
 */
public class Power_Of_Four {
    public static void main(String[] args) {
        int num1 = 16;
        int num2 = 5;
        System.out.println(isPowerOfFour(num1));
        System.out.println(isPowerOfFour(num2));
    }
    public static boolean isPowerOfFour(int n) {
        if(n<=0)
            return false;
        if(n==1)
            return true;
        if(n%4 != 0)
            return false;
        return isPowerOfFour(n/4);
    }
}
