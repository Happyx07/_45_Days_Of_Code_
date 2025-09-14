import java.util.Scanner;

public class _05_Armstrong {

  // 1 5 3 is a armstrong number  1^3 +5^3+3^3 = 153 
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your number:");
    int n = sc.nextInt();

    armstrong(n);
    sc.close();
    
  }

  public static void armstrong(int n){
    if(n==sumOfDigits(n)){
      System.out.println(n+"is an Armstrong number.");
    }else{
      System.out.println(n+"is not an Armstrong number.");
    }
    

  }

  public static int countDigits(int n){
    int count = 0;
    while(n>0){
      n = n/10;
      count++;
    }
    return count;
  }
  public static int sumOfDigits(int n){

    int digits = countDigits(n);
    int sum = 0;
    while(n>0){
      int digit = n%10;
      sum+= Math.pow(digit,digits);
      n=n/10;
    }
    System.out.println(sum);
    return sum;

  }
}
