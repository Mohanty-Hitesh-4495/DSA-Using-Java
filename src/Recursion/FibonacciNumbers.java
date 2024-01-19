package Recursion;
// 0,1,1,2,3,5,8,13,21
public class FibonacciNumbers {
    public static void main(String[] args) {
        // printing 10 Fibonacci numbers
        for(int i=0;i<10;i++){
            System.out.println(fibonacciNum(i));
        }
    }
    public static int fibonacciNum(int num){
        if(num==0)
            return 0;
        if(num==1)
            return 1;
        return fibonacciNum(num-1)+fibonacciNum(num-2);
    }
}
