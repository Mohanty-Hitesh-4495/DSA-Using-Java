package Patterns;

/*
         *
        ***
       *****
      *******
     *********
 */

public class Pattern8 {
    public static void main(String[] args) {
        String str = " ";
        for(int i=1; i<=5; i++){
            int space = 5-i;
            for(int k=space; k>0; k--)
                System.out.print(str);
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
