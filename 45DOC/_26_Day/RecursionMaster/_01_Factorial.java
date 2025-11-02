package _26_Day.RecursionMaster;

import java.util.Scanner;

public class _01_Factorial {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number:");
    int n = sc.nextInt();
    sc.nextLine();
    System.out.println("The factorial of " + n + " is " + fact(n));
    sc.close();
  }

  public static int fact(int x) {
    if (x == 0 || x == 1)
      return 1;
    return x * fact(x - 1);
  }

}
