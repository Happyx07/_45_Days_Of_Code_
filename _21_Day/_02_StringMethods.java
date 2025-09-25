package _21_Day;

public class _02_StringMethods {
  public static void main(String[] args) {
    String h  = " Harshit ";

    int  sLen = h.length();

    System.out.println(sLen);// printing the length of the string
    System.out.println(h.charAt(5));// returning the char at index
    System.out.println(h.toCharArray());
    char[] arr = h.toCharArray();
    System.out.println(arr);
    System.out.println(h);

  //-------------------------------------------
  // IMPORTANT SUBSTRING METHODS
  //  String str = "Java Programming";
  //  String sub1 = str.substring(5);// substring starting from given index to the end.
  //  String sub2 = str.substring(5, 12);
  //  int idx1 = str.indexOf('J');
  //  int idx2 = str.indexOf('g');
  //  int idx3 = str.lastIndexOf('g');

   // SEARCH AND CHECK OPERATIONS

   

  //  System.out.println(h.contains("Harsh"));
  //  System.out.println(h.startsWith("Har"));
  //  System.out.println(h.endsWith("sh"));
  //  System.out.println(h.isEmpty());
  //  System.out.println(h.toUpperCase());
  //  System.out.println(h.toLowerCase());
  //  System.out.println(h.trim());


  // // SPLIT AND REPLACE METHODS-----

  // String[] parts = str.split(" ");

  // for(String p:parts){
  //   System.out.println(p);
  // }

  // System.out.println(str.replaceAll("a", "i"));






  //  System.out.println(sub1);
  //  System.out.println(sub2);
  //  System.out.println(idx1);
  //  System.out.println(idx2);
  //  System.out.println(idx3);



  }
  
}
