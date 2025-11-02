package _27_Day.RecursionBasics;

public class _10_ReverseString {
  public static void main(String[] args) {
    String h = "Harshit";
    String i = "Dhakad";

    System.out.println(Reverse(i));
    System.out.println(Reverse(h));


  }

  public static String Reverse(String s){

    if(s.length()<=1)return s;

    return s.charAt(s.length()-1)+Reverse(s.substring(0,s.length()-1));

  }
}
