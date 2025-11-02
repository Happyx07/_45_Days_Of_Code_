package _26_Day.RecursionMaster;

import java.util.Scanner;

public class _03_SumOfDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number:");
    int n = sc.nextInt();
    sc.nextLine();
    System.out.println("The sum of digits in "+n+" is "+sumOfDigits(n));
    sc.close();
  }

  public static int sumOfDigits(int n){
    if(n==0) return 0;
    return (n%10) + sumOfDigits(n/10);
  }
}
