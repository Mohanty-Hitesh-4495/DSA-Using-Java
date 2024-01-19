package Patterns;

/*
        *********
         *******
          *****
           ***
            *
 */
public class Pattern9 {
    public static void main(String[] args) {
        int str=9;
        for(int i=1;i<=5;i++){
            int space=(9-str)/2;
            while(space>0){
                System.out.print(" ");
                space--;
            }
            int star=str;
            while(star>0){
                System.out.print("*");
                star--;
            }
            System.out.println();
            str-=2;
        }
    }
}
