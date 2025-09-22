package _21_Day;

public class _01_Basics {

  public static void main(String[] args) {
    
    // Methods of Storing String in Java

    // 1. By creatin a Variable.
    String str = "Hello";
    System.out.println(str);

    // 2. By Creating an Char Array-- char[]

    char[] arr = {'H','a','r','s','h','i','t'};
    System.out.println(arr);                    // Prints: Harshit

    // STRING IMMUTABILITY AND MEMORY (STRING POOL);

    String s1 = "Harshit";  // new obj created in the string pool in the Heap Memory.
    String s2 = "Harshit";  // it will not create a new obj instead point to the same object created previously in the String pool.
    String s3 = new String("Harshit");

    System.out.println(s1==s2); // both the variable are pointing to the same obj this is why it is TRUE.

    System.out.println(s1==s3);



    
  }
  
}
