import java.util.Stack;

public class Test{

    public static String test1(String input) {
        Stack stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }
        return test2(stack);
    }

    private static String test2(Stack stack) {
        if (stack.isEmpty()) {
            return "";
        } else {
            char ch = stack.pop();
            return ch + test2(stack);
        }
    }

    public static void main(String[] args) {
        String input = "exam";
        System.out.println(test1(input)); // What is the output?
    }
}