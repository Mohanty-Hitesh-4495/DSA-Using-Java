package Linear_Search;
// Linear Search code for finding the target value within a range of an array...
import java.util.Arrays;
import java.util.Scanner;

public class Linear_Search_InRange {
    public static void main(String[] args) {
        int [] arr={15,68,95,46,69,32,75,56,16,27,91};
        Scanner sc=new Scanner(System.in);
        System.out.println(Arrays.toString(arr));
        System.out.print("ENTER THE ITEM TO BE SEARCHED FROM THE ARRAY: ");
        int item=sc.nextInt();
        System.out.println("ENTER THE RANGE: ");
        int start=sc.nextInt();
        int end=sc.nextInt();
        int loc=search(arr,item,start,end);//calling the linear search method.
        if(loc!=-1)
            System.out.println("ELEMENT FOUND AT "+loc+" POSITION.");
        else
            System.out.println("ELEMENT IS NOT PRESENT IN THE RANGE!!!");
        sc.close();
        }


        //Searching the element from the array and returning the position of that element...
        static int search(int[] arr,int item,int start,int end){
            for(int i=start;i<end;i++){
                if(arr[i]==item){
                    return i+1;//it will return the position of target element.
                }
            }
            return -1;//if the target element is not found then it will return -1.
        }

    }

