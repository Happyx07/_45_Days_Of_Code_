package _26_Day.RecursionMaster;
import java.util.Scanner;

public class _05_Print1toN {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number:");
    int n= sc.nextInt();
    sc.nextLine();
    printN(n);
    sc.close();


  }

  public static void printN(int n ){
    if(n==0)return;
    printN(n-1);
    System.out.print(n+" ");
  }
  
}
