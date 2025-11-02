import java.util.Stack;

public class PrefixToInfix {
    // Function to check if the character is an operator
    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    // Function to convert prefix expression to infix expression
    static String prefixToInfix(String prefix) {
        Stack<String> stack = new Stack<>();

        // Traverse the prefix expression in reverse order
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char c = prefix.charAt(i);

            // If the character is an operand, push it to the stack
            if (Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
            }
            // If the character is an operator
            else if (isOperator(c)) {
                String operand1 = stack.pop();
                String operand2 = stack.pop();
                String expression = "(" + operand1 + c + operand2 + ")";
                stack.push(expression);
            }
        }

        // The final element in the stack is the complete infix expression
        return stack.pop();
    }
    public static void main(String[] args) {
        String prefix = "*+AB-CD";
        String infix = prefixToInfix(prefix);
        System.out.println("Infix Expression: " + infix);
    }
}
