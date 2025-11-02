/*
===============================================================================
              STACK IMPLEMENTATION USING QUEUE - COMPLETE GUIDE
           From Basics to Advanced - Interview Ready Revision Notes
===============================================================================

🎯 PURPOSE:
This comprehensive guide covers Stack implementation using Queue(s) - a 
classic interview problem that tests understanding of both data structures.
Perfect for B.Tech CSE students, placement preparation, and technical 
interview revision.

📚 TABLE OF CONTENTS:
1. Problem Statement & Motivation
2. Understanding the Challenge
3. Approach 1: Two Queues (Push Costly)
4. Approach 2: Two Queues (Pop Costly)
5. Approach 3: One Queue (Most Efficient)
6. Detailed Implementations
7. Complexity Analysis & Comparison
8. Practice Problems & Variations
9. Interview Tips & Common Mistakes
10. Quick Reference Cheat Sheet

===============================================================================
                   SECTION 1: PROBLEM STATEMENT & MOTIVATION
===============================================================================

🔹 THE PROBLEM:
───────────────────────────────────────────────────────────────────────────

Design a STACK that supports all stack operations using only QUEUE operations.

Stack Required Operations:
• push(x) - Insert element x into stack
• pop() - Remove and return top element
• top() - Return top element without removing
• empty() - Check if stack is empty

Available Queue Operations:
• add(x) / offer(x) - Add element to rear
• remove() / poll() - Remove element from front
• peek() - View front element
• isEmpty() - Check if empty

🔹 THE CHALLENGE:
───────────────────────────────────────────────────────────────────────────

Stack: LIFO (Last In First Out)
    push(1) → push(2) → push(3) → pop() returns 3
    [1] [2] [3]
             ↑ (top)

Queue: FIFO (First In First Out)
    add(1) → add(2) → add(3) → remove() returns 1
    [1] [2] [3]
     ↑       ↑
   front   rear

💡 KEY INSIGHT: Queue naturally gives us the FIRST element, but Stack 
needs the LAST element. We need to "reverse" the queue's behavior!

🔹 WHY THIS PROBLEM MATTERS:
───────────────────────────────────────────────────────────────────────────

✅ Tests deep understanding of LIFO vs FIFO
✅ Common in technical interviews (Amazon, Google, Microsoft)
✅ Teaches data structure manipulation
✅ Shows trade-offs between different approaches
✅ LeetCode #225 - Popular problem
✅ Builds problem-solving skills

🔹 REAL-WORLD ANALOGY:
───────────────────────────────────────────────────────────────────────────

Imagine a line of people (queue) where new people join at the back:
Queue: [Person1] → [Person2] → [Person3] (Person3 is newest)

To simulate a stack (newest person should leave first):
We need to move Person1 and Person2 to the back, so Person3 is at front!

Result: [Person3] → [Person1] → [Person2]
Now removing from front gives us the newest person (stack behavior)!

===============================================================================
                   SECTION 2: UNDERSTANDING THE CHALLENGE
===============================================================================

🔹 CONCEPTUAL APPROACH:
───────────────────────────────────────────────────────────────────────────

The fundamental question: How do we make FIFO behave like LIFO?

Stack Behavior:
    push(10) → push(20) → push(30) → pop() = 30
    Storage: [10, 20, 30]
    Access: From RIGHT (most recent)

Queue Behavior:
    add(10) → add(20) → add(30) → remove() = 10
    Storage: [10, 20, 30]
    Access: From LEFT (oldest)

💡 SOLUTION STRATEGY:
We need to rearrange elements so that the most recent element is at the 
front of the queue (where removal happens)!

🔹 THREE POSSIBLE APPROACHES:
───────────────────────────────────────────────────────────────────────────

Approach 1: Two Queues - Make PUSH costly
    → Keep newest element at front always
    → Push: O(n), Pop: O(1)

Approach 2: Two Queues - Make POP costly
    → Keep elements in order, rearrange during pop
    → Push: O(1), Pop: O(n)

Approach 3: One Queue - Most elegant
    → Rotate queue during push
    → Push: O(n), Pop: O(1)
    → Space efficient!

🔹 WHICH APPROACH TO USE?
───────────────────────────────────────────────────────────────────────────

For Interviews: Approach 3 (One Queue)
    ✅ Most space efficient
    ✅ Shows deep understanding
    ✅ Elegant solution

But know all three approaches to discuss trade-offs!

===============================================================================
            SECTION 3: APPROACH 1 - TWO QUEUES (PUSH COSTLY)
===============================================================================

🔹 STRATEGY:
───────────────────────────────────────────────────────────────────────────

Keep the newest element always at the FRONT of queue1.

How?
1. When pushing new element:
   - Add it to queue2
   - Move all elements from queue1 to queue2
   - Swap queue1 and queue2

2. When popping:
   - Simply remove from queue1 (front has the top element)

🔹 STEP-BY-STEP EXAMPLE:
───────────────────────────────────────────────────────────────────────────

Initial State:
    q1: []
    q2: []

Operation: push(10)
Step 1: Add 10 to q2
    q1: []
    q2: [10]
Step 2: Move all from q1 to q2 (nothing to move)
    q2: [10]
Step 3: Swap q1 and q2
    q1: [10]
    q2: []

Operation: push(20)
Step 1: Add 20 to q2
    q1: [10]
    q2: [20]
Step 2: Move all from q1 to q2
    q2: [20, 10]  (20 at front, 10 at rear)
Step 3: Swap q1 and q2
    q1: [20, 10]
    q2: []

Operation: push(30)
Step 1: Add 30 to q2
    q1: [20, 10]
    q2: [30]
Step 2: Move all from q1 to q2
    q2: [30, 20, 10]
Step 3: Swap
    q1: [30, 20, 10]
    q2: []

Operation: pop()
    Simply remove from q1 → returns 30
    q1: [20, 10]

Operation: top()
    Simply peek q1 → returns 20 (doesn't remove)

🔹 WHY THIS WORKS:
───────────────────────────────────────────────────────────────────────────

After each push, the newest element is at the FRONT of queue1.
Queue's FIFO removal now gives us stack's LIFO behavior!

Visual: Stack [10, 20, 30] with 30 on top
        Queue [30, 20, 10] with 30 at front
        ✅ Perfect match!

═══════════════════════════════════════════════════════════════════════════
              APPROACH 1 - JAVA IMPLEMENTATION (PUSH COSTLY)
═══════════════════════════════════════════════════════════════════════════
*/

