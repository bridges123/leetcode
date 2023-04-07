package easy;

import java.util.Stack;

public class ValidPattern {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (!stack.empty()) {
                    char peeked = stack.peek();
                    if (peeked == '(' && c == ')' ||
                            peeked == '[' && c == ']' ||
                            peeked == '{' && c == '}') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }

            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        boolean result = isValid("()[]{}");
        if (result == true) {
            System.out.println("OK");
        }
    }
}
