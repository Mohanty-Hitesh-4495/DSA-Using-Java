package Basic_Maths;

import java.util.Scanner;

public class Kth_Digit_of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        System.out.println("Enter the digit you want: ");
        int k = sc.nextInt();

        int temp = num;
        int length = (int)Math.log10(num)+1;
        if (k<=length) {
            for (int i = 0; i < length - k; i++) {
                temp /= 10;
            }
            int knum = temp%10;
            System.out.println("Kth Digit: "+ knum);
        }else {
            System.out.println("Invalid position !");
        }

    }
}
