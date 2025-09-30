package _26_Day.RecursionMaster;

public class _04_reverseN {
  public static void main(String[] args) {
    int n = 12345;
    System.out.println("The reverse of "+n+" is "+reverse(n));
  }

  public static int reverse(int n){
    return helper(n,0);
  }

  public static int helper(int n, int ans){
    if(n==0) return ans;
    int rem = n%10;
    ans = ans*10 + rem;
    return helper(n/10, ans);
  }
}
