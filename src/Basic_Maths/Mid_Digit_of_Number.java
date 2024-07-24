package Basic_Maths;

import java.util.Scanner;

public class Mid_Digit_of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int len = (int) Math.log10(num)+1;
        int mid = 0;
        if (len % 2 != 0){
            mid = len/2;
            for (int i=0;i<mid;i++){
                num /=10;
            }
            mid = num%10;
            System.out.println("mid : "+mid);
        } else {
            System.out.println("number is having even digits...");
        }

    }
}
