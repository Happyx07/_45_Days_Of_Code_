import java.util.Scanner;

public class _04_GCD {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter first number :");
    int a = sc.nextInt(); 
    System.out.println("Enter second number :");
    int b = sc.nextInt();

    System.out.println("The GCD or HCF of givern numbers is "+ gcd(a, b));
    sc.close();

  }

  public static int gcd(int a, int b){
    int s = Math.min(a, b);
    int l = Math.max(a, b);
    int temp = 0;
    while(l%s!=0){
      temp = s;
      s = l%s;
      l = temp;
    }
    return s ;
  }
}
