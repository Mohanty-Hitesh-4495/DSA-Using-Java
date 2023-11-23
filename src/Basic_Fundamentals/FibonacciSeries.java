package Basic_Fundamentals;

import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        int a=0,b=1,n;
        int count=2;
        System.out.println("ENTER THE NUMBER TILL YOU WANT TO PRINT THE FIBONACCI SERIES = ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        System.out.println("**** FIBONACCI SERIES ****");
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(count<=n){
            b=b+a;
            a=b-a;
            count++;
            System.out.print(b+" ");
        in.close();
        }
    }
}
