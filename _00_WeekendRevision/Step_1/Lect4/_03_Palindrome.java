package _00_WeekendRevision.Step_1.Lect4;

import java.util.Scanner;

public class _03_Palindrome {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter you number:");

    int n = sc.nextInt();

    System.out.println(Palindrome(n));
    sc.close();

    

  }

  public static Boolean Palindrome(int n ){
    if(n==Reverse(n)){
      return true;
    }else{
      return false;
    }
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
