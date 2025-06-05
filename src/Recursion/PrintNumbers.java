package Recursion;

public class PrintNumbers {
    static int count = 0;
    public static void main(String[] args) {
        printNumbers();
    }
    // Recursive code for printing numbers from 0 to 3
    static void printNumbers() {
        if (count>3) // base condition
            return;
        System.out.println(count);
        count++; // count increment
        printNumbers();
    }
}