import java.util.Queue;
import java.util.LinkedList;

class StackUsingTwoQueues_PushCostly {
    private Queue<Integer> q1;  // Main queue (keeps elements in stack order)
    private Queue<Integer> q2;  // Helper queue (temporary during push)
    
    /**
     * Constructor - Initialize both queues
     */
    public StackUsingTwoQueues_PushCostly() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    /**
     * PUSH OPERATION - Add element to stack (TOP)
     * Time Complexity: O(n) where n = number of elements
     * Space Complexity: O(1) auxiliary
     * 
     * Strategy: Make new element go to front of q1
     */
    public void push(int x) {
        // Step 1: Add new element to q2
        q2.add(x);
        
        // Step 2: Move all elements from q1 to q2
        // This puts new element at front
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        
        // Step 3: Swap q1 and q2 names
        // Now q1 has all elements with newest at front
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        
        System.out.println(x + " pushed to stack");
    }
    
    /**
     * POP OPERATION - Remove and return top element
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        
        int removed = q1.remove();
        return removed;
    }
    
    /**
     * TOP OPERATION - Return top element without removing
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public int top() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        
        return q1.peek();
    }
    
    /**
     * CHECK IF EMPTY
     * Time Complexity: O(1)
     */
    public boolean empty() {
        return q1.isEmpty();
    }
    
    /**
     * GET SIZE
     * Time Complexity: O(1)
     */
    public int size() {
        return q1.size();
    }
    
    /**
     * DISPLAY - For debugging
     */
    public void display() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Stack (top to bottom): " + q1);
    }
}

