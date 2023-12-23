package Strings;

// 13. Roman to Integer
// URL=https://leetcode.com/problems/roman-to-integer/
/* Example:
    Input: s = "MCMXCIV"
    Output: 1994
    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */

public class Roman_To_Integers {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int num=0,ans=0;
        for(int i=s.length()-1;i>=0;i--){
            switch(s.charAt(i)){
                case 'I'-> num=1;case 'V'-> num=5;
                case 'X'-> num=10;
                case 'L'-> num=50;
                case 'C'-> num=100;
                case 'D'-> num=500;
                case 'M'-> num=1000;
                default -> num=0;
            }
            if(4*num<ans)
                ans-=num;
            else
                ans+=num;
        }
        return ans;
    }
}
