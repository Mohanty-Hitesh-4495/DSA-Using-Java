package Recursion;
// Print your Name N times
public class PrintNameNTimes {
    public static void main(String[] args) {
        int n = 6;
        printNameNTimes(n,1);
    }
    static void printNameNTimes(int n, int i) {
        if(i>n) return;
        System.out.println("Hitesh");
        printNameNTimes(n,i+1);
    }
}
