package Array;

import java.util.*;

// https://www.hackerrank.com/challenges/larrys-array/problem
// Larry's Array
/*
    For example, if :
              A         rotate
        [1,6,5,2,4,3]	[6,5,2]
        [1,5,2,6,4,3]	[5,2,6]
        [1,2,6,5,4,3]	[5,4,3]
        [1,2,6,3,5,4]	[6,3,5]
        [1,2,3,5,6,4]	[5,6,4]
        [1,2,3,4,5,6]
         Output=YES
 */
public class LarrysArray {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(4);
        System.out.println(arr);
        System.out.println(larrysArray(arr));
    }
    public static int map(List<Integer> arr,int index){
        for(Integer value: arr){
            if(value == index+1)
                return arr.indexOf(value);
        }
        return -1;
    }
    public static String larrysArray(List<Integer> A) {

        int index=0;
        while(index<A.size()){

            if(A.get(index) == index+1){
                System.out.println(index);
                index++;
                continue;
            }

            int nxtMinPos = map(A,index);

            if(nxtMinPos==A.size()-1 && index==A.size()-2)
                break;

            if(nxtMinPos - index >=2){
                int temp = A.get(nxtMinPos-2);
                A.set(nxtMinPos-2,A.get(nxtMinPos-1));
                A.set(nxtMinPos-1,A.get(nxtMinPos));
                A.set(nxtMinPos,temp);
                System.out.println("ARR= "+A);
            }

            else if(nxtMinPos-index <= index ){
                int temp = A.get(nxtMinPos+1);
                A.set(nxtMinPos+1,A.get(nxtMinPos-1));
                A.set(nxtMinPos-1,A.get(nxtMinPos));
                A.set(nxtMinPos,temp);
                System.out.println("ARR= "+A);
            }

            else if(nxtMinPos == 1){
                if(nxtMinPos == A.size()-1){
                    return "NO";
                }else {
                    int temp = A.get(0);
                    A.set(0, A.get(nxtMinPos));
                    A.set(nxtMinPos, A.get(nxtMinPos + 1));
                    A.set(nxtMinPos + 1, temp);
                    System.out.println("ARR= " + A);
                }
            }
        }
        return (index == A.size())?"YES" : "NO";
    }

}
