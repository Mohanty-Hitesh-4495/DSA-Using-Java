package Patterns;
/*
     * * * * *
      * * * *
       * * *
        * *
         *
 */
public class Pattern11 {
    public static void main(String[] args) {
        int str=5;
        for(int i=1;i<=5;i++){
            int space=(5-str);
            while(space>0){
                System.out.print(" ");
                space--;
            }
            int star=str;
            while(star>0){
                System.out.print("* ");
                star--;
            }
            System.out.println();
            str--;
        }
    }
}
