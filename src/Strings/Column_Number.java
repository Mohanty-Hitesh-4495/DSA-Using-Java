package Strings;

// 171. Excel Sheet Column Number
// https://leetcode.com/problems/excel-sheet-column-number/description/
/*  For example:
    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28
    ...
Example :
    Input: columnTitle = "A"
    Output: 1
 */

public class Column_Number {
    public static int titleToNumber(String columnTitle) {
        int sum = 0;
        for(char ch : columnTitle.toCharArray()){
            int num = ch - 'A' +1;
            sum = sum * 26 + num;
        }
        return sum;
    }

    public static void main(String[] args) {
        String columnTitle = "BCC";
        int columnNumber = titleToNumber(columnTitle);
        System.out.println("Column Number : "+columnNumber);
    }
}
