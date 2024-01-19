package Patterns;

/*
         *
        **
       ***
      ****
     *****

 */
public class Pattern6 {
    public static void main(String[] args) {
        for(int i = 1;i<=5;i++){
            int space = 5-i;
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
