//  we are converting prefix to Infix in Stack.....

import java.util.Stack;

public class PrefixToInfix {

    // sabse pahle convert karne ke liye hume ye check karna hoga ki ye operator h ya operand
    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    public static String prefixToInfix(String prefix) {
        Stack<String> stack = new Stack<>();

        // Traverse from right to left....
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);

            // If operand then push kar de
            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch + "");
            }
            // If operator
            else if (isOperator(ch)) {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String expression = "(" + op1 + ch + op2 + ")";
                stack.push(expression);
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        String prefix = "*+AB-CD";
        System.out.println("Prefix: " + prefix);
        System.out.println("Infix : " + prefixToInfix(prefix));
    }
}
