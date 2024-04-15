package Array;
import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
import java.util.Collections;
public class Rotate_ArrayList {
    public static void reverse(ArrayList<Integer> arr, int start, int end){
        while (start<end){
            Collections.swap(arr, start, end);
            start++;
            end--;
        }
    }
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k){
        int n = arr.size();
        reverse(arr,0,k-1);
        System.out.println(arr);
        reverse(arr,k,n-1);
        System.out.println(arr);
        reverse(arr,0,n-1);
        System.out.println(arr);
        return arr;
    }
    /* public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
            // Write your code here.
            ArrayList<Integer> rotate = new ArrayList<>();
            for(int i=0;i<k;i++){
                rotate.add(arr.get(i));
            }
           for (int j = k; j < arr.size(); j++) {
                arr.set(j - k, arr.get(j));
            }
            for (int i = 0; i < k; i++) {
                arr.set(arr.size() - k + i, rotate.get(i));
            }
            return arr;
        } */
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(6);
        arr.add(11);
        arr.add(12);
        arr.add(17);
        int k = 4;
        System.out.println(arr);
        ArrayList<Integer> result = rotateArray(arr, k);
        System.out.println(result);
    }

}
