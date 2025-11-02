public class _19_Butterfly {
  public static void main(String[] args) {
    printPattern(5);
  }

  public static void printPattern(int n){
    for(int i = 0;i<=n;i++){
      for(int j = 0;j<i;j++){
        System.out.print("*");
      }
      for(int k = 0;k<n-i;k++){
        System.out.print(" ");
        System.out.print(" ");
      }
      for(int j = 0;j<i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
    for(int i = n-1;i>0;i--){
      for(int j = 0;j<i;j++){
        System.out.print("*");
      }
      for(int k = 0;k<n-i;k++){
        System.out.print(" ");
        System.out.print(" ");
      }
      for(int j = 0;j<i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
