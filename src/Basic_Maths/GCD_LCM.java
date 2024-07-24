package Basic_Maths;
import java.util.Scanner;

/*
   https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1
Given two integers a and b, write a function lcmAndGcd() to compute their LCM and GCD.
The function takes two integers a and b as input and returns a list containing their LCM and GCD.
    Input: a = 5 , b = 10
    Output: 10 5
    Explanation: LCM of 5 and 10 is 10, while thier GCD is 5.
 */

public class GCD_LCM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        Long b = sc.nextLong();
        Long[] gcdlcm = lcmAndGcd(a,b);
        System.out.println("LCM: "+gcdlcm[0]);
        System.out.println("GCD: "+gcdlcm[1]);
    }

    static Long getGCD(Long a, Long b){
        while(a!=0 && b!=0){
            if(a>b) a=a%b;
            else b=b%a;
        }
        return a==0? b : a;
    }

    static Long[] lcmAndGcd(Long A , Long B) {
        Long GCD = getGCD(A,B);
        Long LCM = (A / GCD) * B;

        return new Long[] {LCM,GCD} ;
    }
}