import java.util.Scanner;

public class _06_printAllDivisors {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number:");
    int n = sc.nextInt();
    printAllDivisors(n);
    sc.close();
  }

  public static void printAllDivisors(int n){
    int sqrtN = (int) Math.sqrt(n);
    for(int i = 1;i<sqrtN;i++){
      if(n%i==0){
        System.out.print(i+" ");
      }
    }
  }
}