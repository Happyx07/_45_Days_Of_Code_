import java.util.Scanner;

public class _02_ReverseNumber {
  public static void main(String[] args) {
    System.out.println("Enter your number:");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    reverse(number);
    sc.close();
  }

  public static void reverse(int n){
    int reverse = 0;
    while(n>0){
      reverse = reverse*10 +n%10;
      n = n/10;
    }
    System.out.println(reverse);
  }
}
