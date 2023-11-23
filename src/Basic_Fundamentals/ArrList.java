package Basic_Fundamentals;

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.set(2,8);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);

    }
}
