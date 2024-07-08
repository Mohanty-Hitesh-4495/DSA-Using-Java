package Basic_Maths;
import java.util.Scanner;

// https://www.geeksforgeeks.org/problems/count-digits5716/1
/*
Given a number n. Count the number of digits in n which evenly divide n.
Return an integer, total number of digits of n which divides n evenly.
Note :- Evenly divides means whether n is divisible by a digit i.e. leaves a remainder 0 when divided.
 */

public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Total number of digits of "+ num +" which divides num evenly: "+evenlyDivides(num));

    }
    static int evenlyDivides(int N){
        int num = N;
        int count = 0;
        while(num!=0){
            int rem = num%10;
            if(rem!=0 && N%rem==0)
                count++;
            num/=10;
        }
        return count;
    }
}
