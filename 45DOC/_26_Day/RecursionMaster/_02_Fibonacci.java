package _26_Day.RecursionMaster;

import java.util.Scanner;

public class _02_Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number:");
    int n = sc.nextInt();
    sc.nextLine();
    System.out.println("The "+n+"th Fibonacci number is "+fib(n));
    sc.close();
    
  }

  public static int fib(int n){
    if(n==0) return 0;
    if(n==1) return 1;
    return fib(n-1) + fib(n-2);
  }
}
