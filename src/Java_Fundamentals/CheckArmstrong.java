package Java_Fundamentals;

import java.util.Scanner;

public class CheckArmstrong {
        public static void main(String[] args) {
            Scanner num=new Scanner(System.in);
            System.out.print("ENTER THE NUMBER :");
            int n=num.nextInt();
            boolean check=check(n);
            System.out.println(check);
            num.close();
        }
        static boolean check(int num){
           int sum=0,temp=num;
           while(num!=0){
               int n=(num%10)*(num%10)*(num%10);
               sum=sum+n;
               num=num/10;
            }
           if(sum==temp)
               return true;
           else
               return false;
        }
}
