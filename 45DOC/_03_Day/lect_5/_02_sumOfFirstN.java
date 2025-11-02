public class _02_sumOfFirstN {

  public static void main(String[] args) {
    int result = sumOfFirstN(5);
    System.out.println("Sum of first 5 natural numbers is: " + result);
  }

  public static int sumOfFirstN(int n) {
    if (n == 0) {
      return 0;
    }
    return n + sumOfFirstN(n - 1);
  }
}
