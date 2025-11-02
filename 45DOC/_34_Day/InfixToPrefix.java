import java.util.Stack;

public class InfixToPrefix {
    // Function to check if the character is an operator
    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    // Function to get the precedence of operators
    static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // Function to convert infix expression to prefix expression
    static String infixToPrefix(String infix) {
        StringBuilder prefix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        // Reverse the infix expression
        String reversedInfix = new StringBuilder(infix).reverse().toString();

        for (char c : reversedInfix.toCharArray()) {
            // If the character is an operand, add it to the output
            if (Character.isLetterOrDigit(c)) {
                prefix.append(c);
            }
            // If the character is ')', push it to the stack
            else if (c == ')') {
                stack.push(c);
            }
            // If the character is '(', pop and output from the stack
            // until a ')' is encountered
            else if (c == '(') {
                while (!stack.isEmpty() && stack.peek() != ')') {
                    prefix.append(stack.pop());
                }
                stack.pop(); // Remove ')' from stack
            }
            // If the character is an operator
            else if (isOperator(c)) {
                while (!stack.isEmpty() && precedence(stack.peek()) > precedence(c)) {
                    prefix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Pop all the operators from the stack
        while (!stack.isEmpty()) {
            prefix.append(stack.pop());
        }

        // Since we traversed the infix in reverse, we need to reverse the prefix
        return prefix.reverse().toString();
    }

    public static void main(String[] args) {
        String infix = "(A-B/C)*(A/K-L)";
        String prefix = infixToPrefix(infix);
        System.out.println("Prefix Expression: " + prefix);
    }
}
