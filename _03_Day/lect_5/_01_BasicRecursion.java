// Recursion definition
// Recursion is a process in which a function calls itself directly or indirectly in order to solve a problem.

// Types of Recursion
// 1. Direct Recursion: When a function calls itself directly.
// 2. Indirect Recursion: When a function calls another function which calls the first function.

// printing 1-N using recursion
public class _01_BasicRecursion {

  public static void main(String[] args) {
    print1toN(5);
  }


  public static void print1toN(int n) {
  if (n == 0) {
    return;
  }
  System.out.println(n);
  print1toN(n - 1);
  
  }
}



