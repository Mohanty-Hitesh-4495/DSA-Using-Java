package HackerRank;
/*
Design a program to input a number and suffle the digits of a number N
such that all odd digits are placed in ascending order at left side of the number
and all even digits are placed in descending order at right side of the number.

Input Format: 1234567
Output Format: 1357642
Constraints
1 <= N < 1000000000
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OddEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;

        if( n<1 || n>1000000000){
            System.out.println("Invalid Input");
            return;
        }
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        while (temp != 0) {
            int digit = temp % 10;
            if(digit % 2 == 0) {
                even.add(digit);
            } else {
                odd.add(digit);
            }
            temp = temp / 10;
        }
        Collections.sort(odd);
        Collections.sort(even,Collections.reverseOrder());

        StringBuilder ans = new StringBuilder();
        for (Integer integer : odd) {
            ans.append(integer);
        }
        for(Integer integer : even){
            ans.append(integer);
        }
        System.out.println(ans.toString());
    }
}
