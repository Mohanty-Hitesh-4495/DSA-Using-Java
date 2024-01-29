package Java_Fundamentals;

import java.util.*;
public class Occurance {
    public static void main(String[] args) {
        long num;
        int dig,count=0;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER:");
        num=in.nextInt();
        System.out.println("ENTER THE DIGIT OF WHICH YOU WANT TO COUNT THE OCCURANCE ");
        dig=in.nextInt();
        while(num>0){
            long rem=num%10;
            if(rem==dig){
                count++;
            }
            num/=10;
        }
        System.out.println(dig+" OCCURRED "+count+" TIMES IN THAT ENTERED NUMBER");
    in.close();
    }
}
