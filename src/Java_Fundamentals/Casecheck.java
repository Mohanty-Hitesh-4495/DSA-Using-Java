package Java_Fundamentals;

import java.util.*;
public class Casecheck {
    public static void main(String[] args) {
        char a;
        System.out.print("ENTER ANY CHARACTER = ");
        Scanner in=new Scanner(System.in);
        a=in.next().trim().charAt(0);
        if(a>='a' && a<='z'){
            System.out.println("ENTERED CHARACTER IS IN LOWERCASE");
        }
        else if(a>='A' && a<='Z'){
            System.out.println("ENTERED CHARACTER IS IN UPPERCASE");
        }
        else{
            System.out.println("INVALID INPUT");
        }
        in.close();
    }
}
