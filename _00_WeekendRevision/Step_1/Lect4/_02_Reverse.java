package _00_WeekendRevision.Step_1.Lect4;

import java.util.Scanner;

public class _02_Reverse {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter you number:");

    int n = sc.nextInt();

    System.out.println(Reverse(n));

    sc.close();

  }

  public static int Reverse(int n){
    int r = 0;
    while(n>0){
     r = r*10 + n%10;
     n=n/10;
    }
    return r;
  }
  
}
