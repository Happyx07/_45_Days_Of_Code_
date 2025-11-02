public class _15_pattern {
  public static void main(String[] args) {
    printPattern(5);
  }

  public static void printPattern(int n){
    char a = 'A';
    for(int i = 0;i<n;i++){
      for(int j = 0;j<=i;j++){
        System.out.print(a);
        
      }
      System.out.println();
      a++;
    }
  }
}
