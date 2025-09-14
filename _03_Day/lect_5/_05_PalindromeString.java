public class _05_PalindromeString {

  public static void main(String[] args) {
    String s = "abcdcba";// paliindrome string

    
    int start = 0;
    int end = s.length()-1;
    char[] reverse = reverse(s.toCharArray(), start, end);
    reverse.toString();
    System.out.println(reverse);
    System.out.println(s);
    if(s.equals(new String(reverse))){
      System.out.println("the String is a Palindrome:");
    }else{
      System.out.println("The String is not a palindrome:");
    }
    
  }

  public static char[] reverse(char[] s,int start, int end){
    if(start<end){
      char temp = s[start];
      s[start] = s[end];
      s[end] =temp;
      reverse(s, start+1, end-1);

    }
    return s;

  }
}