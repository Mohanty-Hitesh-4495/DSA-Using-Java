package Strings;
// 1903. Largest Odd Number in String
// URL=https://leetcode.com/problems/largest-odd-number-in-string/
/* Example 1:
    Input: num = "52"
    Output: "5"
    Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
 */
public class Largest_Odd_Number {
    public static void main(String[] args) {
        String num = "52";
        System.out.println("INPUT : "+num);
        System.out.println("OUTPUT : "+largestOddNumber(num));
    }
    public static String largestOddNumber(String num) {
        String result="";
        for(int i=num.length()-1;i>=0;i--){
            if(Character.getNumericValue(num.charAt(i)) % 2 != 0 )
                return num.substring(0,i+1);
        }
        return result;
    }
}
