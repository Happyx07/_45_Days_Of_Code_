package _27_Day.RecursionBasics;

public class _09_CheckPalindrome {
  public static void main(String[] args) {
    String s = "madam";
    String b = "Harshit";

    System.out.println(isPalindrome(s, 0, s.length()-1));
    System.out.println(isPalindrome(b, 0, b.length()-1));


  }

  public static boolean isPalindrome(String s, int start, int end){
      if(s.equals(""))return true;

      if(start>=end){
        return true;
      }
      if(s.charAt(start)!=s.charAt(end)){
        return false;
      }

      return isPalindrome(s, start+1, end-1);

  }
}
