package Binary_Search;
import java.util.Scanner;

// 69. Sqrt(x)
// URL=https://leetcode.com/problems/sqrtx/
/*Example 2:
        Input: x = 8
        Output: 2
        Explanation: The square root of 8 is 2.82842...,
        and since we round it down to the nearest integer, 2 is returned.
*/

public class SquareRoot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Square root of "+x+" is "+mySqrt(x));
    }

    public static int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        }
        int start = 1;
        int end = x;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if((long) mid*mid > (long) x) {
                end = mid - 1;
            } else if((long) mid*mid < (long) x){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return Math.round(end);
    }

}
