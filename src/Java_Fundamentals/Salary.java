package Java_Fundamentals;

import java.util.*;
 public class  Salary{
    public static void main(String[] args) {
        float salary,bonus;
        Scanner Sc=new Scanner(System.in);
        System.out.print("ENTER THE SALARY OF EMPLOYEE = ");
        salary=Sc.nextFloat();
        if(salary>=10000){
            bonus=2000;
        }
        else{
            bonus=1000;
        }
        System.out.println("BONUS OF EMPLOYEE = "+bonus);
        System.out.println("TOTAL SALARY OF EMPLOYEE = "+(salary+bonus));
    Sc.close();

    }
}