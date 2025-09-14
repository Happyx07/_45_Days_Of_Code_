public class _08_pattern {
  public static void main(String[] args) {
    printPattern(5);
  }

  public static void printPattern(int n) {


    for(int i = 0;i<=n;i++){

      for(int j = 0;j<n-i;j++){
        System.out.print(" ");
      }
      for(int j = 0;j<2*i-1 ;j++){
        System.out.print("*");
      }
      System.out.println();
  }
    for(int i = n;i>=1;i--){

      for(int j = 0;j<n-i;j++){
        System.out.print(" ");
      }
      for(int j = 0;j<2*i-1 ;j++){
        System.out.print("*");
      }
      System.out.println();

  }
  
}
}

