package _22_Day.BasicStringsPractice;

import java.util.Scanner;

public class String1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your  1st String:");
    String input1 = sc.nextLine();
    sc.close();

//==================================================
// Problem #30: Validate IPv4 Address
String[] segments = input1.split("\\.");


boolean valid = false;
if(segments.length==4){
   valid = true;
  for(int i = 0;i<4;i++){
    try {
      int segment = Integer.parseInt(segments[i].trim());
      if(segment>=0 && segment<256){
      continue;
    }else{
      valid = false;
      break;
    }
      
    } catch (Exception e) {
  
      valid = false;
      break;
    }
    
    
  }
}

System.out.println(valid);







//=============================================
// Problem #29: Check String Rotation
// System.out.println("Enter the 2nd String:");
// String input2  = sc.nextLine();

// String d = input1.concat(input1);
// System.out.println(d.contains(input2));

//===========================================
// Problem #28: Simple String Compression

// StringBuilder result = new StringBuilder();

// int count = 1;
// for(int i = 1;i<input1.length();i++){
//   if(input1.charAt(i)==(input1.charAt(i-1))){
//     count++;
//   }else{
//     result.append(input1.charAt(i-1));
//     result.append(count);
//     count = 1;
//   }
// }


// System.out.println(result);







//=========================================
// Problem #27: Basic String Formatting

// String formated = String.format("My name is %s", input1);

// %s is used for strings
// %d is used for integers 

// System.out.println(formated);





//=========================================
// Problem #26: Capitalize Words


// String[] words = input1.split(" ");

// StringBuilder result = new StringBuilder();

// for(String word: words){
//     if(word.length()>0){
//       result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
//     }
// }


// System.out.println(result.toString().trim());

//=============================================

//Problem #25: Check for Only Digits

// boolean ans = true;

// for(char c: input1.toCharArray()){
//   if(Character.isDigit(c)){
//     continue;
//   }else{
//     ans = false;
//     break;
//   }
// }


// System.out.println(ans);






//=============================================
// Problem #24: Remove Duplicate Characters

// StringBuilder result = new StringBuilder();
// HashSet<Character> h = new HashSet<>();

// for(char c: input1.toCharArray()){
//   if(h.add(c)){ // return false if the character already exists in the set...
//     result.append(c);
//   }
// }

// System.out.println(result);

//==========================================
// Problem #23: Find Most Frequent Character

// int[] freq = new int[256];

// for(int i = 0;i<input1.length();i++){
//   freq[input1.charAt(i)]++;
// }

// int maxfreq = 0;
// char mostFreq = ' ';

// for(int i = 0;i<freq.length;i++){
//   if(freq[i]>maxfreq){
//     maxfreq = freq[i];
//     mostFreq = (char)i;
//   }
// }

//         System.out.println("Most frequent character: " + mostFreq);
//         System.out.println("Frequency: " + maxfreq);



//============================================


// System.out.println("Enter your character to check Occurence :");
// char inp = sc.next().charAt(0);

// char[] str = input1.toCharArray();
// int count = 0;

// for(int i = 0;i<str.length;i++){
//   if(str[i]== inp){
//     count++;
//   }
// }

// System.out.println(count);


//============================================
// Problem #21: Anagram Check

// char[] ch1 = input1.toCharArray();

// System.out.println("Enter 2nd String :");
// String input2 = sc.nextLine();

// char[] ch2 = input2.toCharArray();

// Arrays.sort(ch1);
// Arrays.sort(ch2);

// for(int i = 0;i<ch1.length;i++){
//   if(ch1[i]==ch2[i]){
//     continue;
//   }else{
//     System.out.println("false");
//   }
// }
// System.out.println("true");







//============================================
// Problem #20: Palindrome Check
// StringBuilder sb = new StringBuilder(input1);
// StringBuilder reverse = new StringBuilder(sb.reverse());

// System.out.println(sb.equals(reverse));




//============================================
//  Problem #19: Delete from a String


// StringBuilder sb = new StringBuilder(input1);

// System.out.println(sb.delete(4,sb.length()));

//============================================

// Problem #18: Insert into a String

// StringBuilder sb = new StringBuilder(input1);

// System.out.println(sb.insert(7," is"));

//============================================

// Problem #17: Reverse a String

// StringBuilder sb = new StringBuilder(input1);

// System.out.println(sb.reverse());

//============================================
   // problem #16 
// String[] s = input1.split(" ");

// StringBuilder sb = new StringBuilder();
// for(String i : s){
//    sb.append(i+" ");
//    }
// System.out.println(sb);
//============================================
//Problem #15: Splitting a Sentence

// String[] s = input1.split(" ");

// for(String i : s){
//   System.out.println(i);
// }


//============================================

// Problem #14: String to Character Array

// char[] ch = input1.toCharArray();

// for(char c: ch){
//   System.out.print(c+" ");
// }



//============================================


//Problem #13: Character Replacement

// System.out.println(input1.replace("it","iiiiiiitttttttt"));




//=========================================

//Problem #12: Trim Whitespace

//  System.out.println(input1.trim());


//==========================================

//Problem #11: Convert to Lowercase

// System.out.println(input1.toLowerCase());





//---------------------------------------    

    // #10: Extract a Suffix

    // int n = 5;

    // System.out.println(input1.substring(input1.length()-n));

    


//---------------------------------------------    

//   Problem #9: Extract a Prefix

    // System.out.println(input1.substring(0,5));


//----------------------------------------------
    // Problem #8: Check for Substring Presence

    // String sub = "Harsh";

    // System.out.println(input1.contains(sub));


     // Problem #7: Find First Substring

    // String sub = "Harsh";

    // System.out.println(input1.indexOf(sub));

    // 










    // //Problem #1: Find String Length
    //  int len = input1.length();
    //  System.out.println("The length of the given string is: "+len);

    //Problem #2: Access Nth Character
    // System.out.println("Enter the index of character you want from the string:");
    // int n = sc.nextInt();
    // sc.nextLine();
    // System.out.println(input.charAt(n));

    // Problem #3: Print All Characters
    // for(int i = 0;i<len;i++){
    //     System.out.println(input.charAt(i));
    // }

    // //Problem #4: Exact Match Check
      // System.out.println("Enter your 2nd String: ");
      // String input2 = sc.nextLine();

    //   System.out.println(input.equals(input2));
    


    // Problem #6: Lexicographical Comparison

    // System.out.println(input1.compareTo(input2));


   












    
  }
}
