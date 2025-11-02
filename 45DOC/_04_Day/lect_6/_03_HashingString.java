public class _03_HashingString {
  public static void main(String[] args) {

    String s = "abcdabefc";
    

    char[] q = {'a','c','z'};

    freq(s, q);
    
  }

  public static void freq(String s, char[] q ){

     int[] freq = new int[26];

    for(int i = 0;i<s.length();i++){
      freq[s.charAt(i)-'a']++;
    }

    for(int i = 0;i<q.length;i++){
      System.out.println("The frequency of "+q[i]+" is "+freq[q[i]-'a']);
    }

  }
}
