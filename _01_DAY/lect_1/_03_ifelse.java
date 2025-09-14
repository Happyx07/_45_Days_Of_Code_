import java.util.Scanner;
public class _03_ifelse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Age:");
    int age = sc.nextInt();         // we have to use sc.nextLine(); afte nextInt to kill the next line character 
    sc.nextLine();
    System.out.println("Enter Your Name:");
    String name = sc.nextLine();

    if(age>18) {
      System.out.println("You are an Adult and are eligible to cast vote.");
    }else{
      System.out.println("You are a kid and you are not eligible to cast vote.");
    }

    System.out.println("Hello! "+ name + "you are "+age+" years old.");
    sc.close();
  }
}
