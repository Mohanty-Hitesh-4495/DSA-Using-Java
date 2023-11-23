package Linear_Search;
//  1295. Find Numbers with Even Number of Digits
//  URL=https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class Even_Digits {
    public static void main(String[] args) {
        int[] arr={12,4,852,654,95,13,-8,60,952148,84,-19};
        int count=EvenDigit(arr);
        System.out.println("EVEN DIGITS NUMBERS= "+count);
    }

//findDigits is the method to find the number digits in a number...
    static int findDigits(int num){
        return (int)(Math.log10(num))+1;
    }

//Method to count the number of values having even number of digits...
    static int EvenDigit(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(Even(arr[i])){
                count++;
            }
        }
        return count;
    }

//Method to check whether the number is consist of even digits or not...
    static boolean Even(int a){
        int count=findDigits(a);
        if(count % 2 == 0)
            return true;
        else
            return false;
    }
}