/*
===============================================================================
            SECTION 4: APPROACH 2 - TWO QUEUES (POP COSTLY)
===============================================================================

🔹 STRATEGY:
───────────────────────────────────────────────────────────────────────────

Keep elements in natural insertion order. When pop is called, move n-1 
elements to q2, leaving only the last element in q1 for removal.

How?
1. When pushing:
   - Simply add to q1 (O(1) operation)

2. When popping:
   - Move n-1 elements from q1 to q2
   - The last element in q1 is the "top" of stack
   - Remove it
   - Swap q1 and q2

🔹 STEP-BY-STEP EXAMPLE:
───────────────────────────────────────────────────────────────────────────

Operation: push(10)
    q1: [10]
    q2: []

Operation: push(20)
    q1: [10, 20]
    q2: []

Operation: push(30)
    q1: [10, 20, 30]
    q2: []

Operation: pop()
Step 1: Move n-1 elements to q2 (move 10, 20)
    q1: [30]
    q2: [10, 20]
Step 2: Remove from q1 (the top element)
    removed = 30
    q1: []
    q2: [10, 20]
Step 3: Swap q1 and q2
    q1: [10, 20]
    q2: []
Return: 30

Operation: top()
Similar to pop but don't remove, just peek after moving n-1 elements

🔹 WHY THIS WORKS:
───────────────────────────────────────────────────────────────────────────

We maintain insertion order during push. During pop, we isolate the last 
added element (which should be removed first in stack - LIFO).

═══════════════════════════════════════════════════════════════════════════
              APPROACH 2 - JAVA IMPLEMENTATION (POP COSTLY)
═══════════════════════════════════════════════════════════════════════════
*/

class StackUsingTwoQueues_PopCostly {
    private Queue<Integer> q1;  // Main queue
    private Queue<Integer> q2;  // Helper queue
    
    public StackUsingTwoQueues_PopCostly() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    /**
     * PUSH OPERATION - Add element to stack
     * Time Complexity: O(1) - Simply add to queue
     * Space Complexity: O(1)
     */
    public void push(int x) {
        q1.add(x);
        System.out.println(x + " pushed to stack");
    }
    
    /**
     * POP OPERATION - Remove and return top element
     * Time Complexity: O(n) - Need to move n-1 elements
     * Space Complexity: O(1)
     */
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        
        // Move n-1 elements from q1 to q2
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        
        // The last element in q1 is our top element
        int removed = q1.remove();
        
        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        
        return removed;
    }
    
    /**
     * TOP OPERATION - Return top without removing
     * Time Complexity: O(n) - Need to move n-1 elements and move back
     * Space Complexity: O(1)
     */
    public int top() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        
        // Move n-1 elements to q2
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        
        // Peek the last element
        int topElement = q1.peek();
        
        // Move it to q2 as well (since we're not removing)
        q2.add(q1.remove());
        
        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        
        return topElement;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
    
    public int size() {
        return q1.size();
    }
}

/*
===============================================================================
         SECTION 5: APPROACH 3 - ONE QUEUE (MOST EFFICIENT) ⭐
===============================================================================

🔹 STRATEGY: THE ELEGANT SOLUTION
───────────────────────────────────────────────────────────────────────────

Use ONLY ONE QUEUE! When pushing, rotate the queue so new element comes 
to front.

How?
1. When pushing new element x:
   - Add x to queue (goes to rear)
   - Remove and re-add all previous elements (size-1 times)
   - This brings x to the front!

2. When popping:
   - Simply remove from front (O(1))

🔹 THE MAGIC: QUEUE ROTATION
───────────────────────────────────────────────────────────────────────────

Think of it as a circular arrangement. By removing from front and adding 
to rear repeatedly, we "rotate" the queue until the new element is at front.

Visual Example:

Initial: [10, 20]
    front → [10] [20] ← rear

Push(30):
Step 1: Add 30 to rear
    front → [10] [20] [30] ← rear

Step 2: Remove and re-add first element (10)
    front → [20] [30] [10] ← rear

Step 3: Remove and re-add first element (20)
    front → [30] [10] [20] ← rear

Result: 30 is now at front! ✅

🔹 DETAILED STEP-BY-STEP EXAMPLE:
───────────────────────────────────────────────────────────────────────────

Operation: push(10)
    q: [10]
    Rotations: 0 (size was 0)

Operation: push(20)
    Step 1: Add 20
        q: [10, 20]
    Step 2: Rotate (size-1 = 1 time)
        Remove 10, add 10: q: [20, 10]
    Result: q: [20, 10]  ← 20 at front!

Operation: push(30)
    Step 1: Add 30
        q: [20, 10, 30]
    Step 2: Rotate (size-1 = 2 times)
        Rotation 1: Remove 20, add 20: q: [10, 30, 20]
        Rotation 2: Remove 10, add 10: q: [30, 20, 10]
    Result: q: [30, 20, 10]  ← 30 at front!

Operation: pop()
    Simply remove from front: returns 30
    q: [20, 10]

Operation: top()
    Simply peek front: returns 20
    q: [20, 10]  (unchanged)

🔹 WHY THIS IS THE BEST APPROACH:
───────────────────────────────────────────────────────────────────────────

✅ Uses only ONE queue (saves space)
✅ Pop is O(1) - most common operation optimized
✅ No queue swapping logic needed
✅ Clean and elegant code
✅ Preferred in interviews

═══════════════════════════════════════════════════════════════════════════
            APPROACH 3 - JAVA IMPLEMENTATION (ONE QUEUE) ⭐⭐⭐
═══════════════════════════════════════════════════════════════════════════
*/

