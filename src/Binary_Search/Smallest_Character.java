package Binary_Search;
// 744. Find The Smallest Letter Greater Than Target
// URL=https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class Smallest_Character {
    public static void main(String[] args) {
        char[] arr={'a','v','w','x','z'};
        char target='z';
        char result= nextGreatestLetter(arr,target);
        System.out.println(result);
    }
//  return the next greatest character of target character present in array...
//  if there is no greater character than the target character then return first index character...
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}

