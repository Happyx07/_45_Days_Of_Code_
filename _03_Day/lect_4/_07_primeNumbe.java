import java.util.Scanner;

public class _07_primeNumbe {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter you number:");
    int n = sc.nextInt();
    checkPrime(n);
    sc.close();
  }

  public static void checkPrime(int n){
    boolean isPrime = true;
    if(n==1||n==0){
      System.out.println(n+"is not a Prime number.");
      isPrime = false;
    }else{
      for(int i = 2;i<n;i++){
        if(n%i==0){
          System.out.println(n+"is not a Prime number.");
          isPrime = false;
          break;
        }
        
      }
      

    }

    if(isPrime){
      System.out.println(n+" is a Prime number.");
    }
    
  }
}
