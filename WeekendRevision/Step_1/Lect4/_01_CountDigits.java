 package WeekendRevision.Step_1.Lect4;
 import java.util.Scanner;

class _01_CountDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter you number:");

    int n = sc.nextInt();
    int count = 0;

    while(n>0){
      n=n/10;
      count++;
    }
    System.out.println(count);

  }
}