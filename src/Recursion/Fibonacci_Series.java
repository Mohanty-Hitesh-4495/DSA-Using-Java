package Recursion;

// 509. Fibonacci Number
// https://leetcode.com/problems/fibonacci-number/description/
/*  Example 1:
        Input: n = 2
        Output: 1
        Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
    Example 2:
        Input: n = 3
        Output: 2
        Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
 */
public class Fibonacci_Series {
    public static void main(String[] args) {
        int num = 10;
        // Printing 10th fibonacci number
        System.out.println(Fibonacci(num));
        System.out.println(fibonacci(num));
    }
//finding fibonacci number using Recursion
    public static int fibonacci(int num){
        if(num<2)
            return num;
        return fibonacci(num-1)+fibonacci(num-2);
    }

//finding fibonacci number using for loop
    public static int Fibonacci(int num){
        int i = 0;
        int j = 1;
        int sum=0;
        if(num<2)
            return num;
        for(int a=2;a<=num;a++){
            sum=i+j;
            i=j;
            j=sum;
        }
        return sum;
    }
}
