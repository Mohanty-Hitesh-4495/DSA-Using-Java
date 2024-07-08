package Basic_Maths;
/*
Problem Statement: Given an integer N, return the number of digits in N.
 */
public class Basic_Count_Digit {
    public static void main(String[] args) {
        System.out.println(countDigit(45646));
        System.out.println(countDigit((787165367)));
    }

    static int countDigit(int num){
        return (int) (Math.log10(num)) + 1;
    }
}
