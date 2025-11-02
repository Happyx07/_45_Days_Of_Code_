package _33_Day_STACK;

public class StackDemo {
    public static void main(String[] args) {
        System.out.println("═══════════════════════════════════════════════");
        System.out.println("       STACK USING ARRAY - DEMONSTRATION");
        System.out.println("═══════════════════════════════════════════════\n");
        
        // Create a stack with capacity 5
        MyStack stack = new MyStack(5);
        
        // Test isEmpty on empty stack
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println();
        
        // Push elements
        System.out.println("--- PUSH OPERATIONS ---");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println();
        
        // Display stack
        stack.display();
        // System.out.println("Stack size: " + stack.size());
        System.out.println();
        
        // Try to push when full (Stack Overflow)
        System.out.println("--- TESTING STACK OVERFLOW ---");
        stack.push(60);
        System.out.println();
        
        // Peek operation
        System.out.println("--- PEEK OPERATION ---");
        System.out.println("Top element: " + stack.peek());
        System.out.println();
        
        // Pop operations
        System.out.println("--- POP OPERATIONS ---");
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        stack.display();
        System.out.println();
        
        // Search operation
        System.out.println("--- SEARCH OPERATION ---");
        System.out.println("Position of 30 from top: " + stack.search(30));
        System.out.println("Position of 100 from top: " + stack.search(100));
        System.out.println();
        
        // Pop remaining elements
        System.out.println("--- POP REMAINING ---");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
        System.out.println();
        
        // Try to pop from empty stack (Stack Underflow)
        System.out.println("--- TESTING STACK UNDERFLOW ---");
        stack.pop();
        System.out.println();
        
        System.out.println("═══════════════════════════════════════════════");
        System.out.println("           DEMONSTRATION COMPLETE");
        System.out.println("═══════════════════════════════════════════════");
    }
}