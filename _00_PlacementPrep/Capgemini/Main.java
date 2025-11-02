import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int v = sc.nextInt();
    int a = sc.nextInt();
    int t = sc.nextInt();

    int u;

    u = v - a * t;

    System.out.println(u);
  }
}
