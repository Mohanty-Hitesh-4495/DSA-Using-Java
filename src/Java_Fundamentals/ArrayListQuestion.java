package Java_Fundamentals;
import java.util.ArrayList;

public class ArrayListQuestion {

    public static void main(String[] args) {

        ArrayList<String> colors1 = new ArrayList<>();

        colors1.add("red");

        colors1.add("green");

        colors1.add("blue");

        colors1.add("yellow");



        ArrayList<String> colors2 = new ArrayList<>(colors1);

        colors2.add("orange");

        colors2.add("purple");

        colors2.add("pink");

        System.out.println(colors2.get(5));

    }

}