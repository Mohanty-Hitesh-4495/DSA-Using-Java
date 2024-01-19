package Patterns;
/*
        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *
 */
public class Pattern5 {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            int j=1;
            if(i<=5){
                while(j<=i){
                    System.out.print("*");
                    j++;
                }
                System.out.println();
            } else {
                while(j<=10-i){
                    System.out.print("*");
                    j++;
                }
                System.out.println();
            }
        }
    }
}
