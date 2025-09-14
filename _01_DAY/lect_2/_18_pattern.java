public class _18_pattern {
  public static void main(String[] args) {
    printPattern(5);

  }
  public static void printPattern(int n){
    for(int i = n;i>=1;i--){
      System.out.println();
      for(int j = 1;j<=i;j++){
        System.out.print("*");
      }
      for(int k = 0;k<2*(n-i);k++){
        System.out.print(" ");
      }
      for(int k = 0;k<i;k++){
        System.out.print("*");
      }
      
      
    }
    for(int i = 0;i<=n;i++){
      for(int j = 0;j<i;j++){
        System.out.print("*");
      }
      for(int k = 0;k<2*(n-i);k++){
        System.out.print(" ");
      }
      for(int k = 0;k<i;k++){
        System.out.print("*");
      }
      System.out.println();
      
    }
  }
}
