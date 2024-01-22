package Recursion;
// 326. Power of Three
// https://leetcode.com/problems/power-of-three/description/
/*
    Example 1:
         Input: n = 27
         Output: true
         Explanation: 27 = 33
     Example 2:
        Input: n = 0
        Output: false
        Explanation: There is no x where 3x = 0.
 */
public class Power_Of_Three {
    public static void main(String[] args) {
        int num1 = 27;
        int num2 = 0;
        System.out.println(isPowerOfThree(num1));
        System.out.println(isPowerOfThree(num2));
    }

    public static boolean isPowerOfThree(int n) {
        if(n<=0)
            return false;
        if(n==1)
            return true;
        if(n%3 != 0)
            return false;
        return isPowerOfThree(n/3);
    }
}
