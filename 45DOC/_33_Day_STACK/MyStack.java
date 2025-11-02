package _33_Day_STACK;

public class MyStack {
  private int[] arr;
  private int top;
  private int size;

  public MyStack(int size) {
    this.arr = new int[size]; // Initialize instance variable, not local variable
    this.size = size; // Assign parameter to instance variable
    top = -1;
  }
  // isEmpty()

  public boolean isEmpty() {
    if (top == -1) {
      return true;
    } else {
      return false;
    }
  }

  // isFull()

  public boolean isFull() {
    if (top == size - 1) { // Array indices go from 0 to size-1
      return true;
    } else {
      return false;
    }
  }

  // push()
  public void push(int x) {
    if (!isFull()) {
      arr[++top] = x;
    } else {
      System.out.println("The Stack is Full!!!");
    }
  }
  // pop()

  public int pop() {
    if (!isEmpty()) {
      return arr[top--];
    } else {
      System.out.println("The stack Empty");
      return -1;
    }
  }

  // peek()

  public int peek() {
    if (!isEmpty()) {
      return arr[top];
    } else {
      return -1;
    }
  }

  public void display() {
    if (isEmpty()) {
      System.out.println("Stack is empty!");
      return;
    }

    System.out.print("Stack elements (top to bottom): ");
    for (int i = top; i >= 0; i--) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public int search(int y) {

    while (arr[top] != y && top != 0) {
      top--;
    }
    if (arr[top] == y) {
      return top;
    } else {
      return -1;
    }

  }
}
