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

    System.out.println(s1==s3); // FALSE - different objects (one in pool, one in heap)
    
    System.out.println(s1.equals(s3)); // TRUE - same content
    
    // 🎯 EXCELLENT! You're understanding string pool concepts!
    
    // Let's compare with other array types
    int[] numbers = {1, 2, 3, 4};
    System.out.println(numbers);                // Prints: [I@hashcode
    
    String[] words = {"Hello", "World"};
    System.out.println(words);                  // Prints: [Ljava.lang.String;@hashcode
    
    // To print other arrays properly, we need Arrays.toString()
    System.out.println(java.util.Arrays.toString(numbers));  // Prints: [1, 2, 3, 4]
    System.out.println(java.util.Arrays.toString(words));    // Prints: [Hello, World]
    
    // Converting char[] to String
    String name = new String(arr);              // Convert char[] to String
    System.out.println("Name: " + name);       // Prints: Name: Harshit
    
    // 🎯 STRING METHODS CHALLENGE
    System.out.println("\n=== STRING METHODS PRACTICE ===");
    
    String text = "Programming";
    System.out.println("Length: " + text.length());          // 11
    System.out.println("Character at index 4: " + text.charAt(4)); // 'r'
    System.out.println("Substring from index 4: " + text.substring(4)); // "ramming"
    System.out.println("Index of 'gram': " + text.indexOf("gram")); // 3
    
    // 🎯 YOUR CHALLENGE: COUNT VOWELS 
    System.out.println("\n=== VOWEL COUNTING CHALLENGE ===");
    String sentence = "Programming is Fun";
    //
    // Expected output: 6 vowels
    // Hint: Use charAt() and length() in a loop
    int vowelCount= 0;

    for(char c:sentence.toCharArray()){
      if("aeiou".indexOf(c)!=-1){
        vowelCount++;
      }
    }




    System.out.println("Vowels found" + vowelCount);



    
  }
  
}
