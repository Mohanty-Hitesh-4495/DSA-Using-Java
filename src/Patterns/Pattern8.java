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
        int star = 1;
        for(int i=1;i<=5;i++){
                int Space=(9-star)/2;
                while(Space>0){
                    System.out.print(" ");
                    Space--;
                }
                int str=star;
                while(str>0){
                    System.out.print("*");
                    str--;
                }
            System.out.println();
            star+=2;
        }
    }
}
