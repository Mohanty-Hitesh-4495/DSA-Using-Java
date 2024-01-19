package Patterns;
/*
        *
       * *
      * * *
     * * * *
    * * * * *
 */
public class Pattern10 {
    public static void main(String[] args) {
        int star = 1;
        for(int i=1;i<=5;i++){
            int Space=(5-star);
            while(Space>0){
                System.out.print(" ");
                Space--;
            }
            int str=star;
            while(str>0){
                System.out.print("* ");
                str--;
            }
            System.out.println();
            star++;
        }
    }
}
