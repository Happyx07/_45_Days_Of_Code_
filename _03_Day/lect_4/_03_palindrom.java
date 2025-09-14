import java.util.Scanner;

public class _03_palindrom {

  // A number is a Palindrome if after reversing it it remains the same that mean n = reverse(n):

  // for example 121 = 121, 12321, 
  // 121            -121 
  public static void main(String[] args) {

    System.out.println("Enter your number:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    palindrome(n);
    sc.close();
    
  }

  public static void palindrome(int n){
    if(n==reverse(n)){
      System.out.println(n+", is a Palindrome.");
    }else if(n<0||n!=reverse(n)){
      System.out.println(n+", is not a Palindrome");
    }
  }



  public static int reverse(int n){
    int reverse = 0;
    while(n>0){
      reverse = reverse*10 +n%10;
      n = n/10;

    }
    return reverse;
  }
}
