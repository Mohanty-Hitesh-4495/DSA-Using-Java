package Patterns;

/*
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
 */

public class Pattern15 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            int num=(i%2==0)?0:1;
            for(int j=1; j<=i; j++){
                if(num == 0) {
                    System.out.print(num+" ");
                } else {
                    System.out.print(num+" ");
                }
                num = 1 - num;
            }

            System.out.println();
        }
    }
}
