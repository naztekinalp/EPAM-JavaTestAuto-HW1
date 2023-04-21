package HW7;

import java.util.*;

//TASK 6
public class ParenthesesCheck {

    public static boolean checkParentheses(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test1 = "()()()";
        String test2 = "(()())";
        String test3 = "())(";
        System.out.println(checkParentheses(test1)); // true
        System.out.println(checkParentheses(test2)); // true
        System.out.println(checkParentheses(test3)); // false
    }
}
