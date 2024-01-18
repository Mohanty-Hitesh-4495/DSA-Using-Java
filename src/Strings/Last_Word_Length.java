package Strings;

// 58. Length of Last Word
// https://leetcode.com/problems/length-of-last-word/description/
/*  Example 1:
        Input: s = "Hello World"
        Output: 5
        Explanation: The last word is "World" with length 5.
    Example 2:
        Input: s = "   fly me   to   the moon  "
        Output: 4
        Explanation: The last word is "moon" with length 4.
 */
public class Last_Word_Length {
    public static void main(String[] args) {
        String str = "fsja hfhjd fjsdbf bjsad jvhbsjk";
        int length = lengthOfLastWord(str);
        System.out.println("Length of last word : "+length);
    }

    public static int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr[arr.length-1].length();
    }
}
