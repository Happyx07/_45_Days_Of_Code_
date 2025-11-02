package _32_Day_BITMAN.STACK;

public class implementStackUsingArray {
  public static void main(String[] args) {

    stack s = new stack();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    s.pop();

    System.out.println(s.size());
    System.out.println(s.top);
  }

  public static class stack{

      int size = 10000;
      int[] arr = new int[size];
      int top  = -1;

      void push(int x ){
        top++;
        arr[top] = x;
      }

      int pop(){
        int x = arr[top];
        top--;
        return x;
      }

      int top(){
        return arr[top];
      }

      int size(){
        return top + 1;
      }
  
    
  }
}