class StackUsingOneQueue {
    private Queue<Integer> q;
    
    /**
     * Constructor - Initialize single queue
     */
    public StackUsingOneQueue() {
        q = new LinkedList<>();
    }
    
    /**
     * PUSH OPERATION - Add element and rotate queue
     * Time Complexity: O(n) where n = current size
     * Space Complexity: O(1) auxiliary
     * 
     * Key Idea: After adding, rotate queue (size-1) times
     * to bring new element to front
     */
    public void push(int x) {
        // Get current size before adding
        int size = q.size();
        
        // Add new element to rear
        q.add(x);
        
        // Rotate: Remove from front and add to rear (size times)
        // This brings the newly added element to front
        for (int i = 0; i < size; i++) {
            q.add(q.remove());
        }
        
        System.out.println(x + " pushed to stack");
    }
    
    /**
     * POP OPERATION - Remove from front
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public int pop() {
        if (q.isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        
        return q.remove();
    }
    
    /**
     * TOP OPERATION - Peek front element
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public int top() {
        if (q.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        
        return q.peek();
    }
    
    /**
     * CHECK IF EMPTY
     * Time Complexity: O(1)
     */
    public boolean empty() {
        return q.isEmpty();
    }
    
    /**
     * GET SIZE
     * Time Complexity: O(1)
     */
    public int size() {
        return q.size();
    }
    
    /**
     * DISPLAY - For debugging
     */
    public void display() {
        if (q.isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Stack (top to bottom): " + q);
    }
}

/*
===============================================================================
                    SECTION 6: DETAILED IMPLEMENTATIONS
                    (Production-Ready Code with Comments)
===============================================================================

🔹 LEETCODE #225 - IMPLEMENT STACK USING QUEUES (COMPLETE SOLUTION)
───────────────────────────────────────────────────────────────────────────

This is the exact format expected in LeetCode and interviews.

═══════════════════════════════════════════════════════════════════════════
*/

class MyStack {
    private Queue<Integer> queue;
    
    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        queue = new LinkedList<>();
    }
    
