import java.util.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(6);
        arr.add(5);
        arr.add(2);
        arr.add(4);
        arr.add(3);
        System.out.println(arr);
        System.out.println(larrysArray(arr));
    }
    public static String larrysArray(List<Integer> A) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

        for(int i=0;i<A.size();i++){
            map.put(A.get(i),i);
        }
        System.out.println(map);
        int index=0;
        while(index<A.size()){
            if(A.get(index) == index+1){
                System.out.println(index);
                index++;
                continue;
            }
            int nxtMinPos = map.get(index+1);
            if(nxtMinPos - index >=2){

                int temp = A.get(nxtMinPos-2);
                A.set(nxtMinPos-2,A.get(nxtMinPos-1));
                A.set(nxtMinPos-1,A.get(nxtMinPos));
                A.set(nxtMinPos,temp);

                System.out.println("ARR= "+A);

                map.put(A.get(nxtMinPos-2),nxtMinPos-2);
                map.put(A.get(nxtMinPos-1),nxtMinPos-1);
                map.put(A.get(nxtMinPos),nxtMinPos);

                System.out.println("Map= "+map);
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
                    map.put(A.get(0), 0);
                    map.put(A.get(nxtMinPos), nxtMinPos);
                    map.put(A.get(nxtMinPos + 1), nxtMinPos + 1);
                    System.out.println("Map= " + map);
                }
            }
        }
        return (index == A.size())?"YES" : "NO";
    }

}
