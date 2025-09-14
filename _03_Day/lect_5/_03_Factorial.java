import java.util.Scanner;

public class _03_Factorial {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value of N:");
    int n = sc.nextInt();
    fact(n);

    System.out.println("Factorial of "+n+" is "+fact(n));
    sc.close();
    
  }

  public static int fact(int n){
    if(n==0){
      return 1;
    }
    return n*fact(n-1);
  }
  
}
