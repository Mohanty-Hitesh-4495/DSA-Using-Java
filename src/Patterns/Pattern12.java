package Patterns;

/*
         * * * * *
          * * * *
           * * *
            * *
             *
             *
            * *
           * * *
          * * * *
         * * * * *
 */

public class Pattern12  {
    public static void main(String[] args) {
        int str=5;
        for(int row=1;row<=10;row++){
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
            if(row<=5){
                str--;
            } else if(str == 0){
                str=1;
            }
            else {
                str++;
            }
            System.out.println();
        }

    }
}
