package Linear_Search;
//Linear Search Algorithm...
import java.util.Arrays;
import java.util.Scanner;

public class Linear_Search1 {
    public static void main(String[] args) {
        int [] arr={15,68,95,46,69,32,75,56,16,27,91};
        Scanner sc=new Scanner(System.in);
        System.out.println(Arrays.toString(arr));
        System.out.print("ENTER THE ITEM TO BE SEARCHED FROM THE ARRAY: ");
        int item=sc.nextInt();
        int loc=search(arr,item);//calling the linear search method.
//        boolean result=search1(arr,item);
//        if(result){
//            System.out.println("ELEMENT IS PRESENT IN THE ARRAY.");
//        }
//        else{
//            System.out.println("ELEMENT IS NOT PRESENT IN THE ARRAY.");
//        }
        if(loc!=-1)
            System.out.println("ELEMENT FOUND AT "+loc+" POSITION.");
        else
            System.out.println("ELEMENT IS NOT PRESENT IN THE ARRAY.");
        sc.close();
    }


    //  Searching the element into the array and returning the position of that element...
    static int search(int[] arr,int item){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==item){
                return i+1;//it will return the position of target element.
            }
        }
        return -1;//if the target element is not found then it will return -1.
    }


    //  searching the element in the array,to check whether the target element is present or not...
    static boolean search1(int[] arr,int item){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==item){
                return true;//it will return the true if target element is present in the array.
            }
        }
        return false;//if the target element is not found then it will return false.
    }
}
