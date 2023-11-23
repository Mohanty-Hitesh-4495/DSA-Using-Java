package Linear_Search;
// Using Linear Search finding the smallest and largest number from the list...
public class Linear_Search_MinMax {
    public static void main(String[] args) {
        int[] arr={45,85,-21,65,-75,35,15,95,0,-78,68,94,-28,37,19};
        int pos=search(arr);
        System.out.println("MINIMUM VALUE = "+arr[pos]);
        System.out.println("POSITION = "+(pos+1));
    }


//search is a method used to find out the smallest value from the array...
    static int search(int[] arr){
        int min=arr[0],pos = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                pos=i;
            }
        }
        return pos;
    }


//search1 is a method used to find out the largest value from the array...
    static int search1(int[] arr){
        int max=arr[0],pos = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                pos=i;
            }
        }
        return pos;
    }
}
