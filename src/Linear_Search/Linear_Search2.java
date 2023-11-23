package Linear_Search;
// Linear Search to find a character in  a String...
import java.util.Scanner;

public class Linear_Search2 {
    public static void main(String[] args) {
        String name="Hitesh Mohanty";
        Scanner sc=new Scanner(System.in);
        System.out.println(name);
        System.out.print("ENTER THE CHARACTER TO BE SEARCHED IN THE STRING: ");
        char item=sc.nextLine().charAt(0);
        int loc=search1(name,item);
        if(loc!=-1)
            System.out.println("ELEMENT FOUND AT "+loc+" POSITION.");
        else
            System.out.println("ELEMENT IS NOT PRESENT IN THE ARRAY.");
//        boolean result=search(name,item);
//        if(result){
//            System.out.println("ELEMENT IS PRESENT IN THE ARRAY.");
//        }
//        else{
//            System.out.println("ELEMENT IS NOT PRESENT IN THE ARRAY.");
//        }
        sc.close();
    }


//  search1 will return exact index of target character...or else return -1
    static int search1(String str,char target){
        if(str.length()==0){
            return -1;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return i+1;
            }
        }
        return -1;
    }


//  search return boolean value true/false whether target character is present or not...
    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(target==ch){
                return true;
            }
        }
        return false;
    }
}
