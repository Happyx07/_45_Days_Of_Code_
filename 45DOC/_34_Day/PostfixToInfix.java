import java.util.Stack;

public class PostfixToInfix {
    // Function to check if the character is an operator
    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    // Function to convert postfix expression to infix expression
    static String postfixToInfix(String postfix) {
        Stack<String> stack = new Stack<>();

        for (char c : postfix.toCharArray()) {
            // If the character is an operand, push it to the stack
            if (Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
            }
            // If the character is an operator
            else if (isOperator(c)) {
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                String expression = "(" + operand1 + c + operand2 + ")";
                stack.push(expression);
            }
        }

        // The final element in the stack is the complete infix expression
        return stack.pop();
    }
    public static void main(String[] args) {
        String postfix = "ab+cde+**";
        String infix = postfixToInfix(postfix);
        System.out.println("Infix Expression: " + infix);
    }
}
