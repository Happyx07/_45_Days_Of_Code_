public class _08_Functions {


  // functions are used to reuse code
  // functions are used to modularise the code
  // functions can have parameters and return values
  // functions can be overloaded


  // types of methods or functions
  // 1. Void methods - it does not return a value
  // 2. Return methods - it returns a value
  // 3. Overloaded methods - same name, different parameters
  // 4. Recursive methods - calls itself
  // 5. Parameterized methods - accepts parameters
  // 6. Non-parameterized methods - no parameters
  public static void main(String[] args) {
    greetUser("Alice");
    int a = 5;
    int b = 10;
    System.out.println("Values before modification: a = " + a + ", b = " + b);
    int sum = addNumbers(a, b);
    System.out.println("Values after modification: a = " + a + ", b = " + b);
    System.out.println("Sum: " + sum);
  }

  // Function to greet a user
  public static void greetUser(String name) {
    System.out.println("Hello, " + name + "!");
  }

  // Function to add two numbers
  public static int addNumbers(int a, int b) {
    a += 5;
    b += 10;
    System.out.println("Values inside addNumbers: a = " + a + ", b = " + b);
    return a + b;
  }
}
