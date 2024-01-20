package Recursion;

// Fibonacci Series : 0,1,1,2,3,5,8,13,21

public class FibonacciNumbers {
    public static void main(String[] args) {
        // printing 10 Fibonacci numbers
//        for(int i=0;i<10;i++){
            System.out.println(fibonacciNum(10));
//        }
    }
    public static int fibonacciNum(int num){
        if(num<2)
            return num;
        return fibonacciNum(num-1)+fibonacciNum(num-2);
    }
}
