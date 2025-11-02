public class _05_ArrayString {
  public static void main(String[] args) {
    //Array is a collection of similar data types which stores the values in contiguous memory locations

    // different ways of initializing arrays and accessing elements

    int[] ages = new int[5]; //declaration and instantiation

    ages[0] = 25; //initializing elements
    ages[1] = 30;
    ages[2] = 35;
    ages[3] = 40;
    ages[4] = 45;

    int[] numbers = {1, 2, 3, 4, 5};// array initialization( declaration + instantiation)
    String[] names = {"Alice", "Bob", "Charlie"};



    //Accessing array elements
    System.out.println("First number: " + numbers[0]);
    System.out.println("Second age: " + ages[1]);
    System.out.println("Second name: " + names[1]);


    String a = "hello";// it is stored in the string pool mean it is immutable
    String b = "hello"; // it is also stored in the string pool and refers to the same object as 'a'

    System.out.println("String a: " + a);
    System.out.println("String b: " + b);

    System.out.println("Are both strings equal? " + (a == b));
    System.out.println("Are both strings equal? " + a.equals(b));
    String c = new String("hello"); // it is stored in the heap memory mean it is mutable
    System.out.println("String c: " + c);
  }
}
