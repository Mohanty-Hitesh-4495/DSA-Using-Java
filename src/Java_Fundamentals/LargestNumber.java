package Java_Fundamentals;

import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
        int a,b,c,max;
        Scanner in=new Scanner(System.in);
        System.out.print("ENTER THE 1ST NUMBER = ");
        a=in.nextInt();
        System.out.print("ENTER THE 2ND NUMBER = ");
        b=in.nextInt();
        System.out.print("ENTER THE 3RD NUMBER = ");
        c=in.nextInt();
        if(a>b) {
            if (a > c)
                max = a;
            else
                max = c;
        }
        else {
            if (b > c)
                max = b;
            else
                max = c;
        }
        System.out.println("THE LARGEST NUMBER AMONG THREE = "+max);
    in.close();
    }
}
