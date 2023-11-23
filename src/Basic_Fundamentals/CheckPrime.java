package Basic_Fundamentals;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER :");
        int n=num.nextInt();
        boolean check=check(n);
        System.out.println(check);
    }
    static boolean check(int num){
        if(num<=0){
            return false;
        }
        int c=2;
        while(c<num){
            if(num%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