    /**
     * Push element x onto stack.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public void push(int x) {
        // Add element to queue
        queue.add(x);
        
        // Rotate queue to bring new element to front
        int size = queue.size();
        for (int i = 1; i < size; i++) {
            queue.add(queue.remove());
        }
    }
    
    /**
     * Removes the element on top of the stack and returns that element.
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public int pop() {
        return queue.remove();
    }
    
    /**
     * Get the top element.
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public int top() {
        return queue.peek();
    }
    
    /**
     * Returns whether the stack is empty.
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

/*
═══════════════════════════════════════════════════════════════════════════
                        COMPREHENSIVE TESTING CLASS
═══════════════════════════════════════════════════════════════════════════
*/

class StackUsingQueueDemo {
    public static void main(String[] args) {
        System.out.println("═══════════════════════════════════════════════");
        System.out.println("    STACK USING QUEUE - ALL APPROACHES DEMO");
        System.out.println("═══════════════════════════════════════════════\n");
        
        // ========== TEST APPROACH 1: TWO QUEUES (PUSH COSTLY) ==========
        System.out.println("========== APPROACH 1: TWO QUEUES (PUSH COSTLY) ==========\n");
        StackUsingTwoQueues_PushCostly stack1 = new StackUsingTwoQueues_PushCostly();
        
        System.out.println("--- Push Operations ---");
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.display();
        
        System.out.println("\n--- Top and Pop ---");
        System.out.println("Top element: " + stack1.top());
        System.out.println("Popped: " + stack1.pop());
        System.out.println("Popped: " + stack1.pop());
        stack1.display();
        
        System.out.println("\n--- Push and Pop Again ---");
        stack1.push(40);
        stack1.push(50);
        stack1.display();
        System.out.println("Top: " + stack1.top());
        
        
        // ========== TEST APPROACH 2: TWO QUEUES (POP COSTLY) ==========
        System.out.println("\n\n========== APPROACH 2: TWO QUEUES (POP COSTLY) ==========\n");
        StackUsingTwoQueues_PopCostly stack2 = new StackUsingTwoQueues_PopCostly();
        
        System.out.println("--- Push Operations (Fast) ---");
        stack2.push(100);
        stack2.push(200);
        stack2.push(300);
        
        System.out.println("\n--- Pop Operations (Slow) ---");
        System.out.println("Popped: " + stack2.pop());
        System.out.println("Popped: " + stack2.pop());
        System.out.println("Top: " + stack2.top());
        
        
        // ========== TEST APPROACH 3: ONE QUEUE (OPTIMAL) ==========
        System.out.println("\n\n========== APPROACH 3: ONE QUEUE (OPTIMAL) ⭐ ==========\n");
        StackUsingOneQueue stack3 = new StackUsingOneQueue();
        
        System.out.println("--- Push Operations ---");
        stack3.push(5);
        stack3.push(10);
        stack3.push(15);
        stack3.push(20);
        stack3.display();
        
        System.out.println("\n--- Pop Operations ---");
        System.out.println("Popped: " + stack3.pop());
        System.out.println("Top: " + stack3.top());
        stack3.display();
        
        System.out.println("\n--- More Operations ---");
        stack3.push(25);
        stack3.push(30);
        stack3.display();
        System.out.println("Size: " + stack3.size());
        System.out.println("Empty? " + stack3.empty());
        
        System.out.println("\n--- Empty the Stack ---");
        while (!stack3.empty()) {
            System.out.println("Popped: " + stack3.pop());
        }
        System.out.println("Empty? " + stack3.empty());
        stack3.pop();  // Test underflow
        
        
        // ========== TEST LEETCODE FORMAT ==========
        System.out.println("\n\n========== LEETCODE FORMAT (MyStack) ==========\n");
        MyStack myStack = new MyStack();
        
        System.out.println("Operations: push(1), push(2), top(), pop(), empty()");
        myStack.push(1);
        myStack.push(2);
        System.out.println("top() returns: " + myStack.top());      // returns 2
        System.out.println("pop() returns: " + myStack.pop());      // returns 2
        System.out.println("empty() returns: " + myStack.empty());  // returns false
        
        System.out.println("\n═══════════════════════════════════════════════");
        System.out.println("         ALL APPROACHES TESTED SUCCESSFULLY");
        System.out.println("═══════════════════════════════════════════════");
    }
}

/*
===============================================================================
              SECTION 7: COMPLEXITY ANALYSIS & COMPARISON
===============================================================================

🔹 TIME COMPLEXITY COMPARISON:
───────────────────────────────────────────────────────────────────────────

┌─────────────┬──────────────────┬──────────────────┬──────────────────┐
│ Operation   │ Approach 1       │ Approach 2       │ Approach 3       │
│             │ (2Q Push Costly) │ (2Q Pop Costly)  │ (1Q Optimal)     │
├─────────────┼──────────────────┼──────────────────┼──────────────────┤
│ push(x)     │ O(n)             │ O(1) ✅          │ O(n)             │
│ pop()       │ O(1) ✅          │ O(n)             │ O(1) ✅          │
│ top()       │ O(1) ✅          │ O(n)             │ O(1) ✅          │
│ empty()     │ O(1)             │ O(1)             │ O(1)             │
└─────────────┴──────────────────┴──────────────────┴──────────────────┘

🔹 SPACE COMPLEXITY COMPARISON:
───────────────────────────────────────────────────────────────────────────

┌─────────────┬──────────────────┬──────────────────┬──────────────────┐
│ Aspect      │ Approach 1       │ Approach 2       │ Approach 3       │
├─────────────┼──────────────────┼──────────────────┼──────────────────┤
│ Queues Used │ 2                │ 2                │ 1 ✅             │
│ Space for n │ O(n)             │ O(n)             │ O(n)             │
│ Aux Space   │ O(1)             │ O(1)             │ O(1)             │
│ Overhead    │ Higher           │ Higher           │ Lower ✅         │
└─────────────┴──────────────────┴──────────────────┴──────────────────┘

🔹 WHICH APPROACH TO CHOOSE?
───────────────────────────────────────────────────────────────────────────

For Interviews: ⭐ Approach 3 (One Queue)
    ✅ Most space efficient
    ✅ Elegant solution
    ✅ Shows mastery
    ✅ Pop is O(1) - most common operation

For Systems with Frequent Pop: Approach 1 or 3
    ✅ Both have O(1) pop
    ✅ Push is less frequent usually

For Systems with Frequent Push: Approach 2
    ✅ O(1) push
    ❌ But O(n) pop is usually unacceptable

🔹 AMORTIZED ANALYSIS:
───────────────────────────────────────────────────────────────────────────

For Approach 3 (One Queue):
- Push n elements: Each costs O(k) where k is current size
- Total cost: 0 + 1 + 2 + 3 + ... + (n-1) = O(n²)
- But often in practice, push/pop are mixed
- If we do m operations (mix of push/pop), total cost ≈ O(m*n) worst case

Real-world: Usually acceptable because:
✅ Stack operations are very fast in practice
✅ n is typically small to moderate
✅ Pop being O(1) is more important

===============================================================================
            SECTION 8: PRACTICE PROBLEMS & VARIATIONS
===============================================================================

🔹 RELATED PROBLEMS:
───────────────────────────────────────────────────────────────────────────

1. ⭐ LeetCode #225 - Implement Stack using Queues
   - Direct application of this concept
   - Try all three approaches

2. ⭐ LeetCode #232 - Implement Queue using Stacks
   - Reverse problem (Queue using Stack)
   - Good to learn both directions

3. ⭐⭐ Design a Stack that supports getMin() using Queue
   - Variant: Add getMin() operation in O(1)
   - Hint: Use auxiliary data structure

4. ⭐⭐ Implement Stack using Single Queue (No size() method)
   - Constraint: Can't use queue.size()
   - Hint: Maintain size manually

5. ⭐⭐ Implement Stack supporting push, pop, max, min using Queue
   - Multiple special operations
   - Combine multiple concepts

🔹 VARIATIONS TO PRACTICE:
───────────────────────────────────────────────────────────────────────────

Variation 1: Stack with Max
    Add getMax() operation returning maximum element in O(1)
    Hint: Use auxiliary queue to track maxima

Variation 2: Stack with Middle Element
    Add operations to push/pop/get middle element
    Hint: Requires modification of queue structure

Variation 3: Two Stacks Using One Queue
    Implement two stacks using single queue
    Tricky: Need to differentiate elements of two stacks

Variation 4: Generic Stack (Templates)
    Make it work with any data type
    Java: Use generics <T>

🔹 INTERVIEW FOLLOW-UP QUESTIONS:
───────────────────────────────────────────────────────────────────────────

Q1: Why is one queue approach better than two queues?
A1: Saves memory, cleaner code, same time complexity

Q2: Can you implement using only one queue with better time complexity?
A2: No, push must be O(n) to maintain stack property with queue operations

Q3: Which operations are more common in real systems - push or pop?
A3: Depends on application, but generally balanced, so O(1) pop is valuable

Q4: What if we need both push and pop to be O(1)?
A4: Not possible with queue-only operations. Need different data structure.

Q5: How would you handle multi-threading?
A5: Add synchronization to push/pop methods, use thread-safe queue

Q6: Space vs Time trade-off?
A6: We sacrifice time (O(n) push) to maintain stack semantics with queue

===============================================================================
          SECTION 9: INTERVIEW TIPS & COMMON MISTAKES
===============================================================================

🔹 COMMON MISTAKES TO AVOID:
───────────────────────────────────────────────────────────────────────────

❌ Mistake 1: Forgetting to swap queues in two-queue approach
    Impact: Breaks the data structure
    Fix: Always swap after moving elements

❌ Mistake 2: Off-by-one error in rotation count
    Wrong: for(i=0; i<=size; i++)  // Rotates one extra time
    Correct: for(i=0; i<size; i++) // or for(i=1; i<size; i++)
    
❌ Mistake 3: Not handling empty case before pop/top
    Impact: NullPointerException or wrong behavior
    Fix: Always check empty() first

❌ Mistake 4: Using queue.size() inside rotation loop
    Wrong: while(queue.size() > 1) { queue.add(queue.remove()); }
    This creates infinite loop!
    Correct: Store size before loop

❌ Mistake 5: Rotating wrong number of times
    One Queue: Rotate exactly size times (not size-1)
    Why: After adding new element, rotate ALL existing elements

❌ Mistake 6: Confusing FIFO with LIFO during explanation
    Be crystal clear: Queue is FIFO, Stack is LIFO

🔹 INTERVIEW COMMUNICATION TIPS:
───────────────────────────────────────────────────────────────────────────

✅ Start with the problem statement in your words
✅ Clarify: Can I use built-in Queue? (Usually yes)
✅ Discuss all three approaches briefly
✅ Recommend one queue approach
✅ Draw diagrams for push operation
✅ Explain why rotation works
✅ Mention time/space complexity
✅ Code cleanly with good variable names
✅ Test with an example (push 3 elements, pop 1)
✅ Discuss trade-offs when asked

🔹 WHAT TO SAY IN INTERVIEW:
───────────────────────────────────────────────────────────────────────────

"To implement a Stack using Queue, I need to reverse the FIFO behavior of 
the queue to achieve LIFO behavior of stack. 

There are three approaches:
1. Two queues with push costly - O(n) push, O(1) pop
2. Two queues with pop costly - O(1) push, O(n) pop  
3. One queue with rotation - O(n) push, O(1) pop, space efficient

I'll implement the one queue approach as it's most elegant and space 
efficient. The key idea is to rotate the queue after each push, bringing 
the newly added element to the front. This way, when we pop, the queue's 
front has the most recent element, giving us stack behavior."

Then code approach 3!

🔹 CODE REVIEW CHECKLIST:
───────────────────────────────────────────────────────────────────────────

□ Handle empty stack case (underflow)
□ Rotation count is correct (exactly size times)
□ Store size before rotation loop
□ Use meaningful variable names
□ Add comments for rotation logic
□ Test with 3+ elements
□ Verify pop returns correct element
□ Check top doesn't modify stack
□ Ensure empty() works correctly

===============================================================================
              SECTION 10: QUICK REFERENCE CHEAT SHEET
===============================================================================

┌─────────────────────────────────────────────────────────────────────────┐
│                    STACK USING QUEUE - KEY POINTS                       │
├─────────────────────────────────────────────────────────────────────────┤
│ Problem: Implement Stack (LIFO) using Queue (FIFO)                     │
│ Challenge: Reverse queue's natural order                               │
│ Best Solution: One queue with rotation ⭐                               │
│ Push: O(n) - Rotate queue after adding                                 │
│ Pop: O(1) - Simply remove from front                                   │
│ Space: O(n) - Single queue storage                                     │
│ LeetCode: #225 - Implement Stack using Queues                          │
└─────────────────────────────────────────────────────────────────────────┘

🔹 ONE QUEUE APPROACH - CORE ALGORITHM:
───────────────────────────────────────────────────────────────────────────

push(x):
    1. size = queue.size()
    2. queue.add(x)
    3. for i = 0 to size-1:
           queue.add(queue.remove())

pop():
    return queue.remove()

top():
    return queue.peek()

🔹 WHY ROTATION WORKS:
───────────────────────────────────────────────────────────────────────────

After adding new element x to rear:
    [old elements ... x]
    
After rotating size times:
    [x, old elements ...]
    
Now x is at front → Removing from front gives LIFO ✅

🔹 COMPLEXITY SUMMARY:
───────────────────────────────────────────────────────────────────────────

Operation  │ Time     │ Space
───────────┼──────────┼────────
push(x)    │ O(n)     │ O(1)
pop()      │ O(1)     │ O(1)
top()      │ O(1)     │ O(1)
empty()    │ O(1)     │ O(1)
Total      │          │ O(n)

🔹 COMPARISON WITH REVERSE PROBLEM:
───────────────────────────────────────────────────────────────────────────

Stack using Queue (This problem):
✅ One queue approach exists
✅ Pop is O(1) (optimized)
✅ Push is O(n) (acceptable)

Queue using Stack (#232):
✅ Two stacks needed
✅ Can make enqueue or dequeue O(1)
✅ Amortized O(1) for dequeue possible

Both are classic interview problems!

===============================================================================
                        SECTION 11: VISUAL SUMMARY
===============================================================================

📊 PUSH OPERATION VISUALIZATION (ONE QUEUE):
───────────────────────────────────────────────────────────────────────────

Initial: [10, 20]
         ↑ front

push(30):

Step 1: Add 30 to queue
    [10, 20, 30]
     ↑         ↑
   front     rear

Step 2: Rotate (size=2 times)
    Rotation 1: Remove 10, add to rear
        [20, 30, 10]
         ↑        ↑
       front    rear
    
    Rotation 2: Remove 20, add to rear
        [30, 10, 20]
         ↑        ↑
       front    rear

Result: [30, 10, 20]
        ↑
      front (newest element)

Now pop() removes 30 → LIFO behavior achieved! ✅

🎯 DECISION TREE:
───────────────────────────────────────────────────────────────────────────

        Need to implement Stack using Queue?
                        │
            ┌───────────┴───────────┐
            │                       │
      Mention Space          Mention All
      Efficiency            Approaches
            │                       │
      Use ONE Queue          Discuss Trade-offs
        Approach              Then Code Best One
            │                       │
      Rotate during push      One Queue Approach
      Pop is O(1)                   │
            │                       │
            └───────────┬───────────┘
                        │
                Code & Test with Example
                        │
                  Analyze Complexity

===============================================================================
                   SECTION 12: COMPLETE WORKING EXAMPLE
===============================================================================

🔹 TRACE THROUGH COMPLETE EXAMPLE:
───────────────────────────────────────────────────────────────────────────

Stack stack = new Stack();  // Using one queue approach

Operation: stack.push(5)
    Before: []
    Add 5: [5]
    Rotate 0 times (size was 0)
    After: [5]

Operation: stack.push(10)
    Before: [5]
    Add 10: [5, 10]
    Rotate 1 time:
        Remove 5, add 5: [10, 5]
    After: [10, 5]  ← 10 at front

Operation: stack.push(15)
    Before: [10, 5]
    Add 15: [10, 5, 15]
    Rotate 2 times:
        Remove 10, add 10: [5, 15, 10]
        Remove 5, add 5: [15, 10, 5]
    After: [15, 10, 5]  ← 15 at front

Operation: stack.top()
    Return: 15
    Queue: [15, 10, 5]  (unchanged)

Operation: stack.pop()
    Remove from front: 15
    After: [10, 5]  ← 10 now at front

Operation: stack.push(20)
    Before: [10, 5]
    Add 20: [10, 5, 20]
    Rotate 2 times:
        Remove 10, add 10: [5, 20, 10]
        Remove 5, add 5: [20, 10, 5]
    After: [20, 10, 5]

Operation: stack.pop()
    Return: 20
    After: [10, 5]

Operation: stack.pop()
    Return: 10
    After: [5]

Operation: stack.empty()
    Return: false (still has 5)

Operation: stack.pop()
    Return: 5
    After: []

Operation: stack.empty()
    Return: true

Behavior matches perfect LIFO: push 5,10,15 → pop gives 15,10,5 ✅

===============================================================================
                       SECTION 13: FINAL TAKEAWAYS
===============================================================================

🎓 KEY LEARNINGS:
───────────────────────────────────────────────────────────────────────────

1. Stack is LIFO, Queue is FIFO - fundamentally opposite
2. To convert FIFO → LIFO, we must rearrange elements
3. Three approaches exist, one queue is most elegant
4. Rotation is the key technique in one queue approach
5. Trade-off: O(n) push for O(1) pop
6. LeetCode #225 is must-solve for interviews
7. Understanding this deepens BOTH stack and queue knowledge

💪 MASTERY CHECKLIST:
───────────────────────────────────────────────────────────────────────────

□ Understand why this problem is challenging
□ Can explain all three approaches
□ Can code one queue approach from scratch
□ Can trace through push operations with rotation
□ Understand time/space complexity
□ Can compare approaches and justify choice
□ Have solved LeetCode #225
□ Can handle follow-up questions
□ Can code reverse problem (Queue using Stack)
□ Can explain to a beginner

🚀 NEXT STEPS:
───────────────────────────────────────────────────────────────────────────

1. Solve LeetCode #225 (this problem)
2. Solve LeetCode #232 (Queue using Stack)
3. Implement with generics <T>
4. Add getMin() functionality
5. Explore deque-based solutions
6. Study amortized analysis deeper
7. Solve related problems (getMax, middle element)
8. Teach someone else (best way to learn!)

🎯 INTERVIEW SUCCESS FORMULA:
───────────────────────────────────────────────────────────────────────────

1. State the problem clearly
2. Identify the core challenge (FIFO vs LIFO)
3. Propose one queue approach
4. Explain rotation technique
5. Code carefully with edge cases
6. Test with example
7. Analyze complexity
8. Discuss alternatives if time permits

Remember: "The queue naturally gives us the oldest element, but stack 
needs the newest. Rotation brings the newest to front, converting FIFO 
to LIFO elegantly!" 🔄

This problem tests understanding of BOTH data structures - master it!

===============================================================================
                              END OF GUIDE
            Practice this problem multiple times - it's gold! ⭐
===============================================================================
*/
