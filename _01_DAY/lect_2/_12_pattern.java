

public class _12_pattern {
  public static void main(String[] args) {
    printPattern(5);
  }

  public static void printPattern(int n){
    int k = 1;
    for(int i =0;i<=n;i++){
      for(int j = 0;j<i;j++){
        System.out.print(" "+k);
        k++;

      }
      System.out.println();
    }
  }
}
