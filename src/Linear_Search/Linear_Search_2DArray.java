package Linear_Search;
import java.util.Arrays;
import java.util.Scanner;
// Linear Search Code for a 2D array...
public class Linear_Search_2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {45,86,-12,76},
                {79,36,-2,56},
                {-55,85,29,27}
        };
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE TARGET VALUE: ");
        int target=sc.nextInt();
        int[] pos=search(arr,target);
        if(pos[0]!=-1)
            System.out.println("POSITION OF TARGET VALUE [row,column]= "+Arrays.toString(pos));
        else
            System.out.println("TARGET VALUE IS NOT FOUND!!!");
        int[] max_pos=search1(arr);
        System.out.println("MAXIMUM VALUE = "+arr[max_pos[0]][max_pos[1]]);
        System.out.println("POSITION OF MAXIMUM VALUE [row,column]= "+Arrays.toString(max_pos));
        int[] min_pos=search2(arr);
        System.out.println("MINIMUM VALUE = "+arr[min_pos[0]][min_pos[1]]);
        System.out.println("POSITION OF MINIMUM VALUE [row,column]= "+Arrays.toString(min_pos));
    }


//search method will find the position of target value in the array...
    static int[] search(int[][] arr,int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }


//search1 method will find the largest value from the array...
    static int[] search1(int[][] arr){
        int max=arr[0][0],r=0,c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(max < arr[i][j]){
                    max=arr[i][j];
                    r=i;
                    c=j;
                }
            }
        }
        return new int[]{r, c};
    }


//search2 method is used to find out the smallest value from the array...
static int[] search2(int[][] arr){
    int min=arr[0][0],r=0,c=0;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(min > arr[i][j]){
                min=arr[i][j];
                r=i;
                c=j;
            }
        }
    }
    return new int[]{r, c};
}
}
