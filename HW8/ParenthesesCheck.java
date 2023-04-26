//TASK 6
package HW8;

import java.util.Stack;

public class ParenthesesCheck {

    public static void main(String[] args) {

        String test1 = "()";
        String test2 = "(((((((((()())";
        String test3 = "(())()";
        String test4 = "(";
        String test5 = ")))(";
        String test6 = "()))(";
        String test7 = "()((()))";
        String test8 = "()))(";
        String test9 = "()()()(";
        String test10 = "()()()()";

        System.out.println(checkParentheses(test1));
        System.out.println(checkParentheses(test2));
        System.out.println(checkParentheses(test3));
        System.out.println(checkParentheses(test4));
        System.out.println(checkParentheses(test5));
        System.out.println(checkParentheses(test6));
        System.out.println(checkParentheses(test7));
        System.out.println(checkParentheses(test8));
        System.out.println(checkParentheses(test9));
        System.out.println(checkParentheses(test10));
    }

    public static boolean checkParentheses(String str) {

        Stack<Character> stack = new Stack<>();

        str.chars().forEach(c -> {
            if (c == '(') {
                stack.push((char) c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    throw new RuntimeException("Invalid parentheses string: " + str);
                }
                stack.pop();
            }
        });

        return stack.isEmpty();
    }
}

