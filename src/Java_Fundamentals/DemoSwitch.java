package Java_Fundamentals;

import java.util.*;
public class DemoSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day;
        System.out.print("ENTER THE NUMBER OF DAY...= ");
        day=sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("MONDAY");
            case 2 -> System.out.println("TUESDAY");
            case 3 -> System.out.println("WEDNESDAY");
            case 4 -> System.out.println("THURSDAY");
            case 5 -> System.out.println("FRIDAY");
            case 6 -> System.out.println("SATURDAY");
            case 7 -> System.out.println("SUNDAY");
            default -> System.out.println("ENTER THE VALID DAY...");
        }
        sc.close();
    }
}

