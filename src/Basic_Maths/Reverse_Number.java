package Basic_Maths;
/*
Problem Statement: Given an integer N return the reverse of the given number.
Note: If a number has trailing zeros, then its reverse will not include them.
For e.g., reverse of 10400 will be 401 instead of 00401.
*/
public class Reverse_Number {
    public static void main(String[] args) {
        int num1 = 123;
        int num2 = 79464;
        int num3 = 97766;
        System.out.println("Original: "+num1+"\nReverse: "+getReverse(num1));
        System.out.println("Original: "+num2+"\nReverse: "+getReverse(num2));
        System.out.println("Original: "+num3+"\nReverse: "+getReverse(num3));
    }

    static int getReverse(int num){
        int reverse = 0;
        while(num!=0){
            int digit = num%10;
            reverse = reverse*10 + digit;
            num/=10;
        }
        return reverse;
    }
}
