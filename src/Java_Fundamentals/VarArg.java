package Java_Fundamentals;

import java.util.Arrays;
public class VarArg{
    static void swap(int ...s){//variable arguments.
        //we can pass n number of values of different datatypes;
        System.out.println(Arrays.toString(s));
    }
    static void swap(String ...s){//method overloading
        System.out.println(Arrays.toString(s));
    }
    public static void main(String[] args){
//        int a=80;
//        int b=45;
        swap(15,35,64,94,74,35);
        swap("hitesh","rahul","srinibash");
    }
}
