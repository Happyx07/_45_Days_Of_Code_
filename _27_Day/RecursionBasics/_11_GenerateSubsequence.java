package _27_Day.RecursionBasics;


import java.util.*;

public class _11_GenerateSubsequence {
  public static void main(String[] args) {
    

    String s = "abc";
    subsequences(s, 0, "");


  }

  public static void subsequences(String s, int index, String current){
    if(index == s.length()){
      System.out.println(current);
      return;
    }
    subsequences(s, index+1, current);
    subsequences(s, index+1, current + s.charAt(index));
  }

  
  
}
